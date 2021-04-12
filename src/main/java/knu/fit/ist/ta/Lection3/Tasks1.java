/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.Lection3;

import org.springframework.stereotype.Service;

/**
 *
 * @author 38068
 */
@Service
public class Tasks1 {

    private int a, b, c, n, k, i;

    public void p11b(int a, int b) {
        sout("a<->b");
        sout(a, b);
        a += b;
        b = a - b;
        a -= b;
        sout(a, b);
    }

    public int p113(int a, int n) {
       k = 0;
       b = 1;
        sout("a^b");
        sout(a, n);
        if (n < 0) {
            sout("must be positive");
            b = 0;
        } else if (n < 1) {
            sout(b);
        } else {
            while (k++ != n) {
                b*= a;
            }
            sout(b);
        }
        return b;
    }

    public int p113a(int a, int n) {
        k = n;
        b = 1;
        sout("a^b");
        sout(a, n);
        if (n < 0) {
            sout("must be positive");
            b = 0;
        } else if (n < 1) {
            sout(b);
        } else {
            while (k-- != 0) {
                b *= a;
            }
            sout(b);
        }
        return b;
    }

    public int p113b(int a, int n) {
        k = n;
        b = 1;
        c = a;
        sout("a^b");
        sout(a, n);
        if (n < 0) {
            sout("must be positive");
            b = 0;
        } else if (n < 1) {
            sout(b);
        } else {
            while (k != 0) {
                if (k % 2 == 0) {
                    c *= c;
                    k /= 2;
                } else {
                    b *= c;
                    k--;
                }
            }
            sout(b);
        }
        return b;
    }

    public void p1121(int n) {
        k = 0;
        int square = 0;
        sout(square);

        while (k != n) {
            square += k;
            k++;
            square += k;
            sout(square);
        }

    }
    
    
    
    
    
    

    public int reverseInt(int startInt) {
        int reverseInt = 0;
        k = startInt;
        while (k != 0) {
            reverseInt = reverseInt * 10 + k % 10;
            k /= 10;
        }
        return reverseInt;
    }

    public void sout(String message) {
        System.out.println("===== " + message + " =====");
    }

    public void sout(Number a) {
        System.out.println("result= " + a);
    }

    public void sout(Number a, Number b) {
        System.out.println("a= " + a + " b= " + b);
    }

    public void sout(Number a, Number b, Number c) {
        System.out.println("a= " + a + " b= " + b + " c= " + c);
    }

}
