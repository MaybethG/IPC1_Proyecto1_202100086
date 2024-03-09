/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_202100086;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Fati
 */
public class RegistroPaciente extends JFrame implements ActionListener{
    private JTextField nombreRtxt;
    private JTextField apellidoRtxt;
    private JPasswordField contraseñaRtxt;
    private JTextField edadRtxt;    

    private JComboBox<String> generoComboBox;
    
    public RegistroPaciente(){
        //titulo de la ventana
        JLabel titleLabel = new JLabel("Registro Paciente");
        titleLabel.setBounds(215,2,200, 50);
        this.add(titleLabel);
        
        //etiqueta para identificar el campo de texto
        JLabel nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(70,80,80,20);
        this.add(nombreLabel);
        
        JLabel apellidoLabel = new JLabel("Apellido");
        apellidoLabel.setBounds(70,120,80,20);
        this.add(apellidoLabel);
        
        JLabel contraseñaLabel = new JLabel("Contraseña");
       contraseñaLabel.setBounds(70,160,80,20);
        this.add(contraseñaLabel);
 
        JLabel edadLabel = new JLabel("Edad");
        edadLabel.setBounds(70,200,80,20);
        this.add(edadLabel);
               
        JLabel generoLabel = new JLabel("Genero");
        generoLabel.setBounds(70,240,80,20);
        this.add(generoLabel);
        
        //combo box para elegir una de las dos opciones
        String[] genero = {"Masculino", "Femenino"};
        generoComboBox = new JComboBox<> (genero);
        generoComboBox.setBounds(160, 240,200, 20);
        this.add(generoComboBox );
        
        JButton regbutton = new JButton("Registro");
        regbutton.setBounds(180, 280, 150, 35);
        regbutton.setBackground(new Color(82, 255, 247));
        regbutton.addActionListener(this);
        this.add(regbutton);
        
        //se crea campo de texto y posicion
        nombreRtxt = new JTextField();
        nombreRtxt.setBounds(160, 85, 200, 20);
        this.add(nombreRtxt);
        
        apellidoRtxt = new JTextField();
        apellidoRtxt.setBounds(160, 120, 200, 20);
        this.add(apellidoRtxt);
        
        contraseñaRtxt = new JPasswordField();
        contraseñaRtxt.setBounds(160, 160, 200, 20);
        this.add(contraseñaRtxt);
        
        edadRtxt = new JTextField();
        edadRtxt.setBounds(160, 200, 200, 20);
        this.add(edadRtxt);
        
        //this es porque es a esa ventana en especifico
        this.setTitle("Registro");
        //setBounds se acomodan los detalles en la ventana
        this.setBounds(150,210,500,360);
        //localizacion de la ventana -medio-
        this.setLocationRelativeTo(null);
        //es para que al poner mas elementos los podamos ubicar con libertad
        this.setLayout(null);
        //no permite modificar el tamaño de la ventana
        this.setResizable(false);
        //para que se mire la ventana
        this.setVisible(true);
        //para que cierre el programa cuando se seleccion el boton "x"
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //para obtener los datos
       if (e.getActionCommand().equals("Registro")){
           String nombre = nombreRtxt.getText();
           String contraseña = new String(contraseñaRtxt.getPassword());
           System.out.println("Nombre: " + nombre);
           System.out.println("Contraseña: " + contraseña);
       }
               this.dispose();
    }
    
    
}
