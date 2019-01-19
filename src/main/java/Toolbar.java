import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private TextPanel textPanel;


    public Toolbar(){
        helloButton = new JButton("Hi\n");
        goodbyeButton = new JButton("Bye\n");

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);

    }

    public void setTextPanel(TextPanel panel){
        this.textPanel = panel;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");

        JButton clicked = (JButton) e.getSource();

        textPanel.appendText(clicked.getText());
    }
}
