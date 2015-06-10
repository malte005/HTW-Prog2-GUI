package model.kunde;

import javax.swing.ImageIcon;

/**
 * Diese Klasse bilden das Kind-Objekt der Kundenklasse als Endverbraucher.
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
public class Endverbraucher extends AKunde {

    private static final double STANDARD_RABATT = 0.00;
    private boolean bonitaet;

    /**
     * Konstruktor der nicht gebraucht wird
     */
    private Endverbraucher() {
        super(STANDARD_RABATT);
    }

    /**
     * Konstruktor der nicht gebraucht wird
     *
     * @param rabatt   Der Rabatt des Endkunden.
     * @param bonitaet Die Bonität des Endkunden.
     */
    private Endverbraucher(double rabatt, boolean bonitaet) {
        super(rabatt);
        this.bonitaet = bonitaet;
    }

    /**
     * Konstruktor
     *
     * @param anschrift Die Adersse des Endkunden.
     * @param rabatt    Der Rabatt des Endkunden.
     * @param bonitaet  Die Bonität des Endkunden.
     */
    public Endverbraucher(Adresse anschrift, double rabatt, boolean bonitaet) {
        this(rabatt, bonitaet);
        this.anschrift = anschrift;

    }

    /**
     *
     * @return Ob der Endkunde eine Bonität hat.
     */
    public boolean isBonitaet() {
        return bonitaet;
    }

    /**
     *
     * @param bonitaet Die Bonität des Endkunden wird übergaben.
     */
    public void setBonitaet(boolean bonitaet) {
        this.bonitaet = bonitaet;
    }

    /**
     *
     * @return Die Adresse des Endkunden wurd zurückgegeben.
     */
    @Override
    public Adresse getAnschrift() {
        return this.anschrift;
    }

    /**
     *
     * @param anschrift Die Adresse des Endkunden wird übergaben.
     */
    @Override
    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    /**
     *
     * @return Der Rabatt des Endkunden wird zurückgegeben.
     */
    @Override
    public double getRabatt() {
        return this.rabatt;
    }

    /**
     *
     * @param rabatt Der Rabatt des Endkunden wird übergaben.
     */
    @Override
    public void setRabatt(double rabatt) {
        this.rabatt = STANDARD_RABATT;
    }

    /**
     *
     * @return Die Kundennummer wird zurückegeben.
     */
    @Override
    public String getNummer() {
        return this.nummer;
    }

    /**
     *
     * @param nummer Die Kundennummer des Endkunden wird übergaben.
     */
    @Override
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    /**
     *
     * @param bild Das Kundenbild wird übergeben.
     */
    @Override
    public void setBild(ImageIcon bild) {
        this.bild = bild;
    }

    /**
     *
     * @return Das Bild wird zurückgegeben.
     */
    @Override
    public ImageIcon getBild() {
        return this.bild;
    }

    @Override
    public String toString() {
        return // super.toString() +  "\n" +
                "Endverbraucher:"
                + "\nNummer = " + this.nummer
                //                + "\nBonitaet = " + this.bonitaet
                + "\nRabatt = " + this.rabatt + " %" 
//                + "\nAnschrift:" + this.anschrift
                ;
    }

}
