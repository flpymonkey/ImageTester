import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// https://youtu.be/OxaSi3nSl3I?t=6583

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;

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
        formPanel = new FormPanel();

        // Action listeners for buttons
        toolbar.setStringListener(new StringListener() {
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        class MyListener implements FormListener {
            public void formEventOccurred(FormEvent event) {
                String name = event.getName();
                String occupation = event.getOccupation();

                textPanel.appendText(name + ": " + occupation + "\n");
            }
        }
        formPanel.setFormListener(new MyListener());

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.WEST);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
