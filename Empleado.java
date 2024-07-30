
package Interfaz;

public class Empleado {
    
    double salario, horas, sueldo;
    String name;
    
    public Empleado (double salario, double horas){
        
        this.salario = salario;
        this.horas = horas;
    }

    public double getSueldo() {
        
        sueldo = salario*horas;
        return sueldo;
    }
       
}
