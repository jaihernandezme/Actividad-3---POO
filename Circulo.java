package com.mycompany.figuras;

public class Circulo {
    int radio;
    
    Circulo(int radio) {
        this.radio = radio;
    }
    
    double calcularArea() {
        return Math.round(Math.PI*Math.pow(radio,2));
    }
   
    double calcularPerimetro() {
        return Math.round(2*Math.PI*radio);
    }
}
