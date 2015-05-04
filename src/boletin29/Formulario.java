package boletin29;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Formulario implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JLabel eEslora, eDias, eMastil, ePotencia, eNCamarotes;
    private JTextField tEslora, tDias, tMastil, tPotencia, tNCamarotes;
    private JButton confirmarV, confirmarD, confirmarY;
    static Velero velero = new Velero();
    static Deportivo depor = new Deportivo();
    static Yate iate = new Yate();
    ArrayList<Barco> barco;

    public Formulario() {
    }

    public JFrame ventaVelero() {
        frame = new JFrame("Alugar un Veleiro");
        frame.setSize(300, 300);
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        eEslora = new JLabel("De cantos metros de eslora quere o seu barco?");
        tEslora = new JTextField(3);
        eDias = new JLabel("Cantos dias quere o seu barco?");
        tDias = new JTextField(3);
        eMastil = new JLabel("Cantos mastiles quere que teña o seu barco?");
        tMastil = new JTextField(3);
        confirmarV = new JButton("Confirmar");
        confirmarV.addActionListener(this);
        panel.add(eEslora);
        panel.add(tEslora);
        panel.add(eDias);
        panel.add(tDias);
        panel.add(eMastil);
        panel.add(tMastil);
        panel.add(confirmarV);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public JFrame ventaDeportivo() {
        frame = new JFrame("Alugar un deportivo");
        frame.setSize(300, 300);
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        eEslora = new JLabel("De cantos metros de eslora quere o seu barco?");
        tEslora = new JTextField(3);
        eDias = new JLabel("Cantos dias quere o seu barco?");
        tDias = new JTextField(3);
        ePotencia = new JLabel("Cantos cv quere que teña o seu barco?");
        tPotencia = new JTextField(3);
        confirmarD = new JButton("Confirmar");
        confirmarD.addActionListener(this);
        panel.add(eEslora);
        panel.add(tEslora);
        panel.add(eDias);
        panel.add(tDias);
        panel.add(ePotencia);
        panel.add(tPotencia);
        panel.add(confirmarD);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public JFrame ventaIate() {
        frame = new JFrame("Alugar un iate");
        frame.setSize(300, 300);
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        eEslora = new JLabel("De cantos metros de eslora quere o seu barco?");
        tEslora = new JTextField(3);
        eDias = new JLabel("Cantos dias quere o seu barco?");
        tDias = new JTextField(3);
        ePotencia = new JLabel("Cantos cv quere que teña o seu barco?");
        tPotencia = new JTextField(3);
        eNCamarotes = new JLabel("Cantos camarotes quere que teña o seu barco?");
        tNCamarotes = new JTextField(3);
        confirmarY = new JButton("Confirmar");
        confirmarY.addActionListener(this);
        panel.add(eEslora);
        panel.add(tEslora);
        panel.add(eDias);
        panel.add(tDias);
        panel.add(ePotencia);
        panel.add(tPotencia);
        panel.add(eNCamarotes);
        panel.add(tNCamarotes);
        panel.add(confirmarY);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(confirmarV)) {
            if (tEslora.getText().isEmpty() | tDias.getText().isEmpty() | tMastil.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rechea todo-los campos", "ERRO", JOptionPane.WARNING_MESSAGE);

            } else {
                velero.setEslora(Integer.parseInt(tEslora.getText()));
                velero.setDias(Integer.parseInt(tDias.getText()));
                velero.setnMastiles(Integer.parseInt(tMastil.getText()));
                barco = new <Velero> ArrayList();
                barco.add(new Velero(velero.getnMastiles(), Metodos.creaMatricula(), velero.getEslora(), velero.getDias()));
                frame.dispose();
                JOptionPane.showMessageDialog(null, barco + "\nprezo: " + Metodos.calculaPrezoVel(), "FACTURA", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (e.getSource().equals(Menu.velero)) {
            this.ventaVelero();
            Menu.frame.dispose();

        }
        if (e.getSource().equals(confirmarD)) {
            if (tEslora.getText().isEmpty() | tDias.getText().isEmpty() | tPotencia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rechea todo-los campos", "ERRO", JOptionPane.WARNING_MESSAGE);

            } else {
                depor.setEslora(Integer.parseInt(tEslora.getText()));
                depor.setDias(Integer.parseInt(tDias.getText()));
                depor.setPotencia(Integer.parseInt(tPotencia.getText()));
                barco = new <Deportivo>ArrayList();
                barco.add(new Deportivo(depor.getPotencia(), Metodos.creaMatricula(), depor.getEslora(), depor.getDias()));
                frame.dispose();
                JOptionPane.showMessageDialog(null, barco + "\nprezo: " + Metodos.calculaPrezoDep(), "FACTURA", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (e.getSource().equals(Menu.deportivo)) {
            this.ventaDeportivo();
            Menu.frame.dispose();

        }
        if (e.getSource().equals(Menu.yate)) {
            this.ventaIate();
            Menu.frame.dispose();
        }
        if (e.getSource().equals(this.confirmarY)) {
            if (tEslora.getText().isEmpty() | tDias.getText().isEmpty() | tPotencia.getText().isEmpty() | tNCamarotes.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rechea todo-los campos", "ERRO", JOptionPane.WARNING_MESSAGE);

            } else {
                iate.setEslora(Integer.parseInt(tEslora.getText()));
                iate.setDias(Integer.parseInt(tDias.getText()));
                iate.setPotencia(Integer.parseInt(tPotencia.getText()));
                iate.setnCamarotes(Integer.parseInt(tNCamarotes.getText()));
                barco = new <Yate>ArrayList();
                barco.add(new Yate(iate.getPotencia(), iate.getnCamarotes(), Metodos.creaMatricula(), iate.getEslora(), iate.getDias()));
                frame.dispose();
                JOptionPane.showMessageDialog(null, barco + "\nprezo: " + Metodos.calculaPrezoIat(), "FACTURA", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}
