/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java2;

import java.util.Scanner;

public class Java2 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int a,b,c = 2 , soma, media;
        
             
        
        System.out.println(" \n digite tres numeros ");
        a = entrada.nextInt( );
        b = entrada.nextInt();
        c = entrada.nextInt();
        soma = a+b+c;
        media = soma/3;
        
        
        System.out.println("resultado " + media);
    }

}
