/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author Ade Ilham Fajri
 */
class ClientImpl {
    
    public void start(){
        
        //Jalin Koneksi dulu
        Socket socket = new Socket("10.151.34.155", 6666);
        InputStream is = socket.getInputStream();
        
        //Baca pesan dari server
        while (true) {
            byte[] buf = new byte[10];
            int len = is.read(buf);
            if(len == -1){
                break;
            }
            System.out.print(new String(buf));
        }
        
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
         
        
        OutputStream os = socket.getOutputStream();
        os.write(test.getBytes());
        os.flush();
                
                
                test = scanner.nextLine();
                os.close();
                is.close();
            
    }
}
