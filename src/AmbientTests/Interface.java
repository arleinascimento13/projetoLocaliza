package AmbientTests;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Interface {
    public static void main(String[] args) {
        JFrame window = new JFrame();

        JButton btn = new JButton("Click");
        JButton btn1 = new JButton("Click");
        JButton btn2 = new JButton("Click");
        btn.setBounds(120,196,568,100);
        btn1.setBounds(120,355,568,100);
        btn2.setBounds(120,514,568,100);

        window.add(btn);
        window.add(btn1);
        window.add(btn2);

        window.setLayout(null);
        window.setBounds((1920/2)-400,(1080/2)-400,800,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
}
