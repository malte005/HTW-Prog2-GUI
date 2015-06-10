package util;

import control.Kundenverwaltung;
import java.util.Random;

/**
 * Diese Klasse erzeugt eine eindeutige Kundennummer für jeden Kunden.
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
 * @version 0.5
 *
 */
public class KundenNummerVergeber {

    private String kundennummer;
    private Kundenverwaltung kv;
    private static KundenNummerVergeber instance = null;

    /**
     * Singelton Pattern
     *
     * @return Instanz-Objekt von KundenNummerVergeber, indem der private
     *         Konstuktor aufgerufen wird.
     */
    public static KundenNummerVergeber getInstance() {
        if (instance == null) {
            instance = new KundenNummerVergeber();
        } else {
            System.err.println("Es gibt schon ein Objekt KundnenNummerVergeber");
        }
        return instance;
    }

    /**
     * Konstruktor
     *
     * @return Objekt von KundenNummerVergeber wird zurückgegeben.
     */
    private KundenNummerVergeber() {
    }

    /**
     * Erzeugt eine neue Kundennummer für den Kunden.
     *
     * @return Die 9-Stellige Kundennummer wird zurückgegeben.
     */
    public String getKundennummer() {
        kv = new Kundenverwaltung();

        do {
            kundennummer = erzeugeZufallsString();
        } while (kv.isKNrAvailable(kundennummer));

        return kundennummer;
    }

    /**
     * Erzeugt einen Zufallsstring der die Kundennummer wiederspiegelt.
     *
     * @return Die zufällige Kundennummer wird zurückgegebn.
     */
    private String erzeugeZufallsString() {
        String erg = "";

        for (int i = 0; i < 3; i++) {
            erg += erzeugeZufallsLower();
        }

        for (int i = 0; i < 3; i++) {
            erg += erzeugeZufallsZahlen();
        }

        for (int i = 0; i < 3; i++) {
            erg += erzeugeZufallsUpper();
        }

        return erg;
    }

    /**
     * Erzeugt für die Kundennummer die Kleinbuchstaben.
     *
     * @return Ein zufälliger Kleinbuchstabe wird zurückgegeben.
     */
    private char erzeugeZufallsLower() {
        Random rand = new Random();
        int temp = rand.nextInt(26); //Weil es 26 Buchstaben gibt.

        return (char) (temp + 97); //Die Kleinbuchstaben beginnen bei 97.

    }

    /**
     * Erzeugt für die Kundennummer die Großbuchstaben.
     *
     * @return Ein zufälliger Großbuchstabe wird zurückgegeben.
     */
    private char erzeugeZufallsUpper() {
        Random rand = new Random();
        int temp = rand.nextInt(26); //Weil es 26 Buchstaben gibt.

        return (char) (temp + 65); //Die Großbuchstaben beginnen bei 65;
    }

    /**
     * Erzeugt für die Kundennummer die Zahlen.
     *
     * @return Eine zufällige Zahl zwischen 0 und 9 wird zurückgegeben.
     */
    private char erzeugeZufallsZahlen() {
        Random rand = new Random();
        int temp = rand.nextInt(10); //Weil es 10 einstellige Zahlen gibt.

        return (char) (temp + 48); //Die Zahlen beginnen bei 48;
    }

}
