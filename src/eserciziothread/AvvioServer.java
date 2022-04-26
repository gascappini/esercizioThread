/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothread;

/**
 *
 * @author gabri
 */
public class AvvioServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        {
        Server srv = new Server(2000); // crea un istanza della classe server 
        srv.ascolto();
        srv.scrivi("Benvenuto client"); 
        }   
    }
    
}
