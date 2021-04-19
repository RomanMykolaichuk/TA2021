/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.Lection3;

import java.util.Random;
import org.springframework.stereotype.Service;

/**
 *
 * @author 38068
 */
@Service
public class Tasks2 {

    
    Random random = new Random();

    public int[] arrayPopulation(int arrayLength, int arrayMax) {

        int[] result = new int[arrayLength];

        for (int j = 0; j < arrayLength; j++) {
            result[j] = random.nextInt(arrayMax + 1);
        }

        return result;
    }
    
     public int[] arrayPopulation2(int arrayLength,int arrayMin, int arrayMax) {

        int[] result = new int[arrayLength];

        for (int j = 0; j < arrayLength; j++) {
            result[j] = random.nextInt(arrayMax-arrayMin + 1)+arrayMin;
        }

        return result;
    }

    public String arrayPrint(int[] intArray) {
        String result = "{";

        for (int i : intArray) {
            result += i + ", ";
        }
        result=result.substring(0, result.length()-2);
        result += "}";
        return result;
    }
    
    public int[] arrayRange(int n){
        int[] result = new int[n];
        for (int j = 0; j <n; j++) {
            result[j]=j+1;
        }
        return result;
    }

    public int[] arrayShuffle(int[] array) {
        Random rand = new Random();
        
        int temp;
        int arl = array.length;
        for (int j = 0; j < arl; j++) {
            int indexToSwap = rand.nextInt(arl);
            temp = array[indexToSwap];
            array[indexToSwap] = array[j];
            array[j] = temp;
        }        
        return array;
    }
    
    public int[] arrayShuffle(int[] array, int seed) {
        Random rand = new Random(seed);        
        int temp;
        int arl = array.length;
        for (int j = 0; j < arl; j++) {
            int indexToSwap = rand.nextInt(arl);
            temp = array[indexToSwap];
            array[indexToSwap] = array[j];
            array[j] = temp;
        }        
        return array;
    }
    
    public String arrayString(int n){
    String result="";
        for (int j = 1; j <= n; j++) {
            result+=j*j;
        }
    return result;
    }

    //[5; 0; 5; 0; 1; 0; 5; 3; 0; 4; 2; 0; 1; 4; 5; 0; 4; 1; 2; 0; ]
    //[5; 0; 5; 0; 1; 0; 5; 3; 0; 4; 2; 0; 1; 4; 5; 0; 4; 1; 2; 0; ]
    //[1; 5; 5; 5; 0; 0; 0; 5; 2; 1; 0; 2; 1; 3; 3; 4; 2; 1; 1; 5; ]
    //[4; 3; 3; 4; 2; 4; 0; 4; 4; 2; 1; 4; 2; 4; 3; 4; 0; 5; 2; 2; ]
}
