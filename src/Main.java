import interfaces.Circulo;
import interfaces.Cuadrado;
import interfaces.OrdenadorNumeros;
import interfaces.Rectangulo;
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



    }
}