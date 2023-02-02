package org.example;

public class Main {
    public static void main(String[] args) {

  Empleado objetoTipoEmpleado = new Empleado();

  objetoTipoEmpleado.nombre="jhon";

  //ACCEDIENDO A LOS METODOS DE MI CLASE EMPLEADO
        String resultado=objetoTipoEmpleado.saludar("lucho diaz");
        System.out.println(objetoTipoEmpleado.saludar("jhon meneses"));
        int sumatoria= objetoTipoEmpleado.sumar(5,3);

        //SAlIDAS POR CONSOLAS
        System.out.println(objetoTipoEmpleado.nombre);
        //ACCEDER A MOSTRAR EL RETORNO DE LA FUNCION
        System.out.println(objetoTipoEmpleado.saludar("como estas"));
        System.out.println(resultado);
        System.out.println(sumatoria);


    }
}