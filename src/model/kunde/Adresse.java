package model.kunde;

import java.io.Serializable;

/**
 * Diese Klasse bildet das Objekt der Adresse ab.
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
 * @since 2015-05-06
 * @version 0.1
 *
 */
public class Adresse implements Serializable {

    private String name;
    private String strasse_hnr;
    private String plz;
    private String ort;

    /**
     * Konstruktor der Ardesse
     *
     * @param name        Der Name des Kunden.
     * @param strasse_hnr Die Straße und Hausnummer des Kudnen.
     * @param plz         Die Postleitzahl des Kunden.
     * @param ort         Der Ort des Kudnen.
     */
    public Adresse(String name, String strasse_hnr, String plz, String ort) {
        this.name = name;
        this.strasse_hnr = strasse_hnr;
        this.plz = plz;
        this.ort = ort;
    }

    /**
     *
     * @return Namen des Kunden wird zurückgegeben.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Der Name des Kunden wird übergeben.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Straße und Hausnummer wird zurückgegeben.
     */
    public String getStrasse_hnr() {
        return strasse_hnr;
    }

    /**
     *
     * @param strasse_hnr Die Straße und Hausnummer werden übrgeben.
     */
    public void setStrasse_hnr(String strasse_hnr) {
        this.strasse_hnr = strasse_hnr;
    }

    /**
     *
     * @return Postleitzahl wird zurückgegeben.
     */
    public String getPlz() {
        return plz;
    }

    /**
     *
     * @param plz Die Postleitzahl wird übergeben.
     */
    public void setPlz(String plz) {
        this.plz = plz;
    }

    /**
     *
     * @return Der Ort wird zurückgegeben.
     */
    public String getOrt() {
        return ort;
    }

    /**
     *
     * @param ort Der Ort des Kunden wird übergeben.
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "\n\tName = " + name
                + "\n\tStrasse / Hausnummer = " + strasse_hnr
                + "\n\tPLZ = " + plz
                + "\n\tOrt = " + ort
                + "\n----------------------------------------------";
    }

}
