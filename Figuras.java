import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras extends JPanel {
    
    public static int n;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        int step = 400/n;
        
        //TODO - ESCREVA SEU CÓDIGO AQUI!!!
		//VOCE PODE USAR A VARIAVEL n
        //X0 Y0, X1, Y1
        // 0, 0 = CANTO SUPERIOR ESQUERDO
        for (int i = 0; i <= 400; i = i+step)
            g.drawLine(i, 0, 400-i, 400);
        
    }


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor de N");
        Figuras.n = in.nextInt();

        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras painel = new Figuras();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);
        
    }

}
