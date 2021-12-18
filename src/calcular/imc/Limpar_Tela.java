/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcular.imc;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Endi Jean
 */
public class Limpar_Tela {   
        
    public void LimparTela(JPanel container){
        Component components[] = container.getComponents();
        for(Component component : components){
            if (component instanceof JTextField){
                ((JTextField) component).setText(null);
            }
        }
    }
    
}
