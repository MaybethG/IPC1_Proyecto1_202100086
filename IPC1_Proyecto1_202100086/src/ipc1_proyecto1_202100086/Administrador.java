/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_202100086;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import jdk.jshell.execution.Util;
/**
 *
 * @author Fati
 */
public class Administrador extends JFrame implements ActionListener{
 public Administrador(){
     
     //Panel para las pestañas del Administrador 
     JTabbedPane panel = new JTabbedPane(JTabbedPane.TOP);
     //crear las pestañas
     JPanel pestaña1= new JPanel(null);
     JPanel pestaña2= new JPanel(null);
     JPanel pestaña3= new JPanel(null);
     
     //pestaña 1
     String[] Codigo= {"Codigo" ,"Nombre Completo", "Genero", "Especialidad","Telefono","Edad"};
     
     JTable tabladoctor= new JTable(IPC1_Proyecto1_202100086.convercionDoc(),Codigo);
     
     //detalle para un mejor acceso a los datos
     JScrollPane scrollP= new JScrollPane(tabladoctor);
     
     scrollP.setBounds(30, 90, 600, 500);
     pestaña1.add(scrollP);
     
    
     //hacer que el panel de pestañas se vea
     getContentPane().add(panel);
     
     panel.addTab("Doctores",pestaña1);
     panel.addTab("Pacientes",pestaña2);
     panel.addTab("Productos",pestaña3);
     
     //Ajustar el tamaño de la ventana
     this.setExtendedState(MAXIMIZED_BOTH);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setResizable(false);
     this.setVisible(true);  
 }    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
