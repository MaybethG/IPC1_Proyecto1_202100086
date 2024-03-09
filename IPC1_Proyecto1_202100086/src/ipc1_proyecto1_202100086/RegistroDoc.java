/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_202100086;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Fati
 */
public class RegistroDoc extends JFrame implements ActionListener{
    private JTextField nombreDRtxt;
    private JTextField generoDRtxt;
    private JTextField especialidadDRtxt;
    private JPasswordField contraseñaDRtxt;
    private JTextField telefonoDRtxt;    
    private JTextField edadDRtxt;
    
    private JComboBox<String> generoComboBox;
    
    JButton registroDbtn;
    
    public RegistroDoc(){
         //titulo de la ventana
        JLabel titleLabel = new JLabel("Registro Doctor");
        titleLabel.setBounds(215,2,200, 50);
        this.add(titleLabel);
        
        //etiqueta para identificar el campo de texto
        JLabel nombreDLabel = new JLabel("Nombre Completo");
        nombreDLabel.setBounds(70,73,130,40);
        this.add(nombreDLabel);
        
        JLabel especialidadLabel = new JLabel("Especialidad");
        especialidadLabel.setBounds(70,120,80,20);
        this.add(especialidadLabel);
        
        JLabel contraseñaDLabel = new JLabel("Contraseña");
       contraseñaDLabel.setBounds(70,160,80,20);
        this.add(contraseñaDLabel);

        JLabel telefonoDLabel = new JLabel("Telefono");
        telefonoDLabel.setBounds(70,200,80,20);
        this.add(telefonoDLabel);
 
        JLabel edadDLabel = new JLabel("Edad");
        edadDLabel.setBounds(70,240,80,20);
        this.add(edadDLabel);
               
        JLabel generoDLabel = new JLabel("Genero");
        generoDLabel.setBounds(70,280,80,20);
        this.add(generoDLabel);
        
        //combo box para elegir una de las dos opciones
        String[] genero = {"Masculino", "Femenino"};
        //se detalla el vector de las opciones
        generoComboBox = new JComboBox<> (genero);
        generoComboBox.setBounds(190, 280,200, 20);
        this.add(generoComboBox );
        
        registroDbtn = new JButton("Registrado");
        registroDbtn.setBounds(170, 320, 200, 20);
        registroDbtn.addActionListener(this);
        this.add(registroDbtn);
        
        //se crea campo de texto y posicion
        nombreDRtxt = new JTextField();
        nombreDRtxt.setBounds(190, 85, 200, 20);
        this.add(nombreDRtxt);
        
        especialidadDRtxt = new JTextField();
        especialidadDRtxt.setBounds(190, 120, 200, 20);
        this.add(especialidadDRtxt);
        
        contraseñaDRtxt = new JPasswordField();
        contraseñaDRtxt.setBounds(190, 160, 200, 20);
        this.add(contraseñaDRtxt);
        
        telefonoDRtxt = new JTextField();
        telefonoDRtxt.setBounds(190, 200, 200, 20);
        this.add(telefonoDRtxt);
        
        edadDRtxt = new JTextField();
        edadDRtxt.setBounds(190, 240, 200, 20);
        this.add(edadDRtxt);
        
        
        
        
                //this es porque es a esa ventana en especifico
        this.setTitle("Registro Doctor");
        //setBounds se acomodan los detalles en la ventana
        this.setBounds(150,210,500,390);
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
        if(e.getSource() == registroDbtn){
            String nombreD = nombreDRtxt.getText();
            String especialidad = especialidadDRtxt.getText();
            String contraseña = new String(contraseñaDRtxt.getPassword());
            String telefonoD = telefonoDRtxt.getText() ;    
            String edadD = edadDRtxt.getText();
            String selecgenero = (String) generoComboBox.getSelectedItem();
            
            //IPC1_Proyecto1_202100086.agregarDoctor(IPC1_Proyecto1_202100086.codigo, nombreD, especialidad,contraseña, telefonoD,edadD,selecgenero);
            IPC1_Proyecto1_202100086.codigo++;
        }
    }
    
    
}
