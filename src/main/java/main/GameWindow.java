package main;

import javax.swing.*;

public class GameWindow {
    private JFrame jFrame;

    public GameWindow(GamePanel gamePanel){
        //create JFrame object
        jFrame=new JFrame();
        jFrame.setSize(400,400);
        //set jframe to close window automatically
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        //set jframe to show window
        //setVisible should be at the end
        jFrame.setVisible(true);
    }
}
