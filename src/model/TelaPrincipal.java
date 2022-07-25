package model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame implements KeyListener{
	ImageIcon fundo = new ImageIcon(getClass().getResource("/images/fundo.png"));
	ImageIcon cara = new ImageIcon(getClass().getResource("/images/cara.png"));
	ImageIcon coroa = new ImageIcon(getClass().getResource("/images/coroa.png"));
	ImageIcon moedaMex = new ImageIcon(getClass().getResource("/images/caraCoroa.gif"));
	JLabel lfundo = new JLabel(fundo);
	JLabel lmoeda = new JLabel(moedaMex);
	public TelaPrincipal() {
		componentes();
		janela();
		
		
	}

	public void janela() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.addKeyListener(this);
		this.setSize(300,300);
		this.setTitle("Game Cara ou Coroa");
		this.setLocationRelativeTo(null);
		this.add(lmoeda);
		this.add(lfundo);
		this.setVisible(true);
		this.setLayout(null);
	}
	
	public void componentes() {
		lfundo.setBounds(0,0,400,400);
		lmoeda.setBounds(40,40,200,161);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		//System.out.println(e.getKeyCode());
		if(e.getKeyCode() == 10) {
			Random rd  = new Random();
			boolean n1 = rd.nextBoolean();
			if(n1) {
				lmoeda.setIcon(cara);
			}else {
				lmoeda.setIcon(coroa);
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 10) {
			tempo(1000);
		}
		lmoeda.setIcon(moedaMex);
	}

	private void tempo(int i) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(i);
		}catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		
	}


}
