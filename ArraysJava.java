/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysjava;

/**
 *
 * @author usuario
 */
import java.util.Arrays;
import java.util.Scanner;
public class ArraysJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner( System.in );
        int[] calificaciones = new int[5];
        for( int i = 0; i <= calificaciones.length-1; i++){
            int chingaTuMadreAmlo = i + 1;
            System.out.println("Ingresa el numero: " + chingaTuMadreAmlo );
            calificaciones[i] = input.nextInt();
    }
        System.out.println("Calificaciones sin ordenar");
        System.out.println(Arrays.toString( calificaciones ));
        System.out.println("Calificaciones Ordenadas");
        Arrays.sort( calificaciones );
        System.out.println(Arrays.toString( calificaciones));
        
    }
    
}
