
package Interfaz;

public class Eqtriangle {
    
    double lado, perimetro, area, altura;
    
    public Eqtriangle (double lado){
        
        this.lado = lado;
    
    }
    
    public double getPerimetro(){
        
        perimetro = lado*3;
        return perimetro;
    }
    
    public double getAltura(){
        
        altura =  (Math.sqrt(3)/2)*lado;
        return altura;
    }
    
    public double getArea(){
        
        area = (lado*altura)/2;
        return area;
    }
}
