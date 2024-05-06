import interfaces.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Ejercicio 1
        Cuadrado cuadrado = new Cuadrado(4);
        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(4, 2);

        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetro());
        System.out.println();
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());
        System.out.println();
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());

        System.out.println("---------------------------------------");

        //Ejercicio 2

        int [] array = {23, 45, 21, 3, 1, 56, 34, 98};
        OrdenadorNumeros o = new OrdenadorNumeros(array);

        o.ordenarNumeros();
        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------");
        System.out.println();

        //Ejercicio 3

        EmpleadoAsalariado ea = new EmpleadoAsalariado(30);

        ea.calcularSalario();
        System.out.println(ea.mostrarInformacion());

        EmpleadoPorHora eh = new EmpleadoPorHora(150);
        eh.calcularSalario();
        System.out.println(eh.mostrarInformacion());

        System.out.println("-------------------------------------");
        System.out.println();

        //Ejercicio 4

        MySQLConexion mySQLConexion = new MySQLConexion("Desconectada");

        mySQLConexion.conectar();
        System.out.println(mySQLConexion.consultar());

        mySQLConexion.desconectar();
        System.out.println(mySQLConexion.desconectar());

        System.out.println("-------------------------------------");
        System.out.println();





    }
}