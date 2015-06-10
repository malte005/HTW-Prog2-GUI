package model.kunde;

/**
 * Diese Klasse bilden das Kind-Objekt der Kundenklasse als Großverbraucher.
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
 * @version 0.1
 *
 */
public class Grossverbraucher extends AKunde {

    private static final double STANDARD_RABATT = 5.00;
    private int status;

    /**
     * Konstruktor der nicht gebraucht wird
     */
    private Grossverbraucher() {
        super(STANDARD_RABATT);
    }

    /**
     * Konstruktor der nicht gebraucht wird
     *
     * @param rabatt Der Rabatt des Großverbrauchers.
     * @param status Der Status des Großverbrauchers.
     */
    private Grossverbraucher(double rabatt, int status) {
        super(rabatt);
        this.status = status;
    }

    /**
     * Konstruktor
     *
     * @param anschrift Die Anschrift des Großverbrauchers.
     * @param rabatt    Der Rabatt des Großverbrauchers.
     * @param status    Der Status des Großverbrauchers.
     */
    public Grossverbraucher(Adresse anschrift, double rabatt, int status) {
        this(rabatt, status);
        this.anschrift = anschrift;
    }

    /**
     *
     * @return Der Status wird zurückgegeben.
     */
    public int getStatus() {
        return status;
    }

    /**
     *
     * @param status Der Status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     *
     * @return Die Adresse wird zurückgegeben.
     */
    @Override
    public Adresse getAnschrift() {
        return this.anschrift;
    }

    /**
     *
     * @param anschrift Die Adresse des Kunden wird übergaben.
     */
    @Override
    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    /**
     *
     * @return Der Rabatt wird zurückgegeben.
     */
    @Override
    public double getRabatt() {
        return this.rabatt;
    }

    /**
     *
     * @param rabatt Der Rabatt wird übergaben.
     */
    @Override
    public void setRabatt(double rabatt) {
        this.rabatt = STANDARD_RABATT;
    }

    /**
     *
     * @return Die Kundennummer wird zurückgegeben.
     */
    @Override
    public String getNummer() {
        return this.nummer;
    }

    /**
     *
     * @param nummer Die Kundennummer wird übergaben.
     */
    @Override
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return //super.toString() + "\n" + 
                "Grossverbraucher:"
                + "\n\tNummer = " + this.nummer
                + "\n\tStatus = " + status
                + "\n\tRabatt = " + this.rabatt + " %"
                + "\nAnschrift: " + this.anschrift;
    }
}
