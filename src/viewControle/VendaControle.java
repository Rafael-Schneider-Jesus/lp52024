/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewControle;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class VendaControle extends AbstractTableModel{

    @Override
    public int getRowCount() {
         return 0;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return 0;
    }
           public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Cliente";
        }
        if (column == 2) {
            return "Vendedor";
        }
        if (column == 3) {
            return "Data";
        }
        if (column == 4) {
            return "Total";
        }
        return "";
    }
    
}
