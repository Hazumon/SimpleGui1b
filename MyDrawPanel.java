/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegui1b;

import javax.swing.*;
import java.awt.*;


class MyDrawPanel extends JPanel{
    
  /*  @Override
    public void paintComponent(Graphics g){

        g.setColor(Color.green);
        g.fillRect(20,50,100,100);
        
       // JPanel frame = new JPanel();

        
    }
    */
    
    public void paintComponent(Graphics g){
        
        int x = 20;
        int y = 50;
        
       g.setColor(Color.orange);
       g.fillOval(x,y,100,100);
    }
    
    class NestedPanel{
    
}
}
