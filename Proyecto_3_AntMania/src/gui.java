import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame implements ActionListener {

    JButton inicioB, creditos, salir, nivel_1, nivel_2, nivel_3, regresar;
    JPanel panel_inicio, panel_niveles;
    JLabel titulo, seleccion_nivel;


    public gui() {
        this.setTitle("AntMania");
        this.setSize(800,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();


    }

    private void initComponents() {
        panel_inicio = new JPanel();
        panel_inicio.setBackground(Color.black);
        panel_inicio.setLayout(null);
        this.getContentPane().add(panel_inicio);

        titulo = new JLabel();
        titulo.setText("Bienvenido a AntMania");
        titulo.setBounds(250,25,250,80);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        titulo.setForeground(Color.WHITE);
        titulo.setBackground(Color.black);
        panel_inicio.add(titulo);

        inicioB= new JButton("Inicio");
        inicioB.setBounds(350,100,100,30);
        inicioB.addActionListener(this);
        panel_inicio.add(inicioB);

        creditos = new JButton("Creditos");
        creditos.setBounds(350,150,100,30);
        creditos.addActionListener(this);
        panel_inicio.add(creditos);

        salir= new JButton("Salir");
        salir.setBounds(350,200,100,30);
        salir.addActionListener(this);
        panel_inicio.add(salir);

        panel_niveles = new JPanel();
        panel_niveles.setBackground(Color.black);
        panel_niveles.setLayout(null);

        seleccion_nivel = new JLabel();
        seleccion_nivel.setText("Seleccion de niveles");
        seleccion_nivel.setBounds(250,25,300,80);
        seleccion_nivel.setHorizontalAlignment(SwingConstants.CENTER);
        seleccion_nivel.setVerticalAlignment(SwingConstants.CENTER);
        seleccion_nivel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        seleccion_nivel.setForeground(Color.WHITE);
        seleccion_nivel.setBackground(Color.black);
        panel_niveles.add(seleccion_nivel);


        nivel_1= new JButton("Nivel 1");
        nivel_1.setBounds(350,100,100,30);
        nivel_1.addActionListener(this);
        panel_niveles.add(nivel_1);

        nivel_2= new JButton("Nivel 2");
        nivel_2.setBounds(350,150,100,30);
        nivel_2.addActionListener(this);
        panel_niveles.add(nivel_2);

        nivel_3= new JButton("Nivel 3");
        nivel_3.setBounds(350,200,100,30);
        nivel_3.addActionListener(this);
        panel_niveles.add(nivel_3);

        regresar= new JButton("Regresar");
        regresar.setBounds(350,250,100,30);
        regresar.addActionListener(this);
        panel_niveles.add(regresar);





        this.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == inicioB){
            panel_inicio.setVisible(false);
            this.add(panel_niveles);
            panel_niveles.setVisible(true);

        }
        if(e.getSource() == creditos){
            JOptionPane.showMessageDialog(null, """
                             Tecnologico de Costa Rica
                             Estudiante:
                             Victor Cruz Jiménez.
                             Carrera:
                             Ingenieria en Computadores      \s
                             Primer Semestre del 2022
                            \s
                             Proyecto: AntVillage.
                            \s"""
                    , "Informacion de los Estudiantes",JOptionPane.INFORMATION_MESSAGE);

        }
        if(e.getSource() == salir){
            if (JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de querer salir de la aplicacion?",
                    "Salir de la menu", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
                System.exit(0);
        }

        if(e.getSource() == nivel_1){
            System.out.println("x");

        }
        if(e.getSource() ==  nivel_2){
            System.out.println("X");
        }

        if(e.getSource() == nivel_3){
            System.out.println("x");
        }
        if(e.getSource() == regresar){
            panel_niveles.setVisible(false);
            panel_inicio.setVisible(true);
        }

    }


    public static void main(String[] args) {
        new gui().setVisible(true);
    }
}