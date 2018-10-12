/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author stefan
 */
public class SenderTabelRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Sender s = (Sender)value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        
        switch(column){
            case 0: label.setText(s.getSender()); break;
            case 1: label.setText(s.getBand()+ ""); break;
            case 2: label.setText(s.getFreq()+ ""); break;
    }
        return label;
    
}

}
 