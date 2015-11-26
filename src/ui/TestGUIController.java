package ui;

public class TestGUIController {


    private MyFrame myFrame;
    private ContainerPanel containerPanel;


    public TestGUIController()
    {
        myFrame = new MyFrame();

    }


    public void injectListeners()
    {
        // Login, logout and forgot password actionlisteners
        //ContainerPanel.getLoginPanel().addActionListener(new LoginActionListener());

    }

    public MyFrame getMyframe()
    {
        return myFrame;
    }

}