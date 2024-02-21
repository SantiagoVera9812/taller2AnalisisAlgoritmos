package com.taller;

import java.util.List;

public class EsMitadImparRecursivo {

    public static boolean esMitadImpar(List<Integer> numeros) {
        int inicio = 0;
        int fin = numeros.size();
        int mitad = (inicio + fin) / 2;

        int countOdd = esMitadImparRecursivo(numeros, inicio, fin - 1, 0);
        
        return countOdd >= mitad;
    }

    private static int esMitadImparRecursivo(List<Integer> numeros, int inicio, int fin, int count) {
        
        if (inicio > fin) {
            return count;
        } else {
            
            return esMitadImparRecursivo(numeros, inicio + 1, fin, count + isOdd(numeros.get(inicio)));
        }
}

    private static int isOdd(int num) {
        return num % 2 == 1 ? 1 : 0;

    }
}