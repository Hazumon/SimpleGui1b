/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegui1b;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{
    JButton button;
    
    public static void main(String[] args) {
       SimpleGui1B gui = new SimpleGui1B();
       gui.go();
      
              
    }
 
 
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");
        
        button.addActionListener(this);
        
        MyDrawPanel draw = new MyDrawPanel();
        
        frame.getContentPane().add(draw);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked!");
        //graphics.drawImage(myPic, 10, 10, this);
  
        
    

        


        
    }
}
