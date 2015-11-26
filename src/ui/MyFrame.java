package ui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{


    public final static Dimension SIZE = new Dimension(700, 550);


    ContainerPanel containerPanel;


    public MyFrame()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        containerPanel = new ContainerPanel();
        add(containerPanel);

        setBackground(Theme.BACKGROUNDCOLOR);
        setVisible(true);
        setResizable(false);
        setTitle("Test LOL Snake");

        //saetter baggrundfarven til vores tooltip box.
        UIManager.put("ToolTip.background", Color.ORANGE);

        setBounds(300, 125, (int) SIZE.getWidth(), (int) SIZE.getHeight());
    }

    public ContainerPanel getContainerPanel()
    {
        return containerPanel;
    }
}