/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brianobioha
 */
public interface Receiver<T, U> 
{
    void receive(T t, U b);
    void remove(int i);
}
