/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.de.estudio1;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Persona {

    private String nombre;
    private String correo;
    private int añoNacimiento;
    private int edad;

    public Persona(String nombre, String correo, int añoNacimiento, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.añoNacimiento = añoNacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos para pedir y mostrar datos y calcular la edad 
    public void calcularEdad() {
        int añoActual = Integer.parseInt(JOptionPane.showInputDialog("Indique el año actual: "));
        edad = añoActual - añoNacimiento;
    }

    public void pedirDatos() {
        nombre = JOptionPane.showInputDialog("Indique el nombre de la persona: ");
        correo = JOptionPane.showInputDialog("Ingrese la edad de la persona: ");
        añoNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento: "));
        calcularEdad();
    }

    public String mostrarDatos() {
        String mensaje = "Nombre: " + nombre
                + "\nCorreo: " + correo
                + "\nAño nacimiento: " + añoNacimiento
                + "\nEdad: " + edad
                + "\n" + (edad >= 18 ? "Es mayor de edad" : "Es menor de edad");
        return mensaje;
    } 

}
