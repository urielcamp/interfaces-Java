package interfaces;

public class Circulo implements Calculable {

    protected double radio;
    protected double Pi = 3.1416;
    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return (this.radio * this.radio) * Pi;
    }

    @Override
    public double calcularPerimetro(){
        return (2 * Pi) * this.radio;
    }
}
