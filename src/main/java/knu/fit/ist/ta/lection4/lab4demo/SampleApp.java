/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection4.lab4demo;

import knu.fit.ist.ta.lection4.StringProcessing;

/**
 *
 * @author 38068
 */
public class SampleApp {

    public static void main(String[] args) {

        StringProcessing sp = new StringProcessing();
        Demo demo = new Demo();

        System.out.println("======= Words count =======");
        demo.calculateResult(sp.getList(sp.getText()));
        System.out.println(demo.getResultList());

        System.out.println("======= CharSequences count =======");
        demo.calculateResult(sp.getSet(sp.getText()), 2);
        System.out.println(demo.getResultList());
    }

}
