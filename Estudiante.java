
package Interfaz;
public class Estudiante {
    String nombre;
    int estrato, NumIns;
    int costoMatricula=50000;
    Double patrimonio;
    
    public Estudiante(String nombre, int estrato, Double patrimonio, int NumIns) {
        this.nombre = nombre;
        this.estrato = estrato;
        this.patrimonio = patrimonio;
        this.NumIns = NumIns;
    }

    public int getCostoMatricula() {
        
        if( patrimonio > 2000000 && estrato > 3 ) {
            
            costoMatricula = (int) (costoMatricula + (0.03*patrimonio));
        }
        
        return costoMatricula;
    }
              
}
