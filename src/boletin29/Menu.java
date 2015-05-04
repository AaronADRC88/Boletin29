package boletin29;

import javax.swing.*;

public class Menu {

    static JFrame frame;
    private JPanel panel;
    private JLabel pregunta;
    static JButton velero, yate, deportivo;

    public Menu() {
        frame = new JFrame("Aluguer de barcos");
        frame.setSize(200, 200);
        panel = new JPanel();
        pregunta = new JLabel("Que tipo de barco desexa?");
        velero = new JButton("Veleiro");
        velero.addActionListener(form);
        yate = new JButton("Iate");
        yate.addActionListener(form);
        deportivo = new JButton("deportivo");
        deportivo.addActionListener(form);
        panel.add(pregunta);
        panel.add(velero);
        panel.add(yate);
        panel.add(deportivo);
        frame.add(panel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    Formulario form = new Formulario();
}
