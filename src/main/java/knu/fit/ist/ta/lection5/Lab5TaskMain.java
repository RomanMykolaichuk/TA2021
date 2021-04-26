/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection5;

/**
 *
 * @author 38068
 */
public class Lab5TaskMain {
    
    public static void main(String[] args) {
        System.out.println("==========IP-11===========");
        
        Lab5Task l5t = new Lab5Task(543);

        System.out.println(l5t.getTaskLab5());

        System.out.println("==========IP-12===========");

        l5t.setRandSeed(421);

        System.out.println(l5t.getTaskLab5());
    }
            
    
}
