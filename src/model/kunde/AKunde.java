package model.kunde;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 * Diese Klasse ist die Parent-Klasse zu den einzelnen Kunden.
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
 * @version 0.3
 *
 */
public abstract class AKunde implements Serializable {

    protected Adresse anschrift;
    protected double rabatt = 0.0;
    protected String nummer;
    protected ImageIcon bild;

    /**
     * Konstruktor
     *
     * @param rabatt Der Rabatt des Kunden
     */
    public AKunde(double rabatt) {
        this.rabatt = rabatt;
    }

    /**
     *
     * @param bild Das Kundenbild wird übergeben.
     */
    public abstract  void setBild(ImageIcon bild);
    
    /**
     *
     * @return Das Bild wird zurückgegeben.
     */
    public  abstract ImageIcon getBild();
    
    /**
     *
     * @return Das Adressen-Objekt wird zurückgegeben.
     */
    public abstract Adresse getAnschrift();

    /**
     *
     * @param anschrift Das Adressen-Objekt wird übergeben.
     */
    public abstract void setAnschrift(Adresse anschrift);

    /**
     *
     * @return Der Rabatt wird zurückgeggeben.
     */
    public abstract double getRabatt();

    /**
     *
     * @param rabatt Der Rabatt wird übergeben.
     */
    public abstract void setRabatt(double rabatt);

    /**
     *
     * @return Die Kundennummer wird zurückgegeben.
     */
    public abstract String getNummer();

    /**
     *
     * @param nummer Die Kudnennummer wird übergeben.
     */
    public abstract void setNummer(String nummer);

    @Override
    public String toString() {
        return "AKunde:\n\t" + "Anschrift = " + anschrift + "\n\tRabatt = " + rabatt + "\n\tNummer = " + nummer;
    }

}
