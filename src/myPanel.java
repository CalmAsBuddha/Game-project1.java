import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myPanel extends JPanel implements ActionListener {
    final int PANEL_WITDH = 500;
    final int PANEL_HEIGHT = 500;

    Timer timer;
    Image eny;
    Image back;
    int xVelocity =2 ;
    int yVelocity = 1;
    int x,y=0;


    myPanel(){
        this.setPreferredSize(new Dimension(PANEL_WITDH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        //this.setSize(200,200);
        ImageIcon eny1 = new ImageIcon("/Users/armaanpatial/IdeaProjects/_2dAnim/src/Unknown.jpeg");
        eny = eny1.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
         back = new ImageIcon("/Users/armaanpatial/IdeaProjects/_2dAnim/src/space.jpg.webp").getImage();






        timer = new Timer(5,this);
        timer.start();


    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(eny,x,y,null);
        g2d.drawImage(back,x,y,null);


    }
    public void actionPerformed(ActionEvent e){
        if(x>=PANEL_WITDH-eny.getWidth(null)|| x<0){
            xVelocity = xVelocity* -1 ;
        }
        x = x + xVelocity;
        if(y>=PANEL_HEIGHT-eny.getHeight(null)||y<0){
            yVelocity = yVelocity* -1;
        }
        y = yVelocity + y;
        repaint();

    }
}

