package com.mycompany.figuras;

public class TrianguloRectangulo {
    int base; 
    int altura; 
    
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea() {
        return Math.round((base * altura / 2));
    }
    
    double calcularPerimetro() {
        return Math.round((base + altura + calcularHipotenusa()));
    }
    
    double calcularHipotenusa() {
        return Math.round(Math.pow(base*base + altura*altura, 0.5));
    }
    
    String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            return ("Equilátero"); /* Todos sus lados son iguales */
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            return("Escaleno"); /* Todos sus lados son diferentes */
        else
            return("Isósceles"); /* De otra manera, es isósceles */
        }
    }
