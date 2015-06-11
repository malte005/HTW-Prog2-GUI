package view.frame;

import control.Kundenverwaltung;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import util.Helper;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import util.PicTool;

/**
 * Diese Klasse das Hauptfenster der GUI ab.
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
public class MainFrame extends javax.swing.JFrame {

    /**
     * Konstruktor des Fensters
     */
    //Testrahmen zum Erzeugen von Kunden
    Kundenverwaltung kv = new Kundenverwaltung();

    public MainFrame() throws IOException {
        initComponents();
        this.setTitle("Weinvertrieb");
        Helper.getFrameCenter(this);

        // ------------ Test -----------
        try {
            kv.testCreateKunden();
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        // ------------ Test -----------
        jListKundenliste.setListData(kv.getListe().toArray());

        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupKunden = new javax.swing.ButtonGroup();
        panelHeader = new javax.swing.JPanel();
        lblUeberschriftHeader = new javax.swing.JLabel();
        panelKundenliste = new javax.swing.JPanel();
        lblUeberschriftListe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListKundenliste = new javax.swing.JList();
        panelKundenbild = new javax.swing.JPanel();
        lblUeberschriftKundenbild = new javax.swing.JLabel();
        lblBild = new javax.swing.JLabel(""+SwingConstants.CENTER);
        panelOption = new javax.swing.JPanel();
        lblUeberschriftOptionen = new javax.swing.JLabel();
        btnPicture = new javax.swing.JButton();
        jRadioButtonEndverbraucher = new javax.swing.JRadioButton();
        jRadioButtonGrossverbraucher = new javax.swing.JRadioButton();
        jRadioButtonGesellschaft = new javax.swing.JRadioButton();
        panelBestellung = new javax.swing.JPanel();
        lblUeberschriftBestellung = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuDatei = new javax.swing.JMenu();
        itemOpen = new javax.swing.JMenuItem();
        itemSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemOpenBinaer = new javax.swing.JMenuItem();
        itemSaveBinaer = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuDateiBeenden = new javax.swing.JMenuItem();
        menuBestellung = new javax.swing.JMenu();
        menuKunde = new javax.swing.JMenu();
        itemKundeNeu = new javax.swing.JMenuItem();
        itemKundeAendern = new javax.swing.JMenuItem();
        itemKundeLeschen = new javax.swing.JMenuItem();
        menuHilfe = new javax.swing.JMenu();
        menuExtrasImpressum = new javax.swing.JMenuItem();
        itemHilfeInfo = new javax.swing.JMenuItem();

        buttonGroupKunden.add(jRadioButtonEndverbraucher);
        buttonGroupKunden.add(jRadioButtonGrossverbraucher);
        buttonGroupKunden.add(jRadioButtonGesellschaft);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2-592/2,Toolkit.getDefaultToolkit().getScreenSize().height/2-334/2,592,334);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        panelHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblUeberschriftHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUeberschriftHeader.setText("Weinvertrieb");
        lblUeberschriftHeader.setName("headerUeberschrift"); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUeberschriftHeader)
                .addGap(446, 446, 446))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUeberschriftHeader)
        );

        panelKundenliste.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102)));

        lblUeberschriftListe.setText("Kundenliste");

        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportView(jListKundenliste);
        //jListKundenliste.addListSelectionListener(new JList;

            javax.swing.GroupLayout panelKundenlisteLayout = new javax.swing.GroupLayout(panelKundenliste);
            panelKundenliste.setLayout(panelKundenlisteLayout);
            panelKundenlisteLayout.setHorizontalGroup(
                panelKundenlisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKundenlisteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap())
                .addGroup(panelKundenlisteLayout.createSequentialGroup()
                    .addGap(203, 203, 203)
                    .addComponent(lblUeberschriftListe)
                    .addContainerGap(221, Short.MAX_VALUE))
            );
            panelKundenlisteLayout.setVerticalGroup(
                panelKundenlisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelKundenlisteLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(lblUeberschriftListe)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addContainerGap())
            );

            panelKundenbild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

            lblUeberschriftKundenbild.setText("Kundenbild");

            javax.swing.GroupLayout panelKundenbildLayout = new javax.swing.GroupLayout(panelKundenbild);
            panelKundenbild.setLayout(panelKundenbildLayout);
            panelKundenbildLayout.setHorizontalGroup(
                panelKundenbildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelKundenbildLayout.createSequentialGroup()
                    .addGroup(panelKundenbildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelKundenbildLayout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(lblUeberschriftKundenbild))
                        .addGroup(panelKundenbildLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblBild)))
                    .addContainerGap(117, Short.MAX_VALUE))
            );
            panelKundenbildLayout.setVerticalGroup(
                panelKundenbildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelKundenbildLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblUeberschriftKundenbild)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblBild)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            panelOption.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

            lblUeberschriftOptionen.setText("Optionen");

            btnPicture.setText("Bild wählen");
            btnPicture.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnPictureActionPerformed(evt);
                }
            });

            jRadioButtonEndverbraucher.setText("Endverbraucher");
            jRadioButtonEndverbraucher.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButtonEndverbraucherActionPerformed(evt);
                }
            });

            jRadioButtonGrossverbraucher.setText("Großverbraucher");
            jRadioButtonGrossverbraucher.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButtonGrossverbraucherActionPerformed(evt);
                }
            });

            jRadioButtonGesellschaft.setText("Gesellschaft");
            jRadioButtonGesellschaft.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButtonGesellschaftActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout panelOptionLayout = new javax.swing.GroupLayout(panelOption);
            panelOption.setLayout(panelOptionLayout);
            panelOptionLayout.setHorizontalGroup(
                panelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelOptionLayout.createSequentialGroup()
                    .addContainerGap(34, Short.MAX_VALUE)
                    .addGroup(panelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOptionLayout.createSequentialGroup()
                            .addComponent(lblUeberschriftOptionen)
                            .addGap(84, 84, 84))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOptionLayout.createSequentialGroup()
                            .addGroup(panelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonGrossverbraucher)
                                .addComponent(jRadioButtonEndverbraucher)
                                .addComponent(jRadioButtonGesellschaft))
                            .addGap(53, 53, 53))))
                .addGroup(panelOptionLayout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(btnPicture)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            panelOptionLayout.setVerticalGroup(
                panelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelOptionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblUeberschriftOptionen)
                    .addGap(81, 81, 81)
                    .addComponent(jRadioButtonEndverbraucher)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jRadioButtonGrossverbraucher)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jRadioButtonGesellschaft)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPicture)
                    .addGap(27, 27, 27))
            );

            panelBestellung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

            lblUeberschriftBestellung.setText("Bestellungen");

            javax.swing.GroupLayout panelBestellungLayout = new javax.swing.GroupLayout(panelBestellung);
            panelBestellung.setLayout(panelBestellungLayout);
            panelBestellungLayout.setHorizontalGroup(
                panelBestellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBestellungLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUeberschriftBestellung)
                    .addGap(488, 488, 488))
            );
            panelBestellungLayout.setVerticalGroup(
                panelBestellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBestellungLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblUeberschriftBestellung)
                    .addContainerGap(214, Short.MAX_VALUE))
            );

            menuDatei.setText("Datei");

            itemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, 0));
            itemOpen.setText("Öffnen");
            itemOpen.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemOpenActionPerformed(evt);
                }
            });
            menuDatei.add(itemOpen);

            itemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
            itemSave.setText("Speichern");
            itemSave.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemSaveActionPerformed(evt);
                }
            });
            menuDatei.add(itemSave);
            menuDatei.add(jSeparator1);

            itemOpenBinaer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
            itemOpenBinaer.setText("Öffnen (binär)");
            itemOpenBinaer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemOpenBinaerActionPerformed(evt);
                }
            });
            menuDatei.add(itemOpenBinaer);

            itemSaveBinaer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
            itemSaveBinaer.setText("Speichern (binär)");
            itemSaveBinaer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemSaveBinaerActionPerformed(evt);
                }
            });
            menuDatei.add(itemSaveBinaer);
            menuDatei.add(jSeparator2);

            menuDateiBeenden.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
            menuDateiBeenden.setText("Beenden");
            menuDateiBeenden.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuDateiBeendenActionPerformed(evt);
                }
            });
            menuDatei.add(menuDateiBeenden);

            menu.add(menuDatei);

            menuBestellung.setText("Bestellung");
            menu.add(menuBestellung);

            menuKunde.setText("Kunde");

            itemKundeNeu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
            itemKundeNeu.setText("neu");
            itemKundeNeu.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemKundeNeuActionPerformed(evt);
                }
            });
            menuKunde.add(itemKundeNeu);

            itemKundeAendern.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
            itemKundeAendern.setText("ändern");
            itemKundeAendern.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemKundeAendernActionPerformed(evt);
                }
            });
            menuKunde.add(itemKundeAendern);

            itemKundeLeschen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
            itemKundeLeschen.setText("löschen");
            itemKundeLeschen.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemKundeLeschenActionPerformed(evt);
                }
            });
            menuKunde.add(itemKundeLeschen);

            menu.add(menuKunde);

            menuHilfe.setText("Hilfe");

            menuExtrasImpressum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
            menuExtrasImpressum.setText("Autor");
            menuExtrasImpressum.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuExtrasImpressumActionPerformed(evt);
                }
            });
            menuHilfe.add(menuExtrasImpressum);

            itemHilfeInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
            itemHilfeInfo.setText("Info");
            itemHilfeInfo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemHilfeInfoActionPerformed(evt);
                }
            });
            menuHilfe.add(itemHilfeInfo);

            menu.add(menuHilfe);

            setJMenuBar(menu);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panelBestellung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(panelKundenliste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panelKundenbild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panelOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelKundenliste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelOption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelKundenbild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelBestellung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );

            File datei = new File("./pics/FACE25.jpg");
            ImageIcon pic =  PicTool.loadImage(datei);

            lblBild.setIcon(pic);

            lblBild.setPreferredSize(new Dimension(pic.getIconWidth(), pic.getIconHeight()));

            panelKundenbild.add(lblBild);

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void menuDateiBeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDateiBeendenActionPerformed
        int boxValue = JOptionPane.showConfirmDialog(null, "Sollen die Daten gespeichert werden?", "Speichern", JOptionPane.YES_NO_CANCEL_OPTION);
        if (boxValue == JOptionPane.NO_OPTION) {
            System.exit(0);
        } else if (boxValue == JOptionPane.YES_OPTION) {

            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Text Datein", "txt", "cvs");
            chooser.setFileFilter(filter);

            int returnVal = chooser.showSaveDialog(null);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to save this file: "
                        + chooser.getSelectedFile().getName());
                try {
                    Helper.speichernText(kv.getListe(), chooser.getSelectedFile());
                    System.exit(0);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_menuDateiBeendenActionPerformed

    private void menuExtrasImpressumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrasImpressumActionPerformed
        JOptionPane.showMessageDialog(null, "Malte Dammann\nAbgabe am 22.06.2015\nÜbungsaufgabe Prog2 - Swing", "Autor", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuExtrasImpressumActionPerformed

    private void itemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaveActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Text Datein", "txt", "cvs");
        chooser.setFileFilter(filter);

        int returnVal = chooser.showSaveDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to save this file: "
                    + chooser.getSelectedFile().getName());
            try {
                Helper.speichernText(kv.getListe(), chooser.getSelectedFile());
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_itemSaveActionPerformed

    private void itemSaveBinaerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaveBinaerActionPerformed
        JFileChooser chooser = new JFileChooser();

        int returnVal = chooser.showSaveDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to save this file: "
                    + chooser.getSelectedFile().getName());
            try {
                Helper.speichernBinaer(kv.getListe(), chooser.getSelectedFile());
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (returnVal == JFileChooser.CANCEL_OPTION) {
            System.err.println("Abgebrochen");
        }

    }//GEN-LAST:event_itemSaveBinaerActionPerformed

    private void itemKundeNeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemKundeNeuActionPerformed
        NeuerKundeFrame neu = new NeuerKundeFrame(kv);
    }//GEN-LAST:event_itemKundeNeuActionPerformed

    private void btnPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPictureActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPEG & gif Datein", "JPEG", "gif");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: "
                    + chooser.getSelectedFile().getName());
        }
    }//GEN-LAST:event_btnPictureActionPerformed

    private void itemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpenActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Text & CVS Datein", "txt", "cvs");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            Helper.oeffnenText(chooser.getSelectedFile());
        }
    }//GEN-LAST:event_itemOpenActionPerformed

    private void itemHilfeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHilfeInfoActionPerformed
        File currentDirFile = new File(".");
        String pfad = currentDirFile.getAbsolutePath();
        JOptionPane.showMessageDialog(null, pfad, "Bilderpfad", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_itemHilfeInfoActionPerformed

    private void jRadioButtonEndverbraucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEndverbraucherActionPerformed
        File picDatei = new File("./pics/" + "FACE25" + ".jpg");
        ImageIcon pic = PicTool.loadImage(picDatei);
        lblBild.setIcon(pic);

    }//GEN-LAST:event_jRadioButtonEndverbraucherActionPerformed

    private void jRadioButtonGrossverbraucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGrossverbraucherActionPerformed
        File picDatei = new File("./pics/" + "FACE27" + ".jpg");
        ImageIcon pic = PicTool.loadImage(picDatei);
        lblBild.setIcon(pic);
    }//GEN-LAST:event_jRadioButtonGrossverbraucherActionPerformed

    private void jRadioButtonGesellschaftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGesellschaftActionPerformed
        File picDatei = new File("./pics/" + "FACE29" + ".jpg");
        ImageIcon pic = PicTool.loadImage(picDatei);
        lblBild.setIcon(pic);
    }//GEN-LAST:event_jRadioButtonGesellschaftActionPerformed

    private void itemOpenBinaerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpenBinaerActionPerformed
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            Helper.oeffnenText(chooser.getSelectedFile());
        }
    }//GEN-LAST:event_itemOpenBinaerActionPerformed

    private void itemKundeAendernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemKundeAendernActionPerformed
        KundeAendern aendern = new KundeAendern(1, kv);
    }//GEN-LAST:event_itemKundeAendernActionPerformed

    private void itemKundeLeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemKundeLeschenActionPerformed
        KundeLoeschen loeschen = new KundeLoeschen(1, kv);
    }//GEN-LAST:event_itemKundeLeschenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPicture;
    private javax.swing.ButtonGroup buttonGroupKunden;
    private javax.swing.JMenuItem itemHilfeInfo;
    private javax.swing.JMenuItem itemKundeAendern;
    private javax.swing.JMenuItem itemKundeLeschen;
    private javax.swing.JMenuItem itemKundeNeu;
    private javax.swing.JMenuItem itemOpen;
    private javax.swing.JMenuItem itemOpenBinaer;
    private javax.swing.JMenuItem itemSave;
    private javax.swing.JMenuItem itemSaveBinaer;
    private javax.swing.JList jListKundenliste;
    private javax.swing.JRadioButton jRadioButtonEndverbraucher;
    private javax.swing.JRadioButton jRadioButtonGesellschaft;
    private javax.swing.JRadioButton jRadioButtonGrossverbraucher;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblBild;
    private javax.swing.JLabel lblUeberschriftBestellung;
    private javax.swing.JLabel lblUeberschriftHeader;
    private javax.swing.JLabel lblUeberschriftKundenbild;
    private javax.swing.JLabel lblUeberschriftListe;
    private javax.swing.JLabel lblUeberschriftOptionen;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuBestellung;
    private javax.swing.JMenu menuDatei;
    private javax.swing.JMenuItem menuDateiBeenden;
    private javax.swing.JMenuItem menuExtrasImpressum;
    private javax.swing.JMenu menuHilfe;
    private javax.swing.JMenu menuKunde;
    private javax.swing.JPanel panelBestellung;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelKundenbild;
    private javax.swing.JPanel panelKundenliste;
    private javax.swing.JPanel panelOption;
    // End of variables declaration//GEN-END:variables
}
