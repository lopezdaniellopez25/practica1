/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornospractica1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ejemplo3 {
        public static void main(String[] args) {
        
        double temperaturas[] = new double[7];
        String diasSemana[]={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        double suma = 0,max=0,min=0;
        int dia,posMax=0,posMin=0;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Anota temperatura de la semana");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(diasSemana[i] + ":");
            temperaturas[i] = sc.nextDouble();
            suma = suma + temperaturas[i];
            if (i==0){
                min=temperaturas[0];posMin=0;
                max=temperaturas[0];posMax=0;
            }
            else{
                if (temperaturas[i]>=max){
                    max=temperaturas[i];
                    posMax=i;
                }
                if (temperaturas[i]<=min){
                    min=temperaturas[i];
                    posMin=i;
                }
            }
        }

        System.out.println("La temperatura media ha sido:" + suma / 7);
        System.out.println("La máxima fue de "+max+" grados el "+diasSemana[posMax]);
        System.out.println("El mínimo fue de "+min+" grados el "+diasSemana[posMin]);
        do {
            System.out.println("Anota día del que quieras saber la temperatura:");
            dia = sc.nextInt();
        } while (dia<1 || dia>7);
        
        System.out.println("La temperatura fue "+ temperaturas[dia-1] );
    }
}
