/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.io.IOException;

/**
 *
 * @author Ade Ilham Fajri
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        ClientImpl client = new ClientImpl();
        client.start();
        
    }
    
}
