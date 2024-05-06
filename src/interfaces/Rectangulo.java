package interfaces;

public class Rectangulo implements Calculable {

    protected double lado;
    protected double ancho;

    public Rectangulo(double lado, double ancho){
        this.lado = lado;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea(){
        return this.lado * this.ancho;
    }

    @Override
    public double calcularPerimetro(){
        return this.lado + this.ancho;
    }

}
