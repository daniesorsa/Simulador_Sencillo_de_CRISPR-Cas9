package proyectofinalp1_danielsorto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProyectoFinalP1_DanielSorto {
    private static ArrayList<Mutacion> listaDeEnfermedades = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // Anemia Falciforme
        // Mutacion que se da en la pos 5 por un cambio de T a A
        char[] falciformeMutada = {'G', 'A', 'T', 'C', 'G', 'T', 'A', 'T', 'C'};
        char[] falciformeSana =   {'G', 'A', 'T', 'C', 'G', 'A', 'A', 'T', 'C'};
        listaDeEnfermedades.add(new Mutacion(
            "Anemia Falciforme", //nombre
            "Un trastorno sanguíneo que deforma los glóbulos rojos. La mutación es un cambio de Timina (T) por Adenina (A).", //descripcion
            falciformeMutada, //secuencia mutada
            falciformeSana, //secuencia normal
            5 //posicion del error genetico
       ));

        // Beta talasemia
        // Mutacion dada en la posicion 2 por un cambio de A a G
        char[] talasemiaMutada = {'A', 'T', 'G', 'A', 'A', 'C', 'T', 'A'};
        char[] talasemiaSana =   {'A', 'T', 'G', 'G', 'A', 'C', 'T', 'A'};
        listaDeEnfermedades.add(new Mutacion(
            "Beta Talasemia", //nombre
            "Trastorno que reduce la producción de hemoglobina. La mutación afecta la maduración de la proteína. (Cambio A por G)", //descripcion
            talasemiaMutada, //secuencia mutada
            talasemiaSana, //secuencia normal
            3
        ));

        //Amiloidosis hATTR
        //Mutacion dada en la posicion 2 por una cambio de a G a C
        char[] amiloidosisMutada = {'T', 'A', 'G', 'T', 'T', 'C', 'G'};
        char[] amiloidosisSana =   {'T', 'A', 'C', 'T', 'T', 'C', 'G'};
        listaDeEnfermedades.add(new Mutacion(
            "Amiloidosis hATTR", //nombre
            "Acumulacion de proteinas dañinas en el cuerpo. Se busca corregir el gen TTR en el higado. (Cambio G por C)", //descripcion
            amiloidosisMutada, //secuencia mutada
            amiloidosisSana, //secuencia normal
            2 //
        ));

        //Fibrosis Quistica
        // Mutación dada en posicion 6 por un cambio de C a G
        char[] fibrosisMutada = {'A', 'T', 'C', 'A', 'T', 'A', 'C', 'G'};
        char[] fibrosisSana =   {'A', 'T', 'C', 'A', 'T', 'A', 'G', 'G'};
        listaDeEnfermedades.add(new Mutacion(
            "Fibrosis Quística", //Nombre
            "Afecta las glandulas productoras de moco y sudor. La mutacion mas comun es grande, "
                    + "pero simularemos una correccion C por G por efectos de aprendizaje.", // descripcion
            fibrosisMutada, //secuencia mutada
            fibrosisSana, //secuencia correcta
            6 //posicion mutacion
        ));
        int selMenu = 0;
        do {
            System.out.println("¡Bienvenido al Laboratorio de Ingenieria Genetica con CRISPR-Cas9! Tu trabajo será ser el **ARN Guía (gRNA)** para la proteína Cas9. Identificaras la posición precisa (el índice) de la mutación en la secuencia para lograr una **Reparación Dirigida (HDR)** ¡Elige una de las siguientes mutaciones genéticas para cambiar el mundo!\n\n");

            for(int i = 0; i < listaDeEnfermedades.size(); i++) {
                System.out.println((i + 1) + ") " + listaDeEnfermedades.get(i).getNombre() + "\n");
            }
            System.out.println("0) Salir"); 
            selMenu = validacion(0,4);
            char[][] matrizAdnMutado  = matrizAdn(listaDeEnfermedades.get(selMenu).getSecuenciaMutada());
        }while(selMenu != 0);
     }
    public static int validacion(int a, int b) {
        System.out.print("\nIngresa una opcion entre " + a + " y " + b +" :");
        int num = sc.nextInt();
        while(num < a || num > b) {
            System.out.print("Opcion no valida intenta de nuevo: ");
            num = sc.nextInt();
        }
        return num;
    }
    
    public static char[][] matrizAdn(char[] secuencia) {
        char[][] dobleHelice = new char[2][secuencia.length];
        for(int i=0; i < secuencia.length; i++) {
            dobleHelice[0][i] = secuencia[i];
            dobleHelice[1][i] = CRISPR.complementoDeAdn(secuencia[i]);
        }
        return dobleHelice;
    }
}
