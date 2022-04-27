package abstractfactory;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janelinha extends JFrame {
    
    public Janelinha(String titulo) {              
        setSize(300,300);
        setTitle(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var botao = new JButton("Me clica");
        botao.setBorder(BorderFactory.createDashedBorder(Color.PINK));
        //BorderFactory.createDashedBorder(paint)
        add("North",botao);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Janelinha("Titulo bonitinho");
    }


}
