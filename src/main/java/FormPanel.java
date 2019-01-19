import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {

    private JLabel nameLable;
    private  JLabel occupationLabel;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton okButton;


    public FormPanel(){
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

        nameLable = new JLabel("Name: ");
        occupationLabel = new JLabel("Occupation: ");

        // Columns parameter is the width of the field
        nameField = new JTextField(10);
        occupationField = new JTextField(10);

        Border innerBorder = BorderFactory.createTitledBorder(("Add Person"));
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }
}
