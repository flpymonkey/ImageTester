import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton botton;

    public MainFrame(){
        super("Default");
        SetUp();
    }

    public MainFrame(String title){
        super(title);
        SetUp();
    }

    private void SetUp(){
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        botton = new JButton("Click me I am a button!");

        add(textArea, BorderLayout.CENTER);
        add(botton, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
