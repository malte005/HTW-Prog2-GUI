package test;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.kunde.AKunde;
import model.kunde.Adresse;
import model.kunde.Endverbraucher;
import model.kunde.GesellschaftMitLiz;
import model.kunde.Grossverbraucher;

/**
 * Diese Klasse handelt das Einlesen eines Kunden durch den Benutzer.
 *
 * @author Malte Dammann
 * E-Mail: s0549309@htw-berlin.de
 * Bearbeitungszeitraum: 05.05.15 - 23.05.2015
 *
 * Modul: Programmierung 2
 *
 * Dateiname: Engine.java
 * IDE: NetBeans IDE 8.0.2
 * Java: 1.8.0_20; Java HotSpot(TM) 64-Bit
 *
 * @since 2015-05-05
 * @version 0.2
 *
 */
public abstract class Eingabe {

    static Scanner scanner;

    /**
     * Initialisierung des Scanners.
     */
    public static void init() {
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
    }

    /**
     * Liest den Kunden als Endvertraucher ein.
     *
     * @return Ein AKunde-Objekt mmit den eingegebenen Werten (Anschrift, Geschlecht, Größe, Gewicht) wird zurückgegeben.
     *
     * @throws Exception
     */
    public static AKunde liesEndverbraucher() throws Exception {
        System.out.println("Daten zum Endverbraucher werden erfasst...");

        AKunde kunde;
        double rabatt;
        boolean boni;
        Adresse anschrift = liesAdresse();

        try {
            System.out.println("Achtung, der Standard-Rabatt beträgt 0%.Rabatt eingeben:");
            rabatt = liesRabatt();

            System.out.println("Bonität? (ja/nein)");
            boni = liesBoni();

            kunde = new Endverbraucher(anschrift, rabatt, boni);
            scanner.next();
        } catch (IllegalStateException | InputMismatchException e) {
            scanner.next();
            throw new Exception("Eingabefehler...", e.getCause());
        }

        return kunde;
    }

    /**
     * Liest den Kunden als Großverbraucher ein.
     *
     * @return Ein AKunde-Objekt mmit den eingegebenen Werten (Anschrift, Rabatt, Status) wird zurückgegeben.
     *
     * @throws Exception
     */
    public static AKunde liesGrossverbraucher() throws Exception {
        System.out.println("Daten zum Großverbraucher werden erfasst...");

        AKunde kunde;
        double rabatt;
        int status;
        Adresse anschrift = liesAdresse();

        try {
            System.out.println("Achtung, der Standard-Rabatt beträgt 5%. Rabatt eingeben:");
            rabatt = liesRabatt();

            System.out.println("Status eingeben:");
            status = liesStatusOderVertrieb();

            kunde = new Grossverbraucher(anschrift, rabatt, status);

        } catch (IllegalStateException | InputMismatchException e) {
            scanner.next();
            throw new Exception("Eingabefehler...");
        }

        return kunde;
    }

    /**
     * Liest den Kunden als Gesellschaft mit Lizenzvertrieb ein.
     *
     * @return Ein AKunde-Objekt mmit den eingegebenen Werten (Anschrift, Rabatt, Vertrieb) wird zurückgegeben.
     *
     * @throws Exception
     */
    public static AKunde liesGesellschaft() throws Exception {
        System.out.println("Daten zur Gesellschft mit Lizenzvertrieb werden erfasst...");

        AKunde kunde;
        double rabatt;
        int vertrieb;
        Adresse anschrift = liesAdresse();

        try {
            System.out.println("Achtung, der Standard-Rabatt beträgt 7%. Rabatt eingeben:");
            rabatt = liesRabatt();

            System.out.println("Vertrieb eingeben:");
            vertrieb = liesStatusOderVertrieb();

            kunde = new GesellschaftMitLiz(anschrift, rabatt, vertrieb);

        } catch (IllegalStateException | InputMismatchException e) {
            scanner.next();
            throw new Exception("Eingabefehler...");
        }

        return kunde;
    }

