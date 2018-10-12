/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author stefan
 */
public class SenderTabelModel extends AbstractTableModel{
    
   LinkedList sender = new LinkedList();
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
    
}
