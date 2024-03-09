/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_202100086;

/**
 *
 * @author Fati
 */
public class Doctor {
    private int codigo;
    private String nombre;
    private String genero;
    private String especialidad;
    private int telefono;   
    private int edad;

    public Doctor(int codigo, String nombre, String genero, String especialidad, int telefono, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.edad = edad;
    }


    //encapsulamiento
    
    
    //click derecho - Refactor - Encapsuate Fiels - Selecciona cmapos - encapsula

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    
        public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
