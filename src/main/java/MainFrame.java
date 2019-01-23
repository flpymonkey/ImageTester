import javax.swing.*;
import java.awt.*;

// https://youtu.be/OxaSi3nSl3I?t=8660

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;

    public MainFrame(){
        super("Default");
        setUpWindow();
    }

    public MainFrame(String title){
        super(title);
        setUpWindow();
    }

    private JMenuBar setUpMenuBar(){
        JMenuBar menuBar = new JMenuBar();

        // Setup file menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem exportDataItem = new JMenuItem("Export Data...");
        JMenuItem importDataItem = new JMenuItem("Import Data...");
        fileMenu.addSeparator(); // =============
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exportDataItem);
        fileMenu.add(importDataItem);
        fileMenu.add(exitItem);

        // Setup window menu
        JMenu windowMenu = new JMenu("Window");
        JMenu showMenu = new JMenu("Show");
        JMenuItem showFormItem = new JMenuItem("Person Form");
        showMenu.add(showFormItem);
        windowMenu.add(showMenu);

        menuBar.add(fileMenu);
        menuBar.add(windowMenu);

        return menuBar;
    }

    private void setUpWindow(){
        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolbar = new Toolbar();
        formPanel = new FormPanel();

        setJMenuBar(setUpMenuBar());

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
                int ageCat = event.getAgeCategory();
                String empCat = event.getEmpCategory();

                textPanel.appendText(name + ": " + occupation + ": " + ageCat +
                        ": " + empCat + "\n");

                System.out.println(event.getGender());
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
