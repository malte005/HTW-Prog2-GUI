package view.frame;

import control.Kundenverwaltung;
import javax.swing.JOptionPane;
import model.kunde.AKunde;
import util.Helper;

/**
 * Diese Klasse bildet ein Unterfenster für das Ändern eines Kunden ab.
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
public class KundeLoeschen extends javax.swing.JFrame {

    AKunde aKunde;
    Kundenverwaltung kv;

    /**
     * Konstruktor des Fensters
     */
    public KundeLoeschen(int nr, Kundenverwaltung kv) {
        initComponents();
        initKunde(nr, kv);
        this.setTitle("Kunde löschen");
        Helper.getFrameCenter(this);
        this.setVisible(true);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setAlwaysOnTop( false );
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLoeschen = new java.awt.Button();
        txtNummer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdresse = new javax.swing.JTextArea();
        txtRabatt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setText("Kundennummer: ");

        jLabel2.setText("Adresse: ");

        jLabel3.setText("Rabatt:");

        btnLoeschen.setLabel("Löschen");
        btnLoeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoeschenActionPerformed(evt);
            }
        });

        txtNummer.setEditable(false);
        txtNummer.setText("jTextField2");

        txtAdresse.setEditable(false);
        txtAdresse.setColumns(20);
        txtAdresse.setRows(5);
        jScrollPane1.setViewportView(txtAdresse);

        txtRabatt.setEditable(false);
        txtRabatt.setText("jTextField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNummer)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLoeschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(txtRabatt)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRabatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btnLoeschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoeschenActionPerformed
        int boxValue = JOptionPane.showConfirmDialog(null, "Sollen die Daten gelöscht werden?", "Löschen", JOptionPane.OK_CANCEL_OPTION);
        if (boxValue == JOptionPane.YES_OPTION) {
            loeschen(aKunde);
            this.dispose();
        }
    }//GEN-LAST:event_btnLoeschenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnLoeschen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAdresse;
    private javax.swing.JTextField txtNummer;
    private javax.swing.JTextField txtRabatt;
    // End of variables declaration//GEN-END:variables

    private void initKunde(int nr, Kundenverwaltung kv_v) {
        aKunde = kv_v.getListe().get(nr);
        kv = kv_v;
        txtAdresse.setText(aKunde.getAnschrift().toString());
        txtNummer.setText(aKunde.getNummer());
        txtRabatt.setText(String.valueOf(aKunde.getRabatt()));
    }

    private void loeschen(AKunde aKunde) {
        kv.removeKunde(aKunde);
    }

}
