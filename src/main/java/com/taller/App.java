package com.taller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
           String rutaArchivo = "src/main/java/com/taller/archivo.txt"; 

        try {
            
            long startTime = System.currentTimeMillis();
            
            List<Integer> numeros = new ArrayList<>();

            numeros = LeerArchivo.readAndProcessFile(rutaArchivo);
            int halfSize = numeros.size() / 2;
            int oddCount = 0;
            int contador = 0;
            for (int numero : numeros) {
                contador++;
                if (!EsHonesto.esPar(numero)) {
                    oddCount++;
                    
                }

                if (oddCount >= halfSize) {
                    System.out.println("Sistema comprometido");
                    break;
                }
            }
            if(contador == numeros.size())
            System.out.println("Sistema seguro");
            long endTime = System.currentTimeMillis();
    
            long elapsedTime = endTime - startTime;
            System.out.println("Tiempo de ejecución: " + (double) elapsedTime / 1000 + " segundos");
        
            System.out.println("************************************************");
            long startTime2 = System.currentTimeMillis();
            if (EsMitadImparRecursivo.esMitadImpar(numeros)) {
                System.out.println("Sistema comprometido");
            } else {
                System.out.println("Sistema seguro");
            }

            long endTime2 = System.currentTimeMillis();
    
            // Calcula y muestra el tiempo de ejecución en segundos
            long elapsedTime2 = endTime2 - startTime2;
            System.out.println("Tiempo de ejecución: " + (double) elapsedTime2 / 1000 + " segundos");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

