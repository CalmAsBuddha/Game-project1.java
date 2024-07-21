import javax.swing.*;

public class myFrame extends JFrame {
  JPanel p;
    myFrame(){
        p = new myPanel();
       
        this.setVisible(true);
        this.add(p);

        this.pack();
        


    }
}
