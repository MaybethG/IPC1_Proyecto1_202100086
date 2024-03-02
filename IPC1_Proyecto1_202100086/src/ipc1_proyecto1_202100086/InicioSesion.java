/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_202100086;

import javax.swing.*;

/**
 *
 * @author Fati
 */
public class InicioSesion extends JFrame {
    
    public InicioSesion(){
        //this es porque es a esa ventana en especifico
        this.setTitle("Inicio De Sesion");
        //setBounds se acomodan los detalles en la ventana
        this.setBounds(200,300,600,450);
        
        this.setLocationRelativeTo(null);
        
        //para que se mire la ventana
        this.setVisible(true);
        //para que cierre el programa cuando se seleccion el boton "x"
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
