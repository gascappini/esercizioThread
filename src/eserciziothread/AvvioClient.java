/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothread;

import java.net.InetAddress;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class AvvioClient {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try 
        {
            Client cli = new Client(InetAddress.getLocalHost(), 2000);
        } 
        catch (UnknownHostException ex) 
        {
            Logger.getLogger(AvvioClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}