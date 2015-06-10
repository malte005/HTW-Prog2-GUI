package model.verpackung;

/**
 * Diese Klasse bilden das Eltern-Objekt für die Verpackungseinheiten ab.
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
 * @version 0.2
 *
 */
public abstract class AVerpackungseinheit {

    protected int anzahlFlaschen = 1;

    /**
     * Konstruktor
     *
     * @param anzahlFlaschen Die Anzahl der Flaschen wird übergeben.
     */
    public AVerpackungseinheit(int anzahlFlaschen) {
        this.anzahlFlaschen = anzahlFlaschen;
    }

    /**
     *
     * @return Die Anzahl der Flaschen wird zurückgegeben.
     */
    public abstract int getAnzahlFlaschen();

    /**
     *
     * @param anzahlFlaschen Die Anzahl der Flaschen wird übergeben.
     */
    public abstract void setAnzahlFlaschen(int anzahlFlaschen);

    @Override
    public String toString() {
        return "AVerpackungseinheit{" + "anzahlFlaschen=" + anzahlFlaschen + '}';
    }

}
