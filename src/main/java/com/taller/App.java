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
            int halfSize = numeros.size() / 2;
            int oddCount = 0;
            for (int numero : numeros) {
                if (!EsHonesto.esPar(numero)) {
                    oddCount++;
                    System.out.println(numero + " Numero impar encontrado");
                }

                if (oddCount >= halfSize) {
                    System.out.println("Sistema comprometido");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

