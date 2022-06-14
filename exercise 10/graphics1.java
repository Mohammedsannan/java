/* 1.program to draw circle,rectangle,line */


import java.awt.event.*;
import java.awt.*;

 class GraphicsDemo extends Frame {

public GraphicsDemo() {
// Anonymous inner class to handle window close events.
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void paint(Graphics g) {

// Draw lines.
g.setColor(Color.orange);
g.drawLine(30, 100, 100, 100);


// Draw rectangles.
g.setColor(Color.red);
g.drawRect(20, 150, 100, 80);
g.fillRect(20, 150, 100, 80);


// Draw Circles
g.setColor(Color.yellow);
g.drawOval(20, 250, 100, 100);
g.fillOval(20, 250, 100, 100);

}

public static void main(String[] args) {
GraphicsDemo appwin = new GraphicsDemo();

appwin.setSize(new Dimension(370, 700));
appwin.setTitle("GraphicsDemo");
appwin.setVisible(true);
}
}
