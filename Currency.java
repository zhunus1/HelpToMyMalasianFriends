/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Zhunus
 */
public class Currency implements ISubject {
    private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void removeObserver(Observer observer) {
         observers.remove(observer);
    }
    public boolean Changed(double a,double b){
        if(Math.abs(b)-Math.abs(a)>2){
            return true;
        }else{
            return false;
        }
    
    }
    
        
    @Override
    public void registerObserver(Observer observer) {
           observers.add(observer);
    }
    @Override
    public void notifyObserver(Observer observer) {
       for(Observer object:observers){
        object.update((Observable) observer, this);}
    }
   
    
}
