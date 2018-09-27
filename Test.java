/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Zhunus
 */
public class Test {
    public static float changeValues(double a){
        Random rand=new Random();
        double add=rand.nextDouble()+(-0.1);
            return (float) (add+a);
       
     }
    

   
    
}


