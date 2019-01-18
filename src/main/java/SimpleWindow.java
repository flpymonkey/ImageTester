import javax.swing.*;

public class SimpleWindow {
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello World");

        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
