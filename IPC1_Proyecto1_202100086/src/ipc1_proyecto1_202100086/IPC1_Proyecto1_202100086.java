/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1_proyecto1_202100086;

import java.util.ArrayList;

/**
 *
 * @author Fati
 */
public class IPC1_Proyecto1_202100086 {
    
    //lista dinamica para los datos de doctor
    public static ArrayList<Doctor> ListaDoc = new ArrayList<>();

    public static int codigo=1;
    
    public static void main(String[] args) {
        
        ListaDoc.add(new Doctor(1, "Luis Gomez", "Hombre", "Pediatra",11111111,35));        
        ListaDoc.add(new Doctor(2, "Maria Ramirez", "Mujer", "Neurologa ",11112222,32));         
        
        InicioSesion ventana_inicio = new InicioSesion();
       RegistroDoc ventana_regdog = new RegistroDoc();

    }
    
    //lista estatica para los datos
    public static Object[][] convercionDoc(){
        int filas = ListaDoc.size();
        Object [][] arreglo= new Object[filas][6];
        
        for(int i=0;i< filas;i++){
            // toma la info y la almacena 
            Doctor Doctor_= ListaDoc.get(i);
            
            arreglo[i][0]=Doctor_.getCodigo();
            arreglo[i][1]=Doctor_.getNombre();
            arreglo[i][2]=Doctor_.getGenero();
            arreglo[i][3]=Doctor_.getEspecialidad();
            arreglo[i][4]=Doctor_.getTelefono();
            arreglo[i][5]=Doctor_.getEdad();
        }
        
        return arreglo;
    }
    
    // clase nueva para agregar doctores
    
    public static void agregarDoctor(int codigo,String nombre, String genero, String especialidad,int telefono, int edad){
        ListaDoc.add(new Doctor(codigo,nombre,genero,especialidad,telefono,edad));
    }
    
}
