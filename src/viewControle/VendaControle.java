/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;
import javax.swing.table.AbstractTableModel;
import bean.VendaRsj;
import java.util.List;

/**
 *
 * @author u13766540670
 */
public class VendaControle extends AbstractTableModel  {
    private List lista;

public void setList(List lista){
this.lista=lista;
this.fireTableDataChanged();
}


public VendaRsj getbean(int linha){
return (VendaRsj) lista.get(linha);
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
         VendaRsj venda = (VendaRsj) lista.get(rowIndex);
      if (columnIndex == 0) {
             return venda.getIdvendaRsj();
        }
        if (columnIndex == 1) {
             return venda.getDatavendaRsj();
        }
        if (columnIndex == 2) {
              return venda.getTotalRsj();
        }
     
       return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Data";
        }
        if (columnIndex == 2) {
             return "Valor total";
        }
   
       
    return null;
    }
}

