/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.Lection3.Tasks1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author 38068
 */
@SpringBootTest
public class Lection3Tests {

    @Autowired
    Tasks1 t1;

    @RepeatedTest(10)
    void test1() {
        assertEquals(1073741824, t1.p113(2, 30));
    }
    
     @Test
    void test1a() {
        assertEquals(1073741824, t1.p113(2, 30));
    }
    
     @Test
    void test2() {
        assertEquals(1073741824, t1.p113a(2, 30));
    }

     @Test
    void test3() {
        assertEquals(1073741824, t1.p113b(2, 30));
    }
}
