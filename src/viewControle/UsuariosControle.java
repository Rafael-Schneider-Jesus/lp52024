/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewControle;

import bean.UsuarioRsj;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class UsuariosControle extends AbstractTableModel{
private List lista;
public void setList(List lista){
this.lista = lista;
}
public UsuarioRsj getUsuarioRsj(int rowIndex){
return  (UsuarioRsj) lista.get(rowIndex);
}

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
    
        return "";
    }
    
       public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Apelido";
        }
        if (column == 3) {
            return "Cpf";
        }
        return "";
    }
    
}
