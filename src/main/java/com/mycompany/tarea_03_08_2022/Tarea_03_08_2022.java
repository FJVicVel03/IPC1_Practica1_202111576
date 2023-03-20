/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea_03_08_2022;

import java.util.Scanner;

/**
 *
 * @author Fernando Vicente
 */
public class Tarea_03_08_2022 {
        static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int con = 0;
        String []nombre = new String[con];
        int []n1 = new int[con];
        int []n2 = new int[con];
        int []n3 = new int[con];
        float []suma = new float[con];
        float []prom=new float[con];
        
        System.out.println("Bienvenido al cálculod de promedios.");
        System.out.print("Ingrese cuantos promedios desea sacar: ");
        con = scan.nextInt();
        
        
        if(con<19)
        {
            for (int i = 0; i<con;i++)
        {
            System.out.println("Ingrese nombre del alumno #" + i+1);
            System.out.print("Nombre:" + nombre[i]);
            
            
        }
        }else{System.exit(0);}
        
        
    }
}
