import javax.swing.*;
import java.awt.*;

// TODO https://youtu.be/OxaSi3nSl3I?t=2018

public class TextPanel extends JPanel {
    private JTextArea textArea;

    public TextPanel (){
        textArea = new JTextArea();

        setLayout((new BorderLayout()));

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendText(String text) {
        textArea.append(text);
    }
}
