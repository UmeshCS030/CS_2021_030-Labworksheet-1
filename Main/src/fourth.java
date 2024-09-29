import javax.swing.JFrame;

public class fourth {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Frame");

        frame.setSize(300, 200);

        frame.setLocation(100, 50);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}

/*Experiments:-
•	frame.setLocation(0,0);
The window will be positioned at the top-left corner of the screen

•	frame.setLocation(300,0);
The window will be 300 pixels from the left edge, positioned at the top of
the screen.

•	frame.setLocation(0,300);
The window will be 300 pixels from the top edge, positioned on the left
edge of the screen.

•	frame.setLocation(200,300);
The window will be 200 pixels from the left edge and 300 pixels from the
top edge of the screen
*/