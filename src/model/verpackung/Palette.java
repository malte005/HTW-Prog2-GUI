package model.verpackung;

/**
 * Diese Klasse bilden das Kind-Objekt der Verpackungseinheit-Klasse als Palette.
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
public class Palette extends AVerpackungseinheit {

    private static final int STANDARD_ANZAHL_FLASCHEN = 36;

    /**
     * Konstruktor
     */
    public Palette() {
        super(STANDARD_ANZAHL_FLASCHEN);
    }

    /**
     * Konstruktor
     *
     * @param anzahlFlaschen Die Anzahl der Flaschen wird übergeben.
     */
    public Palette(int anzahlFlaschen) {
        super(anzahlFlaschen);
    }

    /**
     *
     * @return Anzahl der Flaschen wird zurückgegeben.
     */
    @Override
    public int getAnzahlFlaschen() {
        return this.anzahlFlaschen;
    }

    /**
     *
     * @param anzahlFlaschen Die Anzahl der Flaschen wird übergben.
     */
    @Override
    public void setAnzahlFlaschen(int anzahlFlaschen) {
        this.anzahlFlaschen = anzahlFlaschen;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Palette{" + "anzahlFlaschen=" + this.anzahlFlaschen + '}';
    }

}
