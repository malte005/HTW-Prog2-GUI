package view.frame;

import util.Helper;

/**
 * Diese Klasse bildet ein Unterfenster für das Hinzufügen eines Kunden ab.
 *
 * @author Malte Dammann
 * E-Mail: s0549309@htw-berlin.de
 * Bearbeitungszeitraum: 05.06.15 - 22.06.2015
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
public class NeuerKundeFrame extends javax.swing.JFrame {

    /**
     * Konstruktor des Fensters
     */
    public NeuerKundeFrame() {
        initComponents();
        this.setTitle("Kunde anlegen");
        Helper.getFrameCenter(this);
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}