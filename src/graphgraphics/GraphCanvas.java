/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphgraphics;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class GraphCanvas extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        g2.drawLine(0, 250, 500, 250);
        g2.drawLine(250, 0, 250, 500);
        int i = 0;
        while (i < 500) {
            g2.drawLine(250, i, 253, i);
            i = i + 10;
        }
        i = 0;
        while (i < 500) {
            g2.drawLine(i, 250, i, 253);
            i = i + 10;
        }
        g2.drawRect(0, 0, 497, 497);
        // work out how to draw text, it might have to be as an object which would suck ass
        // never know though
    }

}
