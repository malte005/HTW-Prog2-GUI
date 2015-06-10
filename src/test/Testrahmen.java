package test;

import model.kunde.AKunde;
import util.KundenNummerVergeber;
import control.Kundenverwaltung;
import java.util.Collections;
import java.util.Random;
import model.kunde.Adresse;
import model.kunde.Endverbraucher;
import model.kunde.GesellschaftMitLiz;
import model.kunde.Grossverbraucher;

/**
 * In dieser Klasse wird das Userinterface umgesetzt.
 * Das System wird anhand von User-Eingaben getestet.
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
 * @version 0.9
 *
 */
public class Testrahmen {

    KundenNummerVergeber knv = KundenNummerVergeber.getInstance();
    Kundenverwaltung kv = new Kundenverwaltung();

    /**
     * Diese Methode wildet den Kern der User-Intraktion ab.
     *
     * @throws Exception
     */
    public void start() throws Exception {

        Eingabe.init();
        boolean weiter = true;

        System.out.println("Hallo, du hast folgende Auswahlmöglichkeiten:");

        do {
            System.out.println("\t(1) Einen neuen Endverbraucher anlegen");
            System.out.println("\t(2) Einen neuen Großverbracuher anlegen");
            System.out.println("\t(3) Eine neue Gesellschaft mit Lizenzvertrieb anlegen");
            System.out.println("\t(4) Bestimmte Anzahl Kunden automatisch anlegen");
            System.out.println("\t(5) Die Kundenliste nach Kundennummer sortiert ausgeben");
            System.out.println("\t(6) Programm beenden");

            switch (Eingabe.liesMenu()) {
                case 1:
                    createEndverbraucher();
                    break;
                case 2:
                    createGroßverbraucher();
                    break;
                case 3:
                    createGesellschaft();
                    break;
                case 4:
                    createKunden();
                    break;
                case 5:
                    Collections.sort(kv.getListe(), new Kundenverwaltung());
                    for (Object item : kv.getListe()) {
                        System.out.println(String.valueOf(item));
                    }
                    break;
                case 6:
                    weiter = false;
                    break;
                default:
                    System.err.println("Zahlen sind von 1-6 gültig.");
                    break;
            }
        } while (weiter);

        System.out.println("Programm beendet...");
    }

    /**
     * Handelt das manuelle anlegen eines Endverbrauchers.
     *
     * @throws Exception
     */
    private void createEndverbraucher() throws Exception {
        AKunde e1 = Eingabe.liesEndverbraucher();
        e1.setNummer(knv.getKundennummer());
        kv.neuEndverbraucher(e1);
        System.out.println("Ein Endverbracuher wurde gespeichert.");
    }

    /**
     * Handelt das manuelle anlegen eines Großverbrauchers.
     *
     * @throws Exception
     */
    private void createGroßverbraucher() throws Exception {
        AKunde g1 = Eingabe.liesGrossverbraucher();
        g1.setNummer(knv.getKundennummer());
        kv.neuGrossverbraucher(g1);
        System.out.println("Ein Großverbraucher wurde gespeichert.");
    }

    /**
     * Handelt das manuelle anlegen einer Gesellschaft.
     *
     * @throws Exception
     */
    private void createGesellschaft() throws Exception {
        AKunde ge1 = Eingabe.liesGesellschaft();
        ge1.setNummer(knv.getKundennummer());
        kv.neuGesellschaftMitLiz(ge1);
        System.out.println("Eine Gesellschaft wurde gespeichert.");
    }

    /**
     * Erzeugt eine gewünscht Anzahl von Zufalls-Kunden.
     *
     * @throws Exception
     */
    private void createKunden() throws Exception {
        System.out.println("Anzahl der Kunden eingeben");
        int anzahl = Eingabe.liesAnzahl();
        Random ran = new Random();

        for (int i = 0; i < anzahl; i++) {
            AKunde temp;

            switch ((int) Math.floor((Math.random() * 3) + 1)) {
                // Endverbraucher
                case 1:
                    temp = new Endverbraucher(new Adresse(i + 1 + ". Endverbraucher", "Hamburger Straße " + (int) Math.floor((Math.random() * 100) + 1), "10243", "Berlin"), 0, true);
                    temp.setNummer(knv.getKundennummer());
                    kv.neuEndverbraucher(temp);
                    break;
                // Großverbraucher
                case 2:
                    temp = new Grossverbraucher(new Adresse(i + 1 + ". Großverbraucher", "Hamburger Straße " + (int) Math.floor((Math.random() * 100) + 1), "10243", "Berlin"), 5, (int) Math.floor((Math.random() * 100) + 1));
                    temp.setNummer(knv.getKundennummer());
                    kv.neuGrossverbraucher(temp);
                    break;
                // Gesellschaft
                case 3:
                    temp = new GesellschaftMitLiz(new Adresse(i + 1 + ". Gesellschaft", "Hamburger Straße " + (int) Math.floor((Math.random() * 100) + 1), "10243", "Berlin"), 7, (int) Math.floor((Math.random() * 100) + 1));
                    temp.setNummer(knv.getKundennummer());
                    kv.neuGesellschaftMitLiz(temp);
                    break;
                default:
                    System.err.println("Falsche Zufallszahl");
                    break;
            }

        }
        System.out.println("Es wurden " + anzahl + " Kunden angelegt.\n");
    }

}
