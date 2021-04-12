/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.Lection3;

/**
 *
 * @author 38068
 */
public class Tasks0 {

    public int valueProcessing(int a) {
        int b = a;
        int c = b;
        c++;
        return b;
    }

    public int referenceProcessing(int a) {
        SomeInt b = new SomeInt(a);
        SomeInt c = b;
        c.intField++;

        return b.intField;
    }

    public String stringProcessing(int a) {
        String b = "" + a;
        String c = b;
        c = "" + ++a;
        return b;
    }

    class SomeInt {

        public int intField;

        SomeInt(int intField) {
            this.intField = intField;
        }
    }
}
