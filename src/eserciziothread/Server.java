/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class Server {
    
    ServerSocket ss;
    Socket so;

    BufferedWriter bw;
    BufferedReader br;

    CountDown cd;

    public Server (int porta)
    {
        try 
        {
            ss = new ServerSocket(porta);
            System.out.println("Server avviato in ascolto");
            ss.setSoTimeout(3000);
            cd = new CountDown(2000);
            cd.start();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ascolto() 
    {
        try 
        {
            so = ss.accept(); 
            System.out.println("Connessione stabilita");

            br = new BufferedReader(new InputStreamReader(so.getInputStream())); // inizializzione breader
            bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream())); // inizializzionr bwriter
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void scrivi(String messaggio)
    {
        try 
        {
            bw.write(messaggio+"\n");
            bw.flush();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String leggi()
    {
        String messaggioritorno = " ";
        try 
        {
            messaggioritorno = br.readLine();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messaggioritorno;
    }
    
}
