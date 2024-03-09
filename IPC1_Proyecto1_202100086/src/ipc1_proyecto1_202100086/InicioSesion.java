   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_202100086;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author Fati
 */
public class InicioSesion extends JFrame implements ActionListener{
    //se crea identificadores
    private JTextField usuariotxt;
    private JPasswordField contraseñatxt;
    
    public InicioSesion(){
        //titulo de la ventana
        JLabel titleLabel = new JLabel("Inicio Sesion");
        titleLabel.setBounds(215,2,100, 50);
        this.add(titleLabel);
        
        //imagen en la ventana
        ImageIcon iconoinicio = new ImageIcon(getClass().getResource("../imagenes/icono-inicio.jpg")) ;
        Image dimensiones= iconoinicio.getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH);
        ImageIcon ajustesicono = new ImageIcon(dimensiones);
        
        //mostrar la imagen
        JLabel imagenLabel = new JLabel(ajustesicono);
        imagenLabel.setBounds(190,40,120,100);
        this.add(imagenLabel);
        
        
        //etiqueta para identificar el campo de texto
        JLabel usuarioLabel = new JLabel("Codigo");
        usuarioLabel.setBounds(70,160,80,20);
        this.add(usuarioLabel);
        
        JLabel contraseñaLabel = new JLabel("Contraseña");
        contraseñaLabel.setBounds(70,200,80,20);
        this.add(contraseñaLabel);
        
        //se crea campo de texto y posicion
        usuariotxt = new JTextField();
        usuariotxt.setBounds(160, 160, 200, 20);
        this.add(usuariotxt);
        
        contraseñatxt = new JPasswordField();
        contraseñatxt.setBounds(160, 200, 200, 20);
        this.add(contraseñatxt);
        
        //botones
        //ctr+espacio salen opciones
        JButton iniciobutton = new JButton("Ingreso de sesion");
        iniciobutton.setBounds(180, 240, 150, 35);
        iniciobutton.setBackground(new Color(82, 255, 247));
        iniciobutton.addActionListener(this);
        this.add(iniciobutton);
        
        JButton registrobutton = new JButton("Registrate");
        registrobutton.setBounds(180, 280, 150, 35);
        registrobutton.setBackground(new Color(82, 255, 247));
        registrobutton.addActionListener(this);
        this.add(registrobutton);
        
        
        //this es porque es a esa ventana en especifico
        this.setTitle("Inicio De Sesion");
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
    //se colocan los eventos de los botones
    public void actionPerformed(ActionEvent J) {
        //Entre comillas el texto que dice el boton
                //para obtener los datos
        if(J.getActionCommand().equals("Ingreso de sesion")){
           String codigo = usuariotxt.getText();
           String contraseña = new String(contraseñatxt.getPassword());
           System.out.println("Nombre: " + codigo);
           System.out.println("Contraseña: " + contraseña);
           
           if(codigo.equals("202100086") && contraseña.equals("proyecto1IPC1")){
               Administrador ventana_admin = new Administrador();
               this.dispose();
               
           }else{
               JOptionPane.showMessageDialog(this, "Error de ingreso", "Codigo o contraseña imcorrectos", 0);
           }
           
        }else if (J.getActionCommand().equals("Registrate")){
        System.out.println("Registro nuevo");
        RegistroPaciente ventana_registroP = new RegistroPaciente();
               this.dispose();
    }
       }
    
}
