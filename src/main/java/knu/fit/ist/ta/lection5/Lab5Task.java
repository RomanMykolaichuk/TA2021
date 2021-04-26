/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection5;

import java.util.ArrayList;
import java.util.List;
import knu.fit.ist.ta.Lection3.Tasks2;

/**
 *
 * @author 38068
 */
public class Lab5Task {

    private int randSeed;
    String task = "\nВаріант%d. 1.Удосконалити алгоритм %s та застосувати його для аналізу тексту з минулої лабораторної роботи \n"
            + "2.Згенерувати список  %d об'єктів з полями типу String та %s.\n"
            + "3.Створити та реалізувати алгорими сортування ( %s ) та пошуку  ( %s ) для згенерованого у п.2 списку \n"
            + "\n\n";

    String s1 = "abcdefghijklmnopqrstuvwxyz";
    String[] s2 = {"sortApproach1", "sortApproach2", "sortApproach3", "linearSearch", "binarySearch", "jumpSearch"};
    String[] s3 = {"byte", "short", "long", "int"};
    int[] d1 = {3, 4, 5, 6, 7, 8};
    int[] d2 = {3, 4, 5, 6, 7, 8};

    public Lab5Task(int randSeed) {
        this.randSeed = randSeed;
    }

    public Lab5Task() {
    }

    public List<String> getTaskLab5() {
        List<String> result = new ArrayList<>();
        Tasks2 t2 = new Tasks2();

        //int randSeed = 452;
        //int randSeed = 129;
        int[] x1 = t2.arrayShuffle(t2.arrayPopulation2(25, 10000, 30000), randSeed);
        int[] x2 = t2.arrayShuffle(t2.arrayRange(10000), randSeed + 1);
        int[] x3 = t2.arrayShuffle(t2.arrayPopulation2(25, 0, 3), randSeed + 2);

        for (int i = 0; i < 25; i++) {

            String[] variant = t2.arrayShuffle(s2, randSeed + i);
            String[] variant1 = t2.arrayShuffle(s3, randSeed + 10 * i);

            String temp = String.format(task, i + 1, variant[0], x1[i], s3[x3[i]], variant[1], variant[2]);
            result.add(temp);
        }

        return result;
    }

    public int getRandSeed() {
        return randSeed;
    }

    public void setRandSeed(int randSeed) {
        this.randSeed = randSeed;
    }
}
