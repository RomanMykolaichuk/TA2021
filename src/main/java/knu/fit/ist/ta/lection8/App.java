/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection8;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 38068
 */
public class App {

    static int algSize;
    static List<String> methodList;

    static {
        String[] temp = {"constTime", "logarythmic", "linear", "nLogN",
            "polynom", "exponential", "factorial"};

        methodList = Arrays.asList(temp);

    }

    public static void main(String[] args) throws Exception {
        algSize = 1;
        repeatAlgorytms(methodList, algSize);
        algSize = 2;
        repeatAlgorytms(methodList, algSize);
        algSize = 5;
        repeatAlgorytms(methodList, algSize);
        algSize = 7;
        repeatAlgorytms(methodList, algSize);
        algSize = 10;
        repeatAlgorytms(methodList, algSize);

    }

    public static void runAlgorythm(String methodName, int elements) throws Exception {

        Method method = OComplexity.class.getMethod(methodName, int.class);
        OComplexity oc = new OComplexity();
        System.out.println("===== " + methodName + " " + elements + " element(s) =====");
        long time = System.currentTimeMillis();
        method.invoke(oc, elements);
        time = System.currentTimeMillis() - time;

        System.out.println("element(s):" + time / 10);

    }

    public static void repeatAlgorytms(List<String> list, int elements) throws Exception {
        for (String item : list) {
            runAlgorythm(item, elements);
        }

        System.out.println("===============================================");
    }

}
