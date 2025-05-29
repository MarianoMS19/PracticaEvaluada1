/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class PE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String lectura ;
    double salario;
    lectura = JOptionPane.showInputDialog("Digite su salario");
    salario = Integer.parseInt(lectura);
    
    double CCSS;
    double asociacion;
    CCSS = (salario*14.33/100) ;    
    asociacion = ((salario-CCSS)*2.5/100);
    
    JOptionPane.showMessageDialog(null,"La empresa deberá abonar a la CCSS el monto de "+CCSS+ " colones por concepto de \n" +
"SEM y IVM");
    
    JOptionPane.showMessageDialog(null,"Para la asociación de la empresa se le asigna un valor "+ asociacion+" colones");
            
    } 
    
}
