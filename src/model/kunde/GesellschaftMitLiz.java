package model.kunde;

/**
 * Diese Klasse bilden das Kind-Objekt der Kundenklasse als Gesellschaft mit
 * Lizenzvertrieb.
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
public class GesellschaftMitLiz extends AKunde {

    private static final double STANDARD_RABATT = 7.00;
    private int vertrieb;

    /**
     * Default Kontruktor der nicht gebraucht wird
     */
    private GesellschaftMitLiz() {
        super(STANDARD_RABATT);
    }

    /**
     * Kontruktor der nicht gebraucht wird
     *
     * @param rabatt   Der Rabatt der Gesellschaft.
     * @param vertrieb Die Vertriebsnumer der Gesellschaft.
     */
    private GesellschaftMitLiz(double rabatt, int vertrieb) {
        super(rabatt);
        this.vertrieb = vertrieb;
    }

    /**
     * Kontruktor
     *
     * @param anschrift Die Anschrift der Geselschaft.
     * @param rabatt    Der Rabatt der Gesellschaft.
     * @param vertrieb  Die Vertriebsnumer der Gesellschaft.
     */
    public GesellschaftMitLiz(Adresse anschrift, double rabatt, int vertrieb) {
        this(rabatt, vertrieb);
        this.anschrift = anschrift;
    }

    /**
     *
     * @return Die Vertriebsnummer wird zurückgegeben.
     */
    public int getVertrieb() {
        return vertrieb;
    }

    /**
     *
     * @param vertrieb Die Vertriebsnummer wird übergaben.
     */
    public void setVertrieb(int vertrieb) {
        this.vertrieb = vertrieb;
    }

    /**
     *
     * @return Die Adresse der Gesellschaft wird zurückgegeben.
     */
    @Override
    public Adresse getAnschrift() {
        return this.anschrift;
    }

    /**
     *
     * @param anschrift Die Adresse der Gesellschaft wird übergaben.
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
     * @param rabatt Der Rabatt der Gesellschaft wird übergaben.
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
     * @param nummer Die Kundennummer der Gesellschft wird übergaben.
     */
    @Override
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return //super.toString() + "\n" + 
                "Gesellschaft Mit Lizenzvertrieb:"
                + "\n\tNummer = " + this.nummer
                + "\n\tVertrieb = " + vertrieb
                + "\n\tRabatt = " + this.rabatt + " %"
                + "\nAnschrift: " + this.anschrift;
    }

}
