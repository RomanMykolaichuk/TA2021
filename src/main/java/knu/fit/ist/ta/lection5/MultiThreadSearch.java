/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 38068
 */
public class MultiThreadSearch implements Runnable{
    
    private List<Integer> searchResults = new ArrayList<>();
    
    int find;
    
    private boolean finished = false;

    public int getFind() {
        return find;
    }

    public void setFind(int find) {
        this.find = find;
    }
    
    private List<Integer> inputList;
    
    private final Searching searching = new Searching();

    public MultiThreadSearch() {
    }

    public MultiThreadSearch(int find, List<Integer> inputList) {
        this.find = find;
        this.inputList = inputList;
    }

    
    
    
    @Override
    public void run() {                
        searchResults.add(searching.linearSearch(find,inputList));
        finished = true;        
    }

    public List<Integer> getSearchResults() {
        return searchResults;
    }

    

    public List<Integer> getInputList() {
        return inputList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiThreadSearch{searchResults=").append(searchResults);
        sb.append('}');
        return sb.toString();
    }

    public boolean isFinished() {
        return finished;
    }

    

    
    
}
