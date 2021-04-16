/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.fit.springMVC.data;

import org.springframework.stereotype.Component;

/**
 *
 * @author 38068
 */
@Component
public class SampleData {
    
    private String name;
    private int age;

    public SampleData() {
    }

    public SampleData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SampleData{name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
