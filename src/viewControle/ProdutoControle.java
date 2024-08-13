/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewControle;

import bean.ProdutoRsj;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ProdutoControle extends AbstractTableModel{
   private List lista;
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
public ProdutoRsj getProdutoRsj(int rowIndex){
return  (ProdutoRsj) lista.get(rowIndex);
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
           ProdutoRsj produtoRsj = (ProdutoRsj) lista.get(rowIndex);
        if (columnIndex == 0) {
           return produtoRsj.getIdprodutoRsj();
        } 
        if (columnIndex == 1) {
           return produtoRsj.getSaborRsj();
        } 
        if (columnIndex == 2) {
           return produtoRsj.getCopooucasquinhaRsj();
        } 
        if (columnIndex == 3) {
           return produtoRsj.getTamanhoRsj();
        } 
        return null;
    }
           public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "sabor";
        }
        if (column == 2) {
            return "copo";
        }
        if (column == 3) {
            return "tamanho";
        }
         if (column == 4) {
            return "entrga";
        }
        return "";
    }
    
}
