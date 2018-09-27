/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author Zhunus
 */
public class DisplayCurrency implements IObserver,IDisplay {
    Currency c=new Currency();
    @Override
    public void update(double a,double b){
       if(c.Changed(a,b)==true){
           display(a,b);
       
       }
    }
    @Override
    public void display(double a, double b) {
        System.out.println("Current currency of $ is: "+b+" tenge");
    }
    
}
