package edu.unsis.main;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InputData extends JFrame {
	
	private int type;
	
	public InputData(int type) {
		this.type = type;
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setSize(400, 600);
		this.setTitle("Datos");
		initComponents();

		ImageIcon imagen = new ImageIcon("./src\\edu\\unsis\\image\\wallpaperPrincipal.jpg");
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(this.getWidth(),
        		this.getHeight(), Image.SCALE_DEFAULT));
	}
	
	public void initComponents() {
		switch (type) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;
		case 16:
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
	
}








