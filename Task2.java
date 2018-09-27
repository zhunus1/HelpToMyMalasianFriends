/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhunus
 */
public class Task2 implements Runnable{
    static Test t =new Test();
    static Currency c =new Currency();
    static DisplayCurrency dc=new DisplayCurrency();
    static DisplayDifference dd=new DisplayDifference();
    static Thread th;
    static double ddo;
    static double pposle=329;

    public static void main(String args[]){
        Thread th=new Thread(new Task2());
               th.start();
               
        
                
    }

    @Override
    public void run() {
       
        try {
            Thread.sleep(2000);
            pposle=t.changeValues(pposle);
            //boolean b=c.Changed(ddo, pposle);
            dc.update(ddo, pposle);
            dd.update(ddo, pposle);
           
            ////System.out.print(ddo+"do"+"\n");
            ////System.out.print(b+"\n");
            ////System.out.print(pposle+"posle"+"\n");
            
            run();
        } catch (InterruptedException ex) {
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}

