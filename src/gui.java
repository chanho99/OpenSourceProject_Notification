import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class gui extends JFrame {
    /*
    private Image background=new ImageIcon(gui.class.getResource("../image/background.jpg")).getImage();
     */

    public gui(){
        setTitle("알리미");
        setSize(600,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        JLabel l1 = new JLabel("학사일정 알리미");
        l1.setLocation(0, 20);
        l1.setSize(600, 50);
        l1.setHorizontalAlignment(JLabel.CENTER);
        Font font = new Font("굴림 보통", Font.BOLD, 15);
        l1.setFont(font);
        c.add(l1);

        /*
        JLabel l2 = new JLabel("이번주 일정 : ?????");
        l2.setLocation(0,80);
        l2.setSize(600,50);
        l2.setHorizontalAlignment(JLabel.CENTER);
        c.add(l2);
         */

        JButton b1 = new JButton("학사일정");
        b1.setLocation(50,150);
        b1.setSize(100,50);
        c.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new one();
            }
        });

        JButton b2 = new JButton("소중단");
        b2.setLocation(250, 150);
        b2.setSize(100,50);
        c.add(b2);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new one();
            }
        });

        JButton b3 = new JButton("학과공지");
        b3.setLocation(450,150);
        b3.setSize(100, 50);
        c.add(b3);

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new one();
            }
        });

        setVisible(true);
    }
    /*
    public void paint(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }
     */

    public static void main(String [] args){
        new gui();
    }
}