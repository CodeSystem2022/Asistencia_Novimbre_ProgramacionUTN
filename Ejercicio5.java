package Ejercicios;

import java.util.Scanner;

public class Ejercicio5{ //Ejercicio5: Joaquin Zabala
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las filas");
        int fila=Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese las Columnas");
        int col=Integer.parseInt(entrada.nextLine());
        int matriz[][] = new int[fila][col];
        int vector[] = new int[fila];

        System.out.println("Rellenar Matriz");
        for (int i = 0; i < matriz.length; i++) {
            int sumCol=0;
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]" + "");
                matriz[i][j] = entrada.nextInt();
                sumCol+=matriz[i][j];
            }
            vector[i]=sumCol;
        }
        for (int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
}
