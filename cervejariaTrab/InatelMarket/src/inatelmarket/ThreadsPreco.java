/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inatelmarket;

import javax.swing.JLabel;

/**
 *
 * @author guibrother32
 */
public class ThreadsPreco implements Runnable{
    
    float value=(float) 0.00;

    JLabel label;
    
    @Override
    public void run() {
        
        label.setText(Float.toString(value));
        
               
    }
    
    
   

    
}
