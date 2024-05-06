package interfaces;

public class EmpleadoPorHora implements Empleado {

    //siendo salario lo que gana un empleado por dia de trabajo
    protected int salario;
    protected int sueldo;

    public EmpleadoPorHora(int salario){
        this.salario = salario;
    }

    @Override
    public int calcularSalario(){
        sueldo = salario / 8;
        return sueldo;
    }

    public String mostrarInformacion(){
        return "el sueldo del empleado por cada hora de trabajo es de: " + sueldo;
    }




}
