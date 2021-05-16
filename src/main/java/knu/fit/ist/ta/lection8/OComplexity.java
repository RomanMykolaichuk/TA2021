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

    int executionTime = 10;

    public void constTime(int n) throws InterruptedException {
        Thread.sleep(executionTime);
    }

    public void linear(int n) throws InterruptedException {

        for (int i = 1; i <= n; i++) {
            Thread.sleep(executionTime);
        }

    }

    public void logarythmic(int n) throws InterruptedException {

        for (int i = 1; i <= n; i = i * 2) {
            Thread.sleep(executionTime);
        }

    }

    public void nLogN(int n) throws InterruptedException {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j = j * 2) {
                Thread.sleep(executionTime);
            }
        }

    }

    public void polynom(int n) throws InterruptedException {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                Thread.sleep(executionTime);
            }
        }

    }

    public void exponential(int n) throws InterruptedException {

        int k = power2(n);
        for (int i = 1; i <= k; i++) {
            Thread.sleep(executionTime);
        }

    }

    public void factorial(int n) throws InterruptedException {

        if(n>7){
            System.out.println("No solution in adequate time");
        return;
        }
        for (int i = 1; i <= fact(n); i++) {
            Thread.sleep(executionTime);
        }

    }

    private int power2(int n){
    int result=1;
    
        for (int i = 1; i <=n; i++) {
            result*=2;
        }
    
    return result;
    
    }
    
    private int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
