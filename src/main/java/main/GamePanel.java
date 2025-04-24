package main;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel(){

    }
    //we need paintcomponent method for jpanel to find
    //then pass in graphics object as input
    //then we can draw
    public void paintComponent(Graphics g){
        //call super class(jpanel), and calls the jpanel's own paint component
        super.paintComponent(g);
        g.fillRect(100,100,200,50);
    }
}
