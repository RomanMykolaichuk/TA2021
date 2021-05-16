/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection8;

/**
 *
 * @author 38068
 */
public class OComplexity {

   
    public void constTime(int n) throws InterruptedException {
        Thread.sleep(100);        
    }

    public void linear(int n) throws InterruptedException {

        for (int i = 1; i <= n; i++) {
            Thread.sleep(100);
        }

    }
    
    public void logarythmic(int n) throws InterruptedException {

        for (int i = 1; i <= n; i=i*2) {
            Thread.sleep(100);
        }

    }
    
    
    public void nLogN(int n) throws InterruptedException {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j=j*2) {
                Thread.sleep(100);
            }            
        }

    }
    
    
    public void polinom(int n) throws InterruptedException {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                Thread.sleep(100);
            }            
        }

    }
    
    

}
