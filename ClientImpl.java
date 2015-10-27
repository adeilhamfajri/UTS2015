/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream_6;
import java.io.*;
import java.util.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ade Ilham Fajri
 */
public class client_stream {
    
      public static void main(String[] args){
         
          try {
              byte[] buffer = new byte[10];
              Socket socket_ku = new Socket("localhost", 222);
              
              InputStream input_stream = socket_ku.getInputStream();
              OutputStream output_stream = socket_ku.getOutputStream();
              
              output_stream.write("Hello Server IF ini dari sisi Client\r\n\r\n".getBytes());
              output_stream.flush();
              
              int len;
              
              while(true){
                  buffer = new byte[10];
                  len = input_stream.read(buffer);
                  
                  if(len==-1){
                      break;
                  }
                  System.out.println(new String(buffer));
              }
              output_stream.close();
              input_stream.close();
              socket_ku.close();
                      } catch (IOException ex) {
              Logger.getLogger(client_stream.class.getName()).log(Level.SEVERE, null, ex);
          }
      }

    private static int input_stream(byte[] buffer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
