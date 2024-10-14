import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Principal extends JFrame {
    private JPanel panel1;
    private JTable table1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton button1;

    public Principal() {
        DefaultTableModel model;
        String[] cabezera = {"Correo", "Pais", "Plataforma"};
        model = new DefaultTableModel();
        model.addColumn("Correo");
        model.addColumn("Pais");
        model.addColumn("Plataforma");
        table1.setModel(model);
        for (Usuario u: Data.usuarios) {
            Object[] row = { u.getCorreo(), u.getPais(), u.getPlatafroma() };
            model.addRow(row);
        }
        comboBox1.setModel(new DefaultComboBoxModel(Data.paises.toArray()));
        comboBox2.setModel(new DefaultComboBoxModel(Data.plataformas.toArray()));
        button1.addActionListener((ActionEvent e)->{
            if (Objects.equals(textField1.getText(), "")) {

            } else model.addRow(new String[] {textField1.getText(), (String) comboBox1.getSelectedItem(), (String) comboBox2.getSelectedItem()});
        });
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Principal Demo");
        pack();
        setLocationRelativeTo(null);
    }
}