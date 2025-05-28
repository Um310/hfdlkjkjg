package Demogame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

    JFrame f = new JFrame();
    f.setTitle("Brick Breaker");
    f.setSize(700,600);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    f.setResizable(false);

    GamePlay gameplay=new GamePlay();
        f.add(gameplay);
        f.addKeyListener(gameplay); // Allow keyboard input detection
        f.setVisible(true); // Ensure visibility
        gameplay.requestFocus();

        f.add(gameplay);



}

}
