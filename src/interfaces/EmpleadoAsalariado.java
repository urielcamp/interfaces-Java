package interfaces;

public class EmpleadoAsalariado implements Empleado{

    protected int salario;
    protected int sueldo;

    public EmpleadoAsalariado(int salario){
        this.salario = salario;
    }

    @Override
    public int calcularSalario(){
        sueldo = salario * 30;
        return sueldo;
    }

    public String mostrarInformacion(){
        return "el salario mensual del empleado es: " + sueldo;
    }



}
