/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class CountDown extends Thread{
    
    
    private int time; 

    public CountDown(int time)
    {
        this.time=time;
    }

    public void run()
    {
        for(int i=time; i>=0; i--)
        {
            System.out.println(i);
            try 
            {
                sleep(1000);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(CountDown.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }  
}
