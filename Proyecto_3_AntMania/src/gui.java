import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class gui extends JFrame implements ActionListener  {

    JButton inicioB, creditos, salir, nivel_1, nivel_2, nivel_3, regresar, gana_azul, gana_verde;
    JPanel panel_inicio, panel_niveles,panel_nivel_1,panel_nivel_2,panel_nivel_3;
    JLabel titulo, seleccion_nivel, granja1, granja2, granja_azul, granja_verde, h_verde, h_azul, comida, comida2;

    Grafo grafo;

    static gui inter;

    List<Arista> edges;

    int inicio, fin;

    crearXml xml;

    ListaDME ganadores;


    public gui() {
        this.setTitle("AntMania");
        this.setSize(800,600);
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

        //Label del titulo
        titulo = new JLabel();
        titulo.setText("Bienvenido a AntMania");
        titulo.setBounds(250,25,250,80);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        titulo.setForeground(Color.WHITE);
        titulo.setBackground(Color.black);
        panel_inicio.add(titulo);

        //Boton Inicio
        inicioB= new JButton("Inicio");
        inicioB.setBounds(350,100,100,30);
        inicioB.addActionListener(this);
        panel_inicio.add(inicioB);

        //Boton creditos
        creditos = new JButton("Creditos");
        creditos.setBounds(350,150,100,30);
        creditos.addActionListener(this);
        panel_inicio.add(creditos);

        //Boton salir
        salir= new JButton("Salir");
        salir.setBounds(350,200,100,30);
        salir.addActionListener(this);
        panel_inicio.add(salir);

        //Panel de seleccion de niveles
        panel_niveles = new JPanel();
        panel_niveles.setBackground(Color.black);
        panel_niveles.setLayout(null);

        //Label de seleccion de nivel
        seleccion_nivel = new JLabel();
        seleccion_nivel.setText("Seleccion de niveles");
        seleccion_nivel.setBounds(250,25,300,80);
        seleccion_nivel.setHorizontalAlignment(SwingConstants.CENTER);
        seleccion_nivel.setVerticalAlignment(SwingConstants.CENTER);
        seleccion_nivel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        seleccion_nivel.setForeground(Color.WHITE);
        seleccion_nivel.setBackground(Color.black);
        panel_niveles.add(seleccion_nivel);

        //Boton nvel 1
        nivel_1= new JButton("Nivel 1");
        nivel_1.setBounds(350,100,100,30);
        nivel_1.addActionListener(this);
        panel_niveles.add(nivel_1);

        //Boton nvel 2
        nivel_2= new JButton("Nivel 2");
        nivel_2.setBounds(350,150,100,30);
        nivel_2.addActionListener(this);
        panel_niveles.add(nivel_2);

        //Boton nvel 3
        nivel_3= new JButton("Nivel 3");
        nivel_3.setBounds(350,200,100,30);
        nivel_3.addActionListener(this);
        panel_niveles.add(nivel_3);

        //Boton regresar
        regresar= new JButton("Regresar");
        regresar.setBounds(350,250,100,30);
        regresar.addActionListener(this);
        panel_niveles.add(regresar);

        //Panel de nivel 1
        panel_nivel_1 = new JPanel();
        panel_nivel_1.setLayout(null);
        panel_nivel_1.setBackground(Color.black);

        //Carga de la imagen que se va a utilziar para representar las granjas
        ImageIcon aldea_1 = new ImageIcon("D:\\Proyectos Java\\Proyecto_3_AntMania\\Imagenes\\grafo1.png");

        //Carga de la hormigas verde y azul
        ImageIcon hormiga_verde= new ImageIcon("D:\\Proyectos Java\\Proyecto_3_AntMania\\Imagenes\\h_Verde.png");
        ImageIcon hormiga_azul= new ImageIcon("D:\\Proyectos Java\\Proyecto_3_AntMania\\Imagenes\\h_Azul.png");
        ImageIcon comida1 = new ImageIcon("D:\\Proyectos Java\\Proyecto_3_AntMania\\Imagenes\\comida.png");

        //Labels para cargar las hormigas
        h_verde = new JLabel();
        h_verde.setBounds(450,75,75,75);
        h_verde.setIcon(new ImageIcon(hormiga_verde.getImage().getScaledInstance(75,40,Image.SCALE_SMOOTH)));
        h_verde.setVisible(true);
        panel_nivel_1.add(h_verde);

        h_azul = new JLabel();
        h_azul.setBounds(75,75,75,75);
        h_azul.setIcon(new ImageIcon(hormiga_azul.getImage().getScaledInstance(75,40,Image.SCALE_SMOOTH)));
        h_azul.setVisible(true);
        panel_nivel_1.add(h_azul);

        comida = new JLabel();
        comida.setBounds(325,320,75,75);
        comida.setIcon(new ImageIcon(comida1.getImage().getScaledInstance(75,40,Image.SCALE_SMOOTH)));
        comida.setVisible(true);
        panel_nivel_1.add(comida);

        comida2 = new JLabel();
        comida2.setBounds(690,320,75,75);
        comida2.setIcon(new ImageIcon(comida1.getImage().getScaledInstance(75,40,Image.SCALE_SMOOTH)));
        comida2.setVisible(true);
        panel_nivel_1.add(comida2);


        //Labels en donde se encuentran
        granja1= new JLabel();
        granja1.setBounds(10,75,400,350);
        granja1.setIcon(new ImageIcon(aldea_1.getImage().getScaledInstance(450,400, Image.SCALE_SMOOTH)));

        panel_nivel_1.add(granja1);

        granja2= new JLabel();
        granja2.setBounds(375,75,400,350);
        granja2.setIcon(new ImageIcon(aldea_1.getImage().getScaledInstance(450,400, Image.SCALE_SMOOTH)));

        panel_nivel_1.add(granja2);

        //lABELS PARA IDENTIFICAR LAS GRANJAS

        granja_azul= new JLabel("Granja Azul");
        granja_azul.setBounds(25,25,400,50);
        granja_azul.setHorizontalAlignment(SwingConstants.CENTER);
        granja_azul.setVerticalAlignment(SwingConstants.CENTER);
        granja_azul.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        granja_azul.setForeground(Color.BLUE);
        granja_azul.setBackground(Color.black);
        panel_nivel_1.add(granja_azul);

        granja_verde= new JLabel("Granja Verde");
        granja_verde.setBounds(325,25,400,50);
        granja_verde.setHorizontalAlignment(SwingConstants.CENTER);
        granja_verde.setVerticalAlignment(SwingConstants.CENTER);
        granja_verde.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        granja_verde.setForeground(Color.GREEN);
        granja_verde.setBackground(Color.black);
        panel_nivel_1.add(granja_verde);

        // Bototn del ganador

        gana_azul= new JButton("Gana azul");
        gana_azul.setBounds(50,500,100,30);
        gana_azul.addActionListener(this);
        panel_nivel_1.add(gana_azul);






        panel_nivel_2= new JPanel();
        panel_nivel_2.setBackground(Color.black);
        panel_nivel_2.setLayout(null);


        panel_nivel_3 = new JPanel();
        panel_nivel_3.setBackground(Color.black);
        panel_nivel_3.setLayout(null);




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
                             Estudiantes:
                             Victor Cruz Jiménez.
                             Axel Flores .
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
            Dijstra d= new Dijstra() ;
            d.nivel_1();
            edges = Arrays.asList(new Arista(0, 0, 0),new Arista(0, 1, 1),new Arista(0, 2, 2)
                    ,new Arista(1, 0, 1),new Arista(1, 1, 0),new Arista(1, 2, 2),new Arista(1, 3, 2)
                    ,new Arista(2, 0, 2),new Arista(2, 1, 2),new Arista(2, 2, 0),new Arista(2, 3, 4)
                    ,new Arista(3, 2, 4),new Arista(3, 3, 0),new Arista(3, 4, 4),new Arista(3, 5, 5),new Arista(3, 7, 5),new Arista(3, 10, 2)
                    ,new Arista(4, 1, 2),new Arista(4, 3, 4),new Arista(4, 4, 0),new Arista(4, 11, 10)
                    ,new Arista(5, 0, 1),new Arista(5, 3, 5),new Arista(5, 5, 0),new Arista(5, 7, 5)
                    ,new Arista(6, 6, 0),new Arista(6, 7, 9),new Arista(6, 8, 5)
                    ,new Arista(7, 3, 5),new Arista(7, 6, 9),new Arista(7, 7, 0),new Arista(7, 9, 2)
                    ,new Arista(8, 6, 5),new Arista(8, 8, 0),new Arista(8, 9, 1)
                    ,new Arista(9, 7, 2),new Arista(9, 8, 1),new Arista(9, 9, 0),new Arista(9, 13, 10),new Arista(9, 14, 2)
                    ,new Arista(10, 3, 2),new Arista(10, 10, 0),new Arista(10, 11, 4),new Arista(10, 12, 2),new Arista(10, 13, 10)
                    ,new Arista(11, 4, 10),new Arista(11, 10, 4),new Arista(11, 11, 0),new Arista(11, 12, 5)
                    ,new Arista(12, 10, 2),new Arista(12, 11, 5),new Arista(12, 12, 0)
                    ,new Arista(13, 9, 10),new Arista(13, 10, 10),new Arista(13, 13, 0)
                    ,new Arista(14, 9, 2),new Arista(14, 14, 0)
            );
            grafo = new Grafo(edges);
            panel_niveles.setVisible(false);
            this.add(panel_nivel_1);
            Dijstra dijstra = new Dijstra();
            dijstra.nivel_1();

            panel_nivel_1.setVisible(true);
            hormiga_azul_logica azul_logica = new hormiga_azul_logica(1, inter);
            azul_logica.start();
            try {
                azul_logica.mov_nivel_1();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }

        }

        if(e.getSource() ==  nivel_2){
            System.out.println("X");
            panel_niveles.setVisible(false);
            this.add(panel_nivel_2);
            panel_nivel_2.setVisible(true);
            crearXml xml= new crearXml(inter);

        }

        if(e.getSource() == nivel_3){
            Dijstra d= new Dijstra() ;
            panel_niveles.setVisible(false);
            this.add(panel_nivel_3);
            panel_nivel_3.setVisible(true);
            d.nivel_1();

            System.out.println("x");
        }

        if(e.getSource() == regresar){
            panel_niveles.setVisible(false);
            panel_inicio.setVisible(true);
        }
        if (e.getSource() == gana_azul){

            ganadores= new ListaDME();
            ganadores.insertarFin(xml);
        }
    }



    public static void main(String[] args) {

        inter = new gui();
        inter.setVisible(true);
    }
}