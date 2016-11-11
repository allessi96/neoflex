/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static tree.TreeMainFrame.selectedNode;

/**
 *
 * @author User
 */
public class Drawing {
    
    static Graphics g=TreeMainFrame.drawPanel.getGraphics();
    static Graphics2D gr2d= (Graphics2D) g;
     
    public static void drawNode(int x, int y, Node n) {

        Node l = n.getLeft();
        if (l != null) {

            drawNode((int) (x - 50 - 10), y + 60, n.getLeft());
            gr2d.drawLine(x + 10, y + 20, x - 50, y + 60);

        }

        Node r = n.getRight();
        if (r != null) {
            drawNode(x + 50, y + 60, n.getRight());
            gr2d.drawLine(x + 10, y + 20, x + 50 + 10, y + 60);
        }

        if (n.equals(selectedNode)) {
            gr2d.setColor(Color.red);
        }
        gr2d.fillOval(x, y, 20, 20);

        gr2d.setColor(Color.yellow);
        gr2d.drawString(Integer.toString(n.getValue()), x + 7, y + 15);
        gr2d.setColor(Color.green);

    }
}
