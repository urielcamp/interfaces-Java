package interfaces;

public class Cuadrado implements Calculable{

    protected double lado;

    public Cuadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro(){
        return this.lado * 4;
    }


}
