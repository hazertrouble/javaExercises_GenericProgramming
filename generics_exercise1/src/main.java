/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Omar Ortega
 */

public class main {
    public static void main(String[] args) {
    OperaMate<Integer> iOb = new OperaMate<Integer>(5);
    System.out.println("El recíproco de 5 es: "+iOb.reciproco());
    System.out.println("La parte fraccionaria de 5 es: "+iOb.fraccion());
    System.out.println();
    OperaMate<Double> dOb = new OperaMate<Double>(15.25);
    System.out.println("El recíproco de 15.25 es: "+dOb.reciproco());
    System.out.println("La parte fraccionaria de 15.25 es: "+dOb.fraccion());
    }
}

class OperaMate <T extends Number>{
    // En este caso, el argumento de tipo
    // debe ser Number o una subclase en Number.
    T num;
        
    // Pase al constructor una referencia a un objeto numérico.
    OperaMate(T n){
        num=n;
    }

    //Devuelve el recíproco
    double reciproco(){
        return 1/num.doubleValue();
    }

    //Devuelve parte fraccionaria
    double fraccion(){
        return num.doubleValue()-num.intValue();
    }
}