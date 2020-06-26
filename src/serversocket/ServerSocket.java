/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serversocket;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author gusky
 */
public class ServerSocket {
    public static void main(String[] args) {
       Hilo h1 = new Hilo();
       Thread hilo = new Thread(h1);
       hilo.start();
    }
    
}
