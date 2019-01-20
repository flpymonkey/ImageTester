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

        okButton = new JButton("OK");

        Border innerBorder = BorderFactory.createTitledBorder(("Add Person"));
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        // Always set these and set them properly because they can cause problems later!
        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        //gc.anchor = GridBagConstraints.LINE_END;
        add(nameLable, gc);

        // retype to make clear what is happening
        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gc);

        // retype to make clear what is happening
        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(occupationLabel, gc);

        // retype to make clear what is happening
        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(occupationField, gc);

        // retype to make clear what is happening
        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(okButton, gc);
    }
}
