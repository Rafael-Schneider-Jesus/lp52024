/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetCampo) {
        for (JComponent vetCampo1 : vetCampo) {
            vetCampo1.setEnabled(valor);
        }
    }

    public static void limp(JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            if (vetComp[i] instanceof JTextField) {
                ((JTextField) vetComp[i]).setText("");
            }
            if (vetComp[i] instanceof JComboBox) {
                ((JComboBox) vetComp[i]).setSelectedIndex(-1);
            }
            if (vetComp[i] instanceof JCheckBox) {
                ((JCheckBox) vetComp[i]).setSelected(false);
            }
        }
    }

    public static void msg(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static int perguntar(String mensagem, String pergunta) {
      return  JOptionPane.showConfirmDialog(null,  mensagem, pergunta, JOptionPane.YES_NO_OPTION);
        
    }
        public static boolean pergunta(String mensagem) {
//       int resp = JOptionPane.showConfirmDialog(null, "Confirmar exclusão?",
//       "Pergunta", JOptionPane.YES_NO_OPTION);
       
       int resp = JOptionPane.showConfirmDialog(null, "Confirmar exclusão?",
       "Pergunta", JOptionPane.YES_NO_OPTION);
       
        return false;
    }

    public static int strInt(String cad) {

        return Integer.valueOf(cad);

    }

    public static String intStr(int num) {
        return String.valueOf(num);
    }

    public static double strDouble(String cad) {

        return Double.parseDouble(cad);

    }

    public static String doubleStr(double num) {
        return String.valueOf(num);
    }

    public static java.util.Date strDate(String car) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            return formato.parse(car);
        } catch (ParseException ex) {
            msg("Erro: Falha na conversão de data.");
            return null;
        }
    }

    public static String dateStr(java.util.Date cad) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(cad);
    }
}
