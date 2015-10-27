/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ade Ilham Fajri
 */
class ClientImpl {
    
     public void start(){
        try {
            
            Scanner scan = new Scanner(System.in);
            String masukan = scans.nextLine();
            
            while (!masukan.contentEquals("exit")) {
                Socket socket = new Socket("10.151.34.155", 6666);
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                os.write(masukan.getBytes());
                os.flush();
                
                while (true) {
                    byte[] buf = new byte[10];
                    int len = is.read(buf);
                    if(len == -1){
                        break;
                    }
                    System.out.print(new String(buf));
                }
                
                masukan = scan.nextLine();
                os.close();
                is.close();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 }

