/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author stefan
 */
public class SenderTabelModel extends AbstractTableModel{
    
   private ArrayList<Sender> sender = new ArrayList<>();
    private static String[] colNames = {"Sender","Frequenz","Band"};
   

    @Override
    public int getRowCount() {
     return sender.size();
    }

    @Override
    public int getColumnCount() {
       return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sender s = (Sender) sender.get(rowIndex);
        return s;
        
    }
    
     @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
    
    public void add(Sender s)
    {
     sender.add(s);
    // Collections.sort(sender, new SortByFrequency());
        this.fireTableRowsInserted(sender.size()-1, sender.size()-1);
    }
    
    public void hide()
    {
     colNames = new String [2];
     colNames[1] = "Sender";
       colNames[2] = "Frequenz";      
        this.fireTableStructureChanged();
    }
    
    public void show()
    {
    colNames = new String [2];
     colNames[1] = "Sender";
       colNames[2] = "Frequenz";   
        colNames[2] = "Band";  
        this.fireTableStructureChanged();
    }
}
