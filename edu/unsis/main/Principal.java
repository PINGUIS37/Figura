package edu.unsis.main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import edu.unsis.figure.Figura;
import edu.unsis.figure2d.Circulo;
import edu.unsis.figure2d.Cuadro;
import edu.unsis.figure2d.Figure2D;
import edu.unsis.figure2d.Rombo;
import edu.unsis.figure2d.Romboide;
import edu.unsis.figure2d.poligon.Hexagono;
import edu.unsis.figure2d.poligon.Pentagono;
import edu.unsis.figure3d.Cilindro;
import edu.unsis.figure3d.Cubo;
import edu.unsis.figure3d.Esfera;
import edu.unsis.figure3d.Figura3D;

public class Principal extends JPanel implements ActionListener {

	private ArrayList<JButton> buttons;
	private ArrayList<ImageIcon> image;

	public Principal() {
		initComponents();
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new Principal());
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Figuras geometricas");
		frame.setVisible(true);
	}

	public void initComponents() {
		buttons = new ArrayList<JButton>();
		image = new ArrayList<ImageIcon>();

		this.setLayout(new GridLayout(3, 1, 20, 20));

		image.add(new ImageIcon("./src\\edu\\unsis\\image\\Circulo.png"));
		image.add(new ImageIcon("./src\\edu\\unsis\\image\\Cuadrado.png"));
		image.add(new ImageIcon("./src\\edu\\unsis\\image\\Hexagono.png"));
		image.add(new ImageIcon("./src\\edu\\unsis\\image\\Pentagono.png"));
		image.add(new ImageIcon("./src\\edu\\unsis\\image\\Rombo.png"));
		image.add(new ImageIcon("./src\\edu\\unsis\\image\\Romboide.png"));

		image.add(new ImageIcon("./src\\edu\\unsis\\image\\Cubo.png"));
		image.add(new ImageIcon("./src\\edu\\unsis\\image\\Esfera.png"));
		image.add(new ImageIcon("./src\\edu\\unsis\\image\\Cilindro.png"));

		JButton aux;
		ImageIcon icon;

		for (ImageIcon icono : image) {
			aux = new JButton();
			aux.setPreferredSize(new Dimension(100, 100));
			aux.setBounds(0, 0, 100, 100);
			icon = new ImageIcon(
					icono.getImage().getScaledInstance(aux.getWidth(), aux.getHeight(), Image.SCALE_DEFAULT));
			aux.setIcon(icon);
			aux.addActionListener(this);
			buttons.add(aux);
			this.add(buttons.get(buttons.size() - 1));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttons.get(0)) {
			String op = JOptionPane.showInputDialog("Calcular area, perimetro o ambos (A / P / AP): ");
			double radio = 0;

			radio = getInputDouble("Radio: ");
			Circulo circulo = new Circulo(radio);
			if (radio != -999999) {

				operar2D(circulo, op);
			}

		}
		// Cuadrado
		if (e.getSource() == buttons.get(1)) {
			String op = JOptionPane.showInputDialog("Calcular area, perimetro o ambos (A / P / AP): ");

			double lado = getInputDouble("Lado: ");
			if (lado != -999999) {

				Cuadro cuadro = new Cuadro(lado);
				operar2D(cuadro, op);

			}
		}
		// Hexagono
		if (e.getSource() == buttons.get(2)) {
			String op = JOptionPane.showInputDialog("Calcular area, perimetro o ambos (A / P / AP): ");

			double lado = getInputDouble("Lado: ");
			double apotema = getInputDouble("Apotema: ");
			if (lado != -999999) {

				Hexagono hexagono = new Hexagono(apotema, lado);
				operar2D(hexagono, op);

			}
		}
		// Pentagono
		if (e.getSource() == buttons.get(3)) {
			String op = JOptionPane.showInputDialog("Calcular area, perimetro o ambos (A / P / AP): ");

			double lado = getInputDouble("Lado: ");
			double apotema = getInputDouble("Apotema: ");

			if (lado != -999999 && apotema != -999999) {

				Pentagono pentagono = new Pentagono(apotema, lado);
				operar2D(pentagono, op);

			}
		}
		// Rombo
		if (e.getSource() == buttons.get(4)) {
			String op = JOptionPane.showInputDialog("Calcular area, perimetro o ambos (A / P / AP): ");

			double dMayor = getInputDouble("Diagonal mayor: ");
			double dMenor = getInputDouble("Diagonal menor: ");
			double lado = getInputDouble("Lado: ");
			if ((dMenor != -999999) && (dMenor != -999999) && (lado != -999999)) {

				Rombo cuadro = new Rombo(dMenor, dMenor, dMayor);
				operar2D(cuadro, op);

			}
		}
		// Romboide
		if (e.getSource() == buttons.get(5)) {
			String op = JOptionPane.showInputDialog("Calcular area, perimetro o ambos (A / P / AP): ");

			double alt = getInputDouble("Altura: ");
			double base = getInputDouble("Base: ");
			if ((alt != -999999) && (base != -999999)) {

				Romboide romboide = new Romboide(base, alt);
				operar2D(romboide, op);

			}
		}
		// Cubo
		if (e.getSource() == buttons.get(6)) {
			String op = JOptionPane.showInputDialog("Calcular area, perimetro o ambos (A / V / AV): ");

			double lado = getInputDouble("Lado del cubo: ");
			if (lado != -999999) {

				Cubo cubo = new Cubo(lado);
				operar3D(cubo, op);

			}
		}
		// Esfera
		if (e.getSource() == buttons.get(7)) {
			String op = JOptionPane.showInputDialog("Calcular area, perimetro o ambos (A / V / AV): ");

			double radio = getInputDouble("Radio: ");
			if (radio != -999999) {

				Esfera esfera = new Esfera(radio);
				operar3D(esfera, op);

			}
		}
		// Cilindro
		if (e.getSource() == buttons.get(8)) {
			String op = JOptionPane.showInputDialog("Calcular area, perimetro o ambos (A / V / AV): ");

			double alt = getInputDouble("Altura: ");
			double radio = getInputDouble("Radio: ");
			if (radio != -999999 && alt != -999999) {

				Cilindro cuadro = new Cilindro(radio, alt);
				operar3D(cuadro, op);

			}
		}
	}

	public double getInputDouble(String message) {
		double num = 0;
		try {
			String r = JOptionPane.showInputDialog(message);
			num = Double.parseDouble(r);
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Datos invalidos");
			return -999999;
		}
		return num;
	}

	public void operar2D(Figure2D f, String op) {
		if (op.equalsIgnoreCase("A")) {
			JOptionPane.showMessageDialog(null, "El area es: " + f.getArea());
		} else if (op.equalsIgnoreCase("P")) {
			JOptionPane.showMessageDialog(null, "El perimetro es: " + f.getPerimetro());
		} else if (op.equalsIgnoreCase("AP")) {
			JOptionPane.showMessageDialog(null,
					"El perimetro es: " + f.getPerimetro() + "\n" + "El area es: " + f.getArea());

		}
	}

	public void operar3D(Figura3D f, String op) {
		if (op.equalsIgnoreCase("A")) {
			JOptionPane.showMessageDialog(null, "El area es: " + f.getArea());
		} else if (op.equalsIgnoreCase("V")) {
			JOptionPane.showMessageDialog(null, "El valumen es: " + f.getVolumen());
		} else if (op.equalsIgnoreCase("AV")) {
			JOptionPane.showMessageDialog(null,
					"El volumen es: " + f.getVolumen() + "\n" + "El area es: " + f.getArea());

		}
	}
}
