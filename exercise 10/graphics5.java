/* 5. Develop a program that has a Choice component which contains
the names of shapes such as rectangle, triangle, square and circle.
Draw the corresponding shapes for given parameters as per user’s
choice.DATE-07/06/2022 */


import java.awt.*;
import java.awt.event.*;
	class ChoiceShapes extends Frame

implements ItemListener {
Choice shapes ;
String msg = "";

public ChoiceShapes() {

// Use a flow layout.
setLayout(new FlowLayout());
// Create choice lists.
shapes = new Choice();


// Add items to os list.
shapes.add("rectangle");
shapes.add("triangle");
shapes.add("square");
shapes.add("circle");

// Add choice lists to window.
add(shapes);

// Add item listeners.
shapes.addItemListener(this);


addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void itemStateChanged(ItemEvent ie) {
repaint();
}

// Display current selections.
public void paint(Graphics g) {

msg = shapes.getSelectedItem();


if(msg.equals("rectangle")){
g.setColor(Color.black);
//g.drawString("enter your co-ordinates", 200, 120);
g.fillRect(200,200,200,100);
}
else if(msg.equals("square")){
g.setColor(Color.red);
g.fillRect(200,200,100,100);
}
else if(msg.equals("circle")){
g.setColor(Color.blue);
g.fillOval(200,200,200,200);
}
else if(msg.equals("triangle")){
g.setColor(Color.green);
int xpoints[] = {150, 300, 450};
int ypoints[] = {400, 150, 400};
int num = 3;

g.fillPolygon(xpoints, ypoints, num);

}


}

public static void main(String[] args) {
ChoiceShapes appwin = new ChoiceShapes();

appwin.setSize(new Dimension(240, 180));
appwin.setTitle("ChoiceDemo");
appwin.setVisible(true);
}
}
