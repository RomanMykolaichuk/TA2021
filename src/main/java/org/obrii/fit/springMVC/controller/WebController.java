/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.fit.springMVC.controller;

import org.obrii.fit.springMVC.data.SampleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author 38068
 */
@Controller
public class WebController {
    
    @Autowired
    SampleData sampleData;
    
    @PostMapping("/toDo")
    public String anyMethod(@RequestParam(name="name", 
            required=false, defaultValue="World") 
            String name, 
            @RequestParam(name="age", 
            required=false, defaultValue="19") 
            String age, 
            Model model){
     model.addAttribute("name", name);
     
     sampleData.setName(name);
     sampleData.setAge(Integer.parseInt(age));
     
      model.addAttribute("sampleData", sampleData);
      
    return "toDo";
    }
    
    
}
