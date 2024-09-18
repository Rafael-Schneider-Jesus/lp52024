/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.ProdutoRsj;
import bean.VendaprodutoRsj;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class VendaProdutoControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public void addList(VendaprodutoRsj vendaprodutoRsj) {
        lista.add(vendaprodutoRsj);
        this.fireTableDataChanged();
    }

    public VendaprodutoRsj getbean(int linha) {
        return (VendaprodutoRsj) lista.get(linha);
    }

    public void removeBean(int index) {
        lista.remove(index);
        this.fireTableDataChanged();

    }

    public void updateBean(int index, VendaprodutoRsj veAn) {
        lista.set(index, veAn);
        this.fireTableDataChanged();

    }
      public VendaprodutoRsj getList(int index) {
        return (VendaprodutoRsj) lista.get(index);
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
        ProdutoRsj produto = (ProdutoRsj) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendas.getIdvendaprodutoRsj();
        }
        if (columnIndex == 1) {
            return vendas.getProdutoRsj();
        }
        if (columnIndex == 2) {
            return vendas.getQuantidadeRsj();
        }
        if (columnIndex == 3) {
            return vendas.getValorunitarioRsj();

        }
        if (columnIndex == 4) {
            return vendas.getQuantidadeRsj() * tools.Util.strInt(produto.getValorURsj());
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Codigo";
        }
        if (column == 1) {
            return "Sabor";
        }
        if (column == 2) {
            return "Quantidade";
        }
        if (column == 3) {
            return "Valor Unitario";
        }
        if (column == 4) {
            return "Total";
        }

        return "";
    }
}
