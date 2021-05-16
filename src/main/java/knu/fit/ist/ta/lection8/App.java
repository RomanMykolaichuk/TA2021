/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection8;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 38068
 */
public class App {

    static int algRepeat;
    static List<String> methodList;

    static {
        String[] temp = {"constTime", "logarythmic", "linear", "nLogN",
            "polynom", "exponential", "factorial"};

        methodList = Arrays.asList(temp);

    }

    public static void main(String[] args) throws Exception {
        algRepeat = 1;
        repeatAlgorytms(methodList, algRepeat);
        algRepeat = 2;
        repeatAlgorytms(methodList, algRepeat);
        algRepeat = 5;
        repeatAlgorytms(methodList, algRepeat);
        algRepeat = 7;
        repeatAlgorytms(methodList, algRepeat);
        algRepeat = 10;
        repeatAlgorytms(methodList, algRepeat);

    }

    public static void runAlgorythm(String methodName, int n) throws Exception {

        Method method = OComplexity.class.getMethod(methodName, int.class);
        OComplexity oc = new OComplexity();
        System.out.println("===== " + methodName + " " + n + " time(s) =====");
        long time = System.currentTimeMillis();
        method.invoke(oc, n);
        time = System.currentTimeMillis() - time;

        System.out.println("time (s):" + time / 10);

    }

    public static void repeatAlgorytms(List<String> list, int times) throws Exception {
        for (String item : list) {
            runAlgorythm(item, times);
        }

        System.out.println("===============================================");
    }

}
