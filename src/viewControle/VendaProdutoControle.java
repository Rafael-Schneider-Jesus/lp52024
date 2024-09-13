/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.VendaprodutoRsj;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class VendaProdutoControle extends  AbstractTableModel{
    private List lista;

public void setList(List lista){
this.lista=lista;
this.fireTableDataChanged();
}


public VendaprodutoRsj getbean(int linha){
return (VendaprodutoRsj) lista.get(linha);
}
public void addBean(VendaprodutoRsj veAn){
lista.add(veAn);
this.fireTableDataChanged();

} 
public void removeBean(int index){
lista.remove(index);
this.fireTableDataChanged();

} 
public void updateBean(int index,VendaprodutoRsj veAn ){
lista.set(index, veAn);
this.fireTableDataChanged();

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
        VendaprodutoRsj vendas = (VendaprodutoRsj) lista.get(rowIndex);
      if (columnIndex == 0) {
             return vendas.getIdvendaprodutoRsj();
        }
        if (columnIndex == 1) {
             return vendas.getProdutoRsj();
        }
        if (columnIndex == 2) {
             return vendas.getVendaRsj();
        }
        if (columnIndex == 3) {
             return vendas.getQuantidadeRsj();
        
        }
       return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Sabor";
        }
        if (columnIndex == 2) {
             return "Vendas";
        }
        if (columnIndex == 3) {
             return "Valor";
        }
       
    return null;
    }
}
