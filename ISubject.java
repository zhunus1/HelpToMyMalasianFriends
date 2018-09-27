/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Observer;

/**
 *
 * @author Zhunus
 */
public interface ISubject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver(Observer observer);
}
