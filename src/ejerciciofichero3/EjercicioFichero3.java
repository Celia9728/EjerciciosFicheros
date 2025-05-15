package ejerciciofichero3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioFichero3 {

    public static void main(String[] args) {

        File fichero = new File("numeros.txt");
        FileReader fr = null;
        BufferedReader br = null;
        int contadorMayor = 0;
        int contadorMenor = 0;

        int mayor = 0;
        int menor = 0;

        boolean primeraVez = false;

        try {
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea = br.readLine();

            while (linea != null) {
                int numero = Integer.parseInt(linea);

                if (!primeraVez) {
                    mayor = numero;
                    menor = numero;
                    primeraVez = true;
                }

                if (numero > mayor) {
                    mayor = numero;
                    contadorMayor = 1;
                } else if (numero == mayor) {
                    contadorMayor++;
                }

                if (numero < menor) {
                    menor = numero;
                    contadorMenor = 1;
                } else if (numero == mayor) {
                    contadorMenor++;
                }
            }

            System.out.println(contadorMayor);
            System.out.println(contadorMenor);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
