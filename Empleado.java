
package Interfaz;

public class Empleado {
    
    double horas, valor, porcentaje, salneto, salbruto;
    
    
    public Empleado (double horas, double valor, double porcentaje){
        
        this.horas = horas;
        this.valor = valor;
        this.porcentaje = porcentaje;
        
    }
    
    public double getSalbruto() {
        
        salbruto = horas*valor;
        return salbruto;
    }
    
    public double getSalneto() {
        
        salneto = salbruto - (salbruto*(porcentaje/100));
        return salneto;
    }

    
    
    
    
}


