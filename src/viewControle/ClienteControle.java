/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewControle;

import bean.ClienteRsj;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ClienteControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public ClienteRsj getClienteRsj(int rowIndex) {
        return (ClienteRsj) lista.get(rowIndex);
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
        ClienteRsj clienteRsj = (ClienteRsj) lista.get(rowIndex);
        if (columnIndex == 0) {
            return clienteRsj.getIdclienteRsj();
        }
        if (columnIndex == 1) {
            return clienteRsj.getNomeRsj();
        }
        if (columnIndex == 2) {
            return clienteRsj.getSobrenomeRsj();
        }
        if (columnIndex == 3) {
            return clienteRsj.getEmailRsj();
        }
        return null;
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Sobrenome";
        }
        if (column == 3) {
            return "Email";
        }
        return "";
    }

}
