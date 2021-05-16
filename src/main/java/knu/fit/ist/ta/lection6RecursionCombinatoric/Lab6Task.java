/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection6RecursionCombinatoric;

import java.util.Random;
import knu.fit.ist.ta.Lection3.Tasks2;

/**
 *
 * @author 38068
 */
public class Lab6Task {

    static String task = "\nВаріант%d. 1.Створити симетричне бінарне дерево пошуку з елементів:\n %s.\n (написати окремий метод для визначення порядку додавання елементів до дерева)\n \n "
            
            + "2.Вивести на екран початкове дерево та результати виконання операцій над ним, що розглядалися на занятті\n"
            + "\n\n";

    public static void task2(int seed, int members) {
        Tasks2 t = new Tasks2();
        Random random = new Random(seed);
        int arrayMax = random.nextInt(24);

        for (int i = 1; i <= members; i++) {
            int[] result = new int[8];
            int[] input = t.arrayShuffle(t.arrayRange(arrayMax+8));
            for (int j = 0; j < 8; j++) {

                
                result[j] = input[j];
            }

            System.out.println(String.format(task, i,t.arrayPrint(result)));
        }

    }

    public static void main(String[] args) {
        Tasks2 t2 = new Tasks2();

        System.out.println("IP-11");        
        
        System.out.println(t2.arrayPrint(t2.arrayShuffle(t2.arrayRange(25), 397)));
        
        /* System.out.println("===== task2 =====");
        task2(397,25);
        */
         System.out.println("===== task3 =====");
         
         System.out.println(t2.arrayPrint(t2.arrayShuffle(t2.arrayRange(25), 793)));
        
        System.out.println("IP-12");
        System.out.println(t2.arrayPrint(t2.arrayShuffle(t2.arrayRange(25), 273)));
        /*  System.out.println("===== task2 =====");
        
        task2(273,24);
        */
           System.out.println("===== task3 =====");
           
           System.out.println(t2.arrayPrint(t2.arrayShuffle(t2.arrayRange(25), 372)));
           
           
    }

}
