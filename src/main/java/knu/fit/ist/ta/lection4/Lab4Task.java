/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection4;

import java.util.ArrayList;
import java.util.List;
import knu.fit.ist.ta.Lection3.Tasks2;

/**
 *
 * @author 38068
 */
public class Lab4Task {
    
    private int randSeed;
    String task="\nВаріант%d. 4.Визначити перші %d слів, що зустрічаються найчастіше.\n" +
"5.Визначити кількість слів що не містять літеру %s.\n" +
"6.Визначити кількість слів, що мають рівно %d %s літер.\n" +
"7.Визначити перші %d трьохлітерні послідовності у словах тексту, що зустрічаються найчастіше.\n\n";
    
    
    String s1 = "abcdefghijklmnopqrstuvwxyz";
    String[] s2 = {"","різних","однакових"};
    int[] d1 = {3,4,5,6,7,8};
    int[] d2 = {3,4,5,6,7,8};

    public Lab4Task(int randSeed) {
        this.randSeed = randSeed;
    }

    public Lab4Task() {
    }
    
    
    
    
    public List<String> getTaskLab4(){
    List<String> result = new ArrayList<>();
    Tasks2 t2 = new Tasks2();
    
    //int randSeed = 452;
    //int randSeed = 129;
    
    int[] x1 = t2.arrayShuffle(t2.arrayPopulation2(25,3,8), randSeed);
    int[] x2 = t2.arrayShuffle(t2.arrayRange(25), randSeed+1);
    int[] x3 = t2.arrayShuffle(t2.arrayPopulation2(25,2,4), randSeed+2);
    int[] x4 = t2.arrayShuffle(t2.arrayPopulation2(25,0,2), randSeed+3);
    int[] x5 = t2.arrayShuffle(t2.arrayPopulation2(25,3,8), randSeed+4);
    
        for (int i = 0; i < 25; i++) {
            
            String temp = String.format(task, i+1, x1[i],s1.charAt(x2[i]),x3[i],s2[x4[i]],x5[i]);
            result.add(temp);
        }
       
    return result;
    }

    public int getRandSeed() {
        return randSeed;
    }

    public void setRandSeed(int randSeed) {
        this.randSeed = randSeed;
    }
}
