import java.awt.*;
import javax.swing.*;

public class CafeteriaApp {
    public static void main(String[] args) {

        String[] usuarioCajero = {"Error"};
        JLabel nombreUsuario = new JLabel();

        //Ventana Principal
        JFrame ventana = new JFrame("Cafetería El Cafe");

        ventana.setSize(600, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        //Administrar Pantallas
        CardLayout cardLayout = new CardLayout();
        JPanel pantallas = new JPanel(cardLayout);

        /* ================
        Pantalla de Inicio
        ================ */

        JPanel pantallaInicio = new JPanel();
        pantallaInicio.setLayout(null);

        //Crear texto
        JLabel nombreCaf = new JLabel(
            "Cafetería el Cafe",
            SwingConstants.CENTER
         );

        //Estilo del texto
        nombreCaf.setFont(new Font("Arial", Font.BOLD, 50));
        nombreCaf.setBounds(50, 50, 500, 70);

        //crear boton
        JButton botonEntrar = new JButton("Entrar");

        //Tamano
        botonEntrar.setPreferredSize(new Dimension(200, 50));

        //Estilo del Boton
        botonEntrar.setFont(new Font("Arial", Font.BOLD, 18));
        botonEntrar.setBackground(Color.decode("#9A7B4F"));
        botonEntrar.setForeground(Color.WHITE);
        botonEntrar.setFocusPainted(false);

        //Posicion del Boton
        JPanel panelBotonEntrar = new JPanel();
        panelBotonEntrar.setBounds(200, 150, 200, 50);
        panelBotonEntrar.add(botonEntrar);

        //funcionalidad Boton Entrar
        botonEntrar.addActionListener(e -> {
            ventana.setSize(600, 600);
            ventana.setLocationRelativeTo(null);
            cardLayout.show(pantallas, "usuarios");
        });

        // Añadir componentes
        pantallaInicio.add(nombreCaf);
        pantallaInicio.add(panelBotonEntrar);

        /* ==================
        Pantalla de Usuarios
        =================== */ 

        JPanel pantallaUsuarios = new JPanel();
        pantallaUsuarios.setLayout(null);

        //Texto inicio de sesión
        JLabel tituloUsuarios = new JLabel(
            "Inicio de sesión",
            SwingConstants.CENTER
        );
        tituloUsuarios.setFont(new Font("Arial", Font.BOLD, 50));
        tituloUsuarios.setBounds(100, 100, 400, 70);

        //Texto numero de cajero
        JLabel textoUsuario = new JLabel(
            "ID del cajero:",
            SwingConstants.CENTER
        );
        textoUsuario.setFont(new Font("Arial", Font.BOLD, 20));
        textoUsuario.setBounds(150, 200, 300, 50);

        //Campo de texto para el usuario
        JTextField campoUsuario = new JTextField();
        campoUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
        campoUsuario.setBounds(150, 250, 300, 50);

        //Texto contraseña
        JLabel textoContrasena = new JLabel(
            "Contraseña:",
            SwingConstants.CENTER
        );
        textoContrasena.setFont(new Font("Arial", Font.BOLD, 20));
        textoContrasena.setBounds(150, 300, 300, 50);

        //Campo de texto para la contraseña
        JTextField campoContrasena = new JTextField();
        campoContrasena.setFont(new Font("Arial", Font.PLAIN, 20));
        campoContrasena.setBounds(150, 350, 300, 50);

        //Boton de inicio de sesión
        JButton botonUsuarios = new JButton("Aceptar");

        botonUsuarios.setPreferredSize(new Dimension(200, 50));

        botonUsuarios.setFont(new Font("Arial", Font.BOLD, 18));
        botonUsuarios.setBackground(Color.decode("#9A7B4F"));
        botonUsuarios.setForeground(Color.WHITE);
        botonUsuarios.setFocusPainted(false);

        JPanel panelBotonUsuarios = new JPanel();
        panelBotonUsuarios.setBounds(200, 420, 200, 50);
        panelBotonUsuarios.add(botonUsuarios);

        botonUsuarios.addActionListener(e -> {
            // Obtener los valores ingresados por el usuario
            String usuario = campoUsuario.getText();
            String contrasena = campoContrasena.getText();

            // Usuarios y contraseñas válidos
            if (usuario.equals("85315") && contrasena.equals("1701")) {
                usuarioCajero[0] = "Jose Angel";
                nombreUsuario.setText(usuarioCajero[0]);
                ventana.setSize(1000, 700);
                ventana.setLocationRelativeTo(null);
                cardLayout.show(pantallas, "categorias");
                campoUsuario.setText("");
                campoContrasena.setText("");
            } else if (usuario.equals("86301") && contrasena.equals("2465")) {
                usuarioCajero[0] = "Santiago Gonzalez";
                nombreUsuario.setText(usuarioCajero[0]);
                ventana.setSize(1000, 700);
                ventana.setLocationRelativeTo(null);
                cardLayout.show(pantallas, "categorias");
                campoUsuario.setText("");
                campoContrasena.setText("");
            } else if (usuario.equals("83781") && contrasena.equals("6767")) {
                usuarioCajero[0] = "Jorge Tejo";
                nombreUsuario.setText(usuarioCajero[0]);
                ventana.setSize(1000, 700);
                ventana.setLocationRelativeTo(null);
                cardLayout.show(pantallas, "categorias");
                campoUsuario.setText("");
                campoContrasena.setText("");
            } else {
                JOptionPane.showMessageDialog(ventana, "Usuario o contraseña incorrectos");
            }
        });

        // Añadir componentes
        pantallaUsuarios.add(panelBotonUsuarios);
        pantallaUsuarios.add(textoContrasena);
        pantallaUsuarios.add(textoUsuario);
        pantallaUsuarios.add(campoContrasena);
        pantallaUsuarios.add(campoUsuario);
        pantallaUsuarios.add(tituloUsuarios);

        /* ================
        Pantalla Categorias
        ================ */

        JPanel pantallaCategorias = new JPanel();
        pantallaCategorias.setLayout(null);

        // Panel de navegación
        JPanel panelNavegacion = new JPanel();
        panelNavegacion.setLayout(null);
        panelNavegacion.setBackground(Color.decode("#9A7B4F"));
        panelNavegacion.setBounds(0, 0, 1000, 50);

        // nombre del usuario
        nombreUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
        nombreUsuario.setForeground(Color.WHITE);
        nombreUsuario.setBounds(15, 0, 200, 50);
        panelNavegacion.add(nombreUsuario);

        // Cambiar Cajero
        JButton botonCambiarCajero = new JButton("Cambiar Cajero");

        botonCambiarCajero.setPreferredSize(new Dimension(200, 40));

        botonCambiarCajero.setFont(new Font("Arial", Font.BOLD, 18));
        botonCambiarCajero.setBackground(Color.white);
        botonCambiarCajero.setForeground(Color.decode("#9A7B4F"));
        botonCambiarCajero.setFocusPainted(false);
        botonCambiarCajero.setBounds(780, 5, 200, 40);
        panelNavegacion.add(botonCambiarCajero);

        botonCambiarCajero.addActionListener(e -> {
            ventana.setSize(600, 600);
            ventana.setLocationRelativeTo(null);
            cardLayout.show(pantallas, "usuarios");
        });

        // Añadir componentes
        pantallaCategorias.add(panelNavegacion);

        /* ====================
        REGISTRO DE PANTALLAS
        ==================== */

        pantallas.add(pantallaInicio, "inicio");
        pantallas.add(pantallaUsuarios, "usuarios");
        pantallas.add(pantallaCategorias, "categorias");

        ventana.add(pantallas);

        // Mostrar ventana
        ventana.setVisible(true);
    }
}