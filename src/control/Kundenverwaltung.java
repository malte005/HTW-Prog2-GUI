package control;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import model.kunde.AKunde;
import model.kunde.Adresse;
import model.kunde.Endverbraucher;
import model.kunde.GesellschaftMitLiz;
import model.kunde.Grossverbraucher;
import util.KundenNummerVergeber;

/**
 * Diese Klasse verwaltet die Kunden.
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
 * @version 0.8
 *
 */
public class Kundenverwaltung implements Comparator<AKunde> {

    private final LinkedList<AKunde> KUNDENLISTE = new LinkedList<>();
    private static Kundenverwaltung instance = null;

    /**
     * Singelton Pattern
     *
     * @return Instanz-Objekt von KundenNummerVergeber, indem der private
     *         Konstuktor aufgerufen wird.
     */
    public static Kundenverwaltung getInstance() {
        if (instance == null) {
            instance = new Kundenverwaltung();
        } else {
            System.err.println("Es gibt schon ein Objekt KundnenNummerVergeber");
        }
        return instance;
    }

    /**
     * Konstruktor
     */
    public Kundenverwaltung() {
    }

    /**
     * Fügt ein Kunden-Objekt zur Kunden-Liste hinzu.
     *
     * @param kunde Kundenobjekt wird übergeben
     */
    private void addKunde(AKunde kunde) {
        KUNDENLISTE.add(kunde);
    }

    /**
     * Löscht das gewünschte Kundenobjekt aus der Liste.
     *
     * @param kunde Kundenobjekt wird übergeben
     */
    public void removeKunde(AKunde kunde) {
        KUNDENLISTE.remove(kunde);
    }

    /**
     * Legt einen Großverbraucher an, speichert ihn in der Kundenliste ab und
     * gibt ein AKundenobjekt zurück.
     *
     * @param kunde AKunde-Objekt wird übergeben
     */
    public void neuGrossverbraucher(AKunde kunde) {
        addKunde(kunde);
    }

    /**
     * Legt einen Endverbracuher an, speichert ihn in der Kundenliste ab und
     * gibt ein AKundenobjekt zurück.
     *
     * @param kunde AKunde-Objekt wird übergeben
     */
    public void neuEndverbraucher(AKunde kunde) {
        addKunde(kunde);
    }

    /**
     * Legt einen Gesellschafter an, speichert ihn in der Kundenliste ab und
     * gibt ein AKundenobjekt zurück.
     *
     * @param kunde AKunde-Objekt wird übergeben
     */
    public void neuGesellschaftMitLiz(AKunde kunde) {
        addKunde(kunde);
    }

    /**
     * Guckt ob Kundennummer schon in der Kundenliste vorhanden ist.
     *
     * @param kNr Kundennummer wird als String übergeben
     *
     * @return Ob Kundennummer noch nicht vergeben wurde.
     */
    public boolean isKNrAvailable(String kNr) {
        boolean result = false;

        for (AKunde kunde : KUNDENLISTE) {
            if (!kunde.getNummer().equals(kNr)) {
                result = true;
            }
        }

        return result;
    }

    /**
     *
     * @return Die Kundenliste wird zurückgegeben.
     */
    public LinkedList<AKunde> getListe() {
        return KUNDENLISTE;
    }

    public void testCreateKunden() throws Exception {
        KundenNummerVergeber knv = KundenNummerVergeber.getInstance();
        int anzahl = 2;
        Random ran = new Random();

        for (int i = 0; i < anzahl; i++) {
            AKunde temp;

            switch ((int) Math.floor((Math.random() * 3) + 1)) {
                // Endverbraucher
                case 1:
                    temp = new Endverbraucher(new Adresse(i + 1 + ". Endverbraucher", "Hamburger Straße " + (int) Math.floor((Math.random() * 100) + 1), "10243", "Berlin"), 0, true);
                    temp.setNummer(knv.getKundennummer());
                    neuEndverbraucher(temp);
                    break;
                // Großverbraucher
                case 2:
                    temp = new Grossverbraucher(new Adresse(i + 1 + ". Großverbraucher", "Hamburger Straße " + (int) Math.floor((Math.random() * 100) + 1), "10243", "Berlin"), 5, (int) Math.floor((Math.random() * 100) + 1));
                    temp.setNummer(knv.getKundennummer());
                    neuGrossverbraucher(temp);
                    break;
                // Gesellschaft
                case 3:
                    temp = new GesellschaftMitLiz(new Adresse(i + 1 + ". Gesellschaft", "Hamburger Straße " + (int) Math.floor((Math.random() * 100) + 1), "10243", "Berlin"), 7, (int) Math.floor((Math.random() * 100) + 1));
                    temp.setNummer(knv.getKundennummer());
                    neuGesellschaftMitLiz(temp);
                    break;
                default:
                    System.err.println("Falsche Zufallszahl");
                    break;
            }

        }
        System.out.println("Es wurden " + anzahl + " Kunden angelegt.\n");
    }

    /**
     *
     * @param kunde
     * @param rabatt
     * @param anschrift
     */
    public void aendernKunde(AKunde kunde, Double rabatt, Adresse anschrift) {
        for (AKunde KUNDE : KUNDENLISTE) {
            if (KUNDE.getNummer().equals(kunde.getNummer())) {
                System.err.println("Rabatt vorher: " + KUNDE.getRabatt());
                System.err.println("Rabatt übergeben: " + rabatt);
                KUNDE.setAnschrift(anschrift);
                KUNDE.setRabatt(rabatt);
                System.err.println("Kunde nachher: " + KUNDE.getRabatt());
            }
        }
    }

    @Override
    public int compare(AKunde k1, AKunde k2) {
        int temp = k1.getNummer().compareTo(k2.getNummer());
        return temp;
    }

}
