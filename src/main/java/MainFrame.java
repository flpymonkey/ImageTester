import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;

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
        toolbar = new Toolbar();

        toolbar.setStringListener(new StringListener() {
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
