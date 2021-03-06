import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private StringListener textListener;



    public Toolbar(){
        setBorder(BorderFactory.createEtchedBorder());
        helloButton = new JButton("Hi\n");
        goodbyeButton = new JButton("Bye\n");

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);

    }

    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");

        JButton clicked = (JButton) e.getSource();

        if (textListener != null){
            textListener.textEmitted(clicked.getText());
        }
    }
}