    /**
     * Liest die Adresse der Kunden ein.
     *
     * @return Ein Adresse-Objekt mit den eingegebenen Werten (Name, Straße+HNr, PLZ, Ort) wird zurückgegeben.
     *
     * @throws Exception
     */
    private static Adresse liesAdresse() throws Exception {
        Adresse anschrift;
        boolean plz_ok = false;
        String plz;

        try {
            System.out.println("Kundennamen eingaben:");
            String name = scanner.next();

            System.out.println("Straße und Hausnummer eingeben:");
            String str_hnr = scanner.next();

            System.out.println("Postleitzahl eingaben:");
            do {
                plz = scanner.next();
                if (plz.length() == 6) {
                    plz_ok = true;
                } else {
                    System.err.println("Bitte eine 6-stellige PLZ eingeben.");
                }
            } while (!plz_ok);

            System.out.println("Ort eingaben:");
            String ort = scanner.next();

            anschrift = new Adresse(name, str_hnr, plz, ort);

        } catch (IllegalStateException | InputMismatchException e) {
            scanner.next();
            throw new Exception("Eingabefehler...");
        }

        return anschrift;
    }

    /**
     * Liest die Usereingabe für den Rabatt ein.
     *
     * @return Die eingegebene duale Zahl wird zurückgegeben.
     */
    private static Double liesRabatt() {
        double rabatt = 0.0;
        boolean eingabeFehler = true;
        // Schleife für Eingabefehler des Rabatts
        do {
            if (scanner.hasNextDouble()) {
                rabatt = scanner.nextDouble();
                if (rabatt >= 0 && rabatt <= 100) {
                    eingabeFehler = false;
                } else {
                    eingabeFehler = true;
                    System.err.println("Bitte einen Rabatt von 0 bis 100 eingeben.");
                }
            } else {
                System.err.println("Bitte eine Gleitkommazahl von 0-100 eingeben.");
                eingabeFehler = true;
                scanner.next();
            }
        } while (eingabeFehler);

        return rabatt;
    }

    /**
     * Liest die Usereingabe für den Status oder die Vertriebszahl.
     *
     * @return Die eingegebene ganze Zahl wird zurückgegeben.
     */
    private static int liesStatusOderVertrieb() {
        int value = 0;
        boolean eingabeFehler;
        // Schleife für Eingabefehler des Status/Vertrieb
        do {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                eingabeFehler = false;
            } else {
                System.err.println("Bitte eine ganze Zahl eingeben.");
                eingabeFehler = true;
                scanner.next();
            }

        } while (eingabeFehler);

        return value;
    }

    /**
     * Liest die Usereingabe für die Bonität ein.
     *
     * @return Ob der Kunde eine Bonität hat.
     */
    private static boolean liesBoni() {
        boolean boni = true, eingabeFehler = true;
        // Schleife für Eingabefehler der Bonität
        do {
            if (scanner.hasNext("ja")) {
                boni = true;
                eingabeFehler = false;
            } else if (scanner.hasNext("nein")) {
                boni = false;
                eingabeFehler = false;
            } else {
                System.err.println("Bitte 'ja' oder 'nein' eingeben.");
                eingabeFehler = true;
                scanner.next();
            }

        } while (eingabeFehler);

        return boni;
    }

    /**
     * Liest die Usereingabe für das Menü ein.
     *
     * @return Die eingegebene ganze Zahl wird zurückgegeben.
     */
    public static int liesMenu() {
        int value = 0;
        boolean eingabeFehler;
        // Schleife für Eingabefehler der Menüeingabe
        do {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value < 7 && value > 0) {
                    eingabeFehler = false;
                } else {
                    eingabeFehler = true;
                    System.err.println("Bitte eine korrekte Zahl angeben");
                }
            } else {
                System.err.println("Bitte eine ganze Zahl eingeben.");
                eingabeFehler = true;
                scanner.next();
            }

        } while (eingabeFehler);

        return value;
    }

    /**
     * Liest die Usereingabe für die Anzahl der zu erzeugenden Kunden.
     *
     * @return Die eingegebene ganze Zahl wird zurückgegebn.
     */
    public static int liesAnzahl() {
        int value = 0;
        boolean eingabeFehler;
        // Schleife für Eingabefehler der Anzahl
        do {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0) {
                    eingabeFehler = false;
                } else {
                    eingabeFehler = true;
                    System.err.println("Bitte eine Zahl größer 0 eigeben");
                }
            } else {
                System.err.println("Bitte eine ganze Zahl eingeben.");
                eingabeFehler = true;
                scanner.next();
            }

        } while (eingabeFehler);

        return value;
    }

}
