/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection8;

import java.lang.reflect.Method;

/**
 *
 * @author 38068
 */
public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("===== 1 time =====");
        System.out.println("===== Const =====");
        runAlgorythm("constTime", 1);
        System.out.println("===== Linear =====");
        runAlgorythm("linear", 1);
        System.out.println("===== Logarythmic =====");
        runAlgorythm("logarythmic", 1);
        System.out.println("===== NlogN =====");
        runAlgorythm("nLogN", 1);
        System.out.println("===== Polynom =====");
        runAlgorythm("polinom", 1);

        System.out.println("===== 10 times =====");
        System.out.println("===== Sum =====");
        runAlgorythm("sum", 10);

    }

    public static void runAlgorythm(String methodName, int n) throws Exception {

        Method method = OComplexity.class.getMethod(methodName, int.class);
        OComplexity oc = new OComplexity();

        long time = System.currentTimeMillis();

        method.invoke(oc, n);

        time = System.currentTimeMillis() - time;
        System.out.println("time (s*10):" + time / 100);

    }

}
