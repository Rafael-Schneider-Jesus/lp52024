/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewControle;

import bean.VendaRsj;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class VendaControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public VendaRsj getVendaRsj(int rowIndex) {
        return (VendaRsj) lista.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendaRsj vendaRsj = (VendaRsj) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendaRsj.getIdvendaRsj();
        }
        if (columnIndex == 1) {
            return vendaRsj.getFormapagamentoRsj();
        }
        if (columnIndex == 2) {
            return vendaRsj.getTotalRsj();
        }
        if (columnIndex == 3) {
            return vendaRsj.getDatavendaRsj();
        }
        return null;
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "formapagamento";
        }
        if (column == 2) {
            return "Vendedor";
        }
        if (column == 3) {
            return "Total";
        }
        if (column == 4) {
            return "Datavenda";
        }
        return "";
    }

}
