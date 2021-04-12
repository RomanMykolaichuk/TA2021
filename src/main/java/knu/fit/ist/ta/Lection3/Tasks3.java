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
public class Tasks3 {




// a(3a-b)/(3b-a)
 
    
    
    
    public double calculate(int a, int b) {
        double result = a * helper(a, b) / helper(b, a);
        //result = 1 / 5;
        return result;
    }

    private double helper(int a, int b) {
        return 3 * a - b;
    }
}
