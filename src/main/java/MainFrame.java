import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
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

        textPanel = new TextPanel();
        botton = new JButton("Click me I am a button!");

        // define action listener in place
        botton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Clicked!\n");
            }
        });

        add(textPanel, BorderLayout.CENTER);
        add(botton, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
