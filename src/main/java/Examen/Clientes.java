/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

/**
 *
 * @author Dell G3
 */
public class Clientes {
    String nombre;
    String apellido;
    String NIT;
    String nacimiento;
    
    public static void main(String[] args){
        Clientes cliente1 = new Clientes();
        Clientes cliente2 = new Clientes();
        
        cliente1.nombre = "Jose";
        cliente1.apellido = "Vasquez";
        cliente1.NIT = "3401516-7";
        cliente1.nacimiento = "25-09-2002";
        
        cliente2.nombre = "Carlos";
        cliente2.apellido = "Soza";
        cliente2.NIT = "32344547-2";
        cliente2.nacimiento = "24-11-1997";    
        
        System.out.println("El nombre del cliente 1 es: "+cliente1.nombre);
        System.out.println("su apellido es: "+cliente1.apellido);
        System.out.println("su NIT es: "+cliente1.NIT);
        System.out.println("y nacio el: "+cliente1.nacimiento);  
        
        System.out.println();
        
        System.out.println("El nombre del cliente 2 es: "+cliente2.nombre);
        System.out.println("su apellido es: "+cliente2.apellido);
        System.out.println("su NIT es: "+cliente2.NIT);
        System.out.println("y nacio el: "+cliente2.nacimiento);         
}
}