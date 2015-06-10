package model.verpackung;

/**
 * Diese Klasse das Objekt der Weinsorte ab.
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
public class WeinSorte {

    private String weinsorte;
    private double preis;

    /**
     * Konstruktor
     *
     * @param weinsorte Die Weinsorte wird als String übergeben.
     * @param preis     Der Preis der Weinsorte wird übergeben.
     */
    public WeinSorte(String weinsorte, double preis) {
        this.weinsorte = weinsorte;
        this.preis = preis;
    }

    /**
     *
     * @return Die Weinsorte wird zurückgegeben.
     */
    public String getWeinsorte() {
        return weinsorte;
    }

    /**
     *
     * @param weinsorte Die Weinsorte wird übergeben.
     */
    public void setWeinsorte(String weinsorte) {
        this.weinsorte = weinsorte;
    }

    /**
     *
     * @return Der Preis wird zurückgegeben.
     */
    public double getPreis() {
        return preis;
    }

    /**
     *
     * @param preis Der Preis der Weinsorte wird übergeben.
     */
    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "WeinSorte{" + "weinsorte=" + weinsorte + ", preis=" + preis + '}';
    }

}
