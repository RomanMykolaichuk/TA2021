/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection4;

/**
 *
 * @author 38068
 */
public class Sample1 {

    public static void main(String[] args) {

        StringMatching sm = new StringMatching();

        // sm.showResult("in");
        //sm.showResult("\\b[A-DF-Z]?[a-df-z]+\\b");
        //sm.showResult("\\b[^e]+\\b");
        //sm.showResult("\\b[A-DF-QS-Z]?[a-df-qs-z]+\\b");
        //sm.showResult("-?\\d+");
        /*
       sm.showResult("[ ]-?\\d{1,3}[ ]");
       
       sm.showResult("-?\\d*\\.{0,1}\\d+");
       
       // sm.showResult("\\b[^e]+\\b");
       
       sm.showResult("^\\d{1,3}$", "2345");
       
       sm.showResult("^\\d{1,4}$", "2345");*/
        StringProcessing sp = new StringProcessing();
        

        /*  System.out.println(sp.getList(sp.text));
        System.out.println(sp.getList(sp.text).size());
        System.out.println("=====================");
        System.out.println(sp.getSet(sp.text));
        System.out.println(sp.getSet(sp.text).size());*/
       

        /*System.out.println("==========IP-11===========");
        
        Lab4Task l4t = new Lab4Task(452);

        System.out.println(l4t.getTaskLab4());

        System.out.println("==========IP-12===========");

        l4t.setRandSeed(129);

        System.out.println(l4t.getTaskLab4());*/
    }

}
