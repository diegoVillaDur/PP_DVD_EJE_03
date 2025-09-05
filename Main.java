package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // POO Metodo= funcion principal
    public static void main(String[] args) {
        int numero;
        // Me permite leer desde el teclado se requiere una clase
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.printf("Introduzca un numero: ");
        numero = entradaTeclado.nextInt();
        // Saber si es par o impar (con el residuo)
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par ");
        } else {
            System.out.println("El numero " + numero + " es impar ");
        }
        // saber si es positivo, negativo o neutro,
        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo ");
        } else if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo ");
        } else {
            System.out.println("El numero " + numero + " es neutro con base a al recta numerica ");
        }
        // saber a que dia de la semana corresponde
        switch (numero) {
            case 1:
                System.out.println("El numero corresponde al lunes");
                break;
            case 2:
                System.out.println("El numero corresponde al martes");
                break;
            case 3:
                System.out.println("El numero corresponde al miercoles");
                break;
            case 4:
                System.out.println("El numero corresponde al jueves");
                break;
            case 5:
                System.out.println("El numero corresponde al viernes");
                break;
            case 6:
                System.out.println("El numero corresponde al sabado");
                break;
            case 7:
                System.out.println("El numero corresponde al domingo");
                break;
            default:
                System.out.println("El numero no corresponde a ningun dia de la semana");
                break;

        }
    }
}
