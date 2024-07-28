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
     public static void habilitar(boolean valor, JComponent ... vetCampo) {
         for (JComponent vetCampo1 : vetCampo) {
             vetCampo1.setEnabled(valor);
         }
    }
    
    public static void limp(JComponent ... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
           if (vetComp[i] instanceof JTextField){
           ( (JTextField) vetComp[i]).setText("");
           }
           if (vetComp[i] instanceof JComboBox){
           ((JComboBox)vetComp[i]).setSelectedIndex(-1);
           }
           if ( vetComp[i] instanceof JCheckBox) {
             ((JCheckBox) vetComp[i]).setSelected(false);
            }
        }
    }
    public static void msg( String mensagem) {
         JOptionPane.showMessageDialog(null, mensagem);
    }
    public static boolean perguntar(String mensagem) {
//       int resp = JOptionPane.showConfirmDialog(null, "Confirmar exclusão?",
//       "Pergunta", JOptionPane.YES_NO_OPTION);
       
       int resp = JOptionPane.showConfirmDialog(null, "Confirmar exclusão?",
       "Pergunta", JOptionPane.YES_NO_OPTION);
       
        return false;
    }
    public static int strInt(String cad) {
        return 0;
    }
     public static String intStr(int num) {
        return "" ;
    }
     public static double strDouble(String cad) {
        return 0;
    }
      public static String doubleStr(String num) {
        return "";
    }
    public static java.util.Date strDate(String car) {
            try {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                return formato.parse(car);
            } catch (ParseException ex) {
                System.out.println("Houve uma falha em sua conversão de data");
            }
            return null;
    }

    public static String dateStr(java.util.Date cad) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(cad);
    }

    public static void habilitar(JTextField jtxtsabor, JTextField jtxtCodigo, JComboBox<String> jCbocopo, JComboBox<String> jCbotamanho, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
