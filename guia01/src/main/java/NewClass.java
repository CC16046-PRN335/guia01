
import com.mycompany.guia01.Utilities;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FRANK M
 */
public class NewClass {
    public static void main(String[] args) {
        Utilities u = new Utilities();
        
        String cadena="reree gfgfdf fdfhgfgh gfgfdf gfgfdf gfgfdf gfgfdf gfgfdf gfgfdf";
        String frase="gfgfdf";
        JOptionPane.showMessageDialog(null,u.getResume(cadena));
        JOptionPane.showMessageDialog(null,u.capitalizar(cadena));
        JOptionPane.showMessageDialog(null,"numero de coincidencias "+u.contarCoincidencias(frase, cadena));
        
       
    }
}
