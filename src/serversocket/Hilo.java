/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serversocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author gusky
 */
public class Hilo implements Runnable{

    @Override
    public void run() {
       
            try {
                java.net.ServerSocket server = new java.net.ServerSocket(5002);
//                System.out.println("Hola conectando...");
                while(true){
                    Socket cliente = server.accept();
    //                System.out.println("Cliente aceptado");

                    InputStreamReader isr = new InputStreamReader(cliente.getInputStream());
                    BufferedReader receptor = new BufferedReader(isr);


                    String msg = receptor.readLine();
                    System.out.println("Msg: "+msg);

                    cliente.close();
    //                PrintWriter emisor = new PrintWriter(cliente.getOutputStream());
    //                emisor.println("Que tal...");
    //                emisor.flush();
                    
                }


           } catch (Exception e) {
                System.out.println(e.getMessage());
           }
       
    }
    
    
}
