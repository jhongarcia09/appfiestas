package org.example;

public class Empleado {
    //ATRIBUTOS
    String nombre;

    //CONSTRUCTOR

    public Empleado() {
    }

    //METODOS ESPECIALES

    //LA LICUADORA
    public String saludar(String nombresito) {
        String saludo = "Hola " + nombresito;
        return saludo;
    }


   public int sumar (int numero1, int numero2){
    int resultado=numero1+numero2;
    return resultado;
   }
}
