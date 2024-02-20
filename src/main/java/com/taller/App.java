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
            List<Integer> numeros = new ArrayList<>();
            numeros = LeerArchivo.readAndProcessFile(rutaArchivo);

            for (int numero : numeros) {
                if (EsHonesto.esPar(numero)) {
                    System.out.println(numero + " es par");
                } else {
                    System.out.println(numero + " es impar");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

