
package Interfaz;

public class Ecuacion {
    
    double A, B, C, rootterm, sln1, sln2;
    
    public Ecuacion(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public String CalcSoluciones (double A, double B, double C){
        
        rootterm =(Math.pow(B, 2) - (4 * A * C));
        
        if (rootterm > 0){
            return "1";
        }else if (rootterm == 0){
            return "0";
        }else{
            return "2";
        }
        
    };

    public double getSln1() {
        sln1=((-B)+Math.sqrt(rootterm))/(2*A);
        return sln1;
    }

    public double getSln2() {
        sln2=((-B)-Math.sqrt(rootterm))/(2*A);
        return sln2;
    }
    
    
}
