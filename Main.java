package brickbreaker;

import javax.swing.JFrame;


public class Main {

   public static final int width = 600;
   public static final int height = 700;
   public static final String title = "Breakout Ball";
   
   
    public static void main(String[] args) {
        
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        
        obj.setBounds(10,10 , 700 , 600);
        
        obj.setLocationRelativeTo(null);
        obj.setTitle(title);
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        
    }
    
}
