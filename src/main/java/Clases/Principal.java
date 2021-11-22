/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.chunks.generarchunk;
import static Clases.chunks.imprimir;
import java.util.Scanner;

/**
 *
 * @author Alfre
 */
public class Principal {

    public static void main(String args[]) {
        Scanner l = new Scanner(System.in);
        
        System.out.println("Ingrese el numero del menú\n1.-Crear chunks\n2.-Ver chunks\n3.-Eliminar chunks");
        int n = l.nextInt();
       
        switch (n) {
            case 1:
                System.out.println("Ingresa el numero de chunks a crear");
                int nc = l.nextInt();
                imprimir(generarchunk(nc));
                break;
            case 2:
                break;
            default:
                break;
        }
    }
}
