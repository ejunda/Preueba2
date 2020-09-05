/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Control;
import Negocio.Modelo.Agenda;

/**
 *
 * @author Erick Unda
 */
public class Persona {

    public String Nombre;
    public String Apellidos;
    public String Cedula;
    public String Email;
    public String Telefono;

public Persona(String Nombre, String Apellidos, String Cedula, String Email, String Telefono){
    this.Nombre = Nombre;
    this.Apellidos = Apellidos;
    this.Cedula = Cedula;
    this.Email = Email;
    this.Telefono = Telefono;
}
public Persona(){

}
}
