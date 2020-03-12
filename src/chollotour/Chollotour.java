/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chollotour;

import java.io.IOException;

/**
 *
 * @author clagosuarez
 */
public class Chollotour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        inicio inicio = new inicio();
        inicio.show();
        
        listar listar = new listar();
    }
    
}
