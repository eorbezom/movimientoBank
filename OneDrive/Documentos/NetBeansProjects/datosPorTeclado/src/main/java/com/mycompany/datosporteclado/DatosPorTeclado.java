/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datosporteclado;

import java.util.Scanner;





/**
 *
 * @author usuario
 */
public class DatosPorTeclado {

    public static void main(String[] args) {
        //programa para calcular promedio de notas
        Scanner scanner =new Scanner(System.in);
        
        //primera nota
        System.out.print("Ingres la primera nota :");
        double nota1 = scanner.nextDouble();
        if(nota1>=1&&nota1<=20){
            System.out.println("Genial ingreso correcto la nota de :"+ nota1);
        }else{
            System.out.println("ingrese un numero de 1 al 20 :"+nota1+" no es valido");
        }
        
         //segunda  nota
        System.out.print("Ingres la segunda nota :");
        double nota2 = scanner.nextDouble();
        if(nota2>=1 && nota2<=20){
            System.out.println("Genial ingreso correcto la nota de :"+ nota2);
        }else{
            System.out.println("ingrese un numero de 1 al 20 :"+nota2+" no es valido");
        }
        
         //tercera  nota         
        System.out.print("Ingres la tercera nota :");
        double nota3 = scanner.nextDouble();
        if(nota3>=1 && nota3<=20){
            System.out.println("genial ingresaste correcto la nota de "+nota3);
        }else{
            System.out.println("ingrese un numero de 1 al 20 :"+nota3+" no es valido");
        }
        
         //cuarta nota22
        System.out.print("Ingres la cuarta nota :");
        double nota4 = scanner.nextDouble();
        if(nota4>=1 && nota4<=20){
            System.out.println("genial ingresaste correcto la nota de "+nota4);
        }else{
            System.out.println("ingrese un numero de 1 al 20 :"+nota4+" no es valido");
        }
        
        double promedio = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("Su promedio de nota es :"+ promedio);
        
        if(promedio<=10){
            System.out.println("desaprobado");
        }else if(promedio>=11&& promedio<=12){
            System.out.println("requiere recuperacion");
        }else if(promedio>=13 && promedio<=15){
            System.out.println("Aprobado");
        }else if(promedio>=16 && promedio<=18){
            System.out.println(" muy buena aprobacion");
        }else if(promedio>=19 && promedio<=20){
            System.out.println("exelente aprobaste con diploma");
        }
        
    }
}
