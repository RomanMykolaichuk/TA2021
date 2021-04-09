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
public class AppLection3 {

    public static void main(String[] args) {
        Tasks1 t1 = new Tasks1();

        t1.p11b(1, 5);
        t1.p113(2, 30);
        t1.p113a(2, 30);
        t1.p113b(2, 30);
        t1.p1121(10);

        TasksAdditional ta1 = new TasksAdditional();
        System.out.println("Value(primitive)");
        System.out.println(ta1.valueProcessing(2));
        System.out.println("Reference(object)");
        System.out.println(ta1.referenceProcessing(2));

    }
}
