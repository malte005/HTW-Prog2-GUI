package util;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.JFrame;
import model.kunde.AKunde;

/**
 * Diese Klasse ist eine globale Helper-Klasse.
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
public class Helper {

    /**
     * Diese Methode Speichert eine Textdatei mit den Kundendaten an gewünschtem
     * Ort ab.
     * 
     * @param kundenliste Die zu speichernde Kundenlist wird übergeben.
     * @param file Das Datei-Objekt wird übergeben.
     * @throws IOException 
     */
    public static void speichernText(LinkedList<AKunde> kundenliste, File file) throws IOException {

        try {
            FileWriter fileWriter
                    = new FileWriter(file.getAbsoluteFile());

            BufferedWriter bufferedWriter
                    = new BufferedWriter(fileWriter);

            for (AKunde kunde : kundenliste) {
                bufferedWriter.write(kunde.toString());
                bufferedWriter.newLine();
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println(
                    "Error writing to file '"
                    + file.getName() + "'");
        }
    }

    /**
     * Speichert die Kundenlist als Binär-Datei ab.
     * 
     * @param kundenliste Die zu speichernde Kundenlist wird übergeben.
     * @param file Das Datei-Objekt wird übergeben.
     * @throws IOException
     */
    public static void speichernBinaer(LinkedList<AKunde> kundenliste, File file) throws IOException { //"C:\\binout.dat"

        try {

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(kundenliste);
            byte[] buffer = bos.toByteArray();

            FileOutputStream outputStream
                    = new FileOutputStream(file.getAbsoluteFile());
            
            outputStream.write(buffer);

            outputStream.close();

            System.out.println("Wrote " + buffer.length
                    + " bytes");
        } catch (IOException ex) {
            System.out.println(
                    "Error writing file '"
                    + file.getName() + "'");
        }
    }

    /**
     * Die Methode öffnet eine Textdatei mit den Kundendaten.
     * 
     * @param file Das Datei-Objekt wird übergeben.
     */
    public static void oeffnenText(File file) {

        String line = null;

        try {
            FileReader fileReader
                    = new FileReader(file.getAbsolutePath());

            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + file.getName() + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + file.getName() + "'");
        }
    }

    /**
     * Die Methode öffnet eine Binärdatei mit den Kundendaten.
     * 
     * @param file Das Datei-Objekt wird übergeben.
     */
    public static void oeffnenTextBinaer(File file) {
        try {
            byte[] buffer = new byte[1000];

            FileInputStream inputStream
                    = new FileInputStream(file.getAbsoluteFile());

            int total = 0;
            int nRead = 0;
            while ((nRead = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer));
                total += nRead;
            }

            inputStream.close();

            System.out.println("Read " + total + " bytes");
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + file.getName() + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + file.getName() + "'");

        }
    }

    /**
     * Diese Methode zentriert das Fenster in der Mitte des Bildschirms.
     * 
     * @param frame Das zu zentrierende Fenster wird übergeben.
     */
    public static void getFrameCenter(JFrame frame) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
    }
}
