package model;

import control.Kundenverwaltung;
import java.util.LinkedList;
import javax.swing.AbstractListModel;
import model.kunde.AKunde;

/**
 * BESCHREIBUNG
 *
 * @author Malte
 * @version 0.1
 */
public class DatenModellJList extends AbstractListModel<AKunde> {

    private LinkedList<AKunde> kunden = null;

    public DatenModellJList() {
        super();
        kunden = new LinkedList<AKunde>(); //getInstance();
    }

    @Override
    public int getSize() {
        return kunden.size();
    }

    @Override
    public AKunde getElementAt(int index) {
        return kunden.get(index);
    }
    
    // gibt Bescheid ob die Liste geändert wurde
    // muss beim Neu-Fesnter aufgerufen werden
    //im AktionListener : fenster.getModell().addData();
    public void addData(){
        this.fireIntervalAdded(kunden, kunden.size()-1, kunden.size()); // Intervallgrenzen
    }
    
    public void removeData(){
        this.fireIntervalRemoved(kunden, kunden.size()-1, kunden.size()); // Intervallgrenzen
    }
    
    public void changeData(){
        this.fireContentsChanged(kunden, kunden.size()-1, kunden.size()); // Intervallgrenzen
    }

}
