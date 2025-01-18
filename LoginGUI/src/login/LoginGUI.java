package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    // Credenciales predefinidas (para pruebas)
    private final String USUARIO_CORRECTO = "admin";
    private final String PASSWORD_CORRECTO = "1234";

    public LoginGUI() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Crear componentes
        userField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Iniciar Sesión");
        messageLabel = new JLabel("", SwingConstants.CENTER);

        // Agregar ActionListener al botón
        loginButton.addActionListener(this);

        // Agregar componentes al JFrame
        add(new JLabel("Usuario:"));
        add(userField);
        add(new JLabel("Contraseña:"));
        add(passwordField);
        add(loginButton);
        add(messageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuarioIngresado = userField.getText();
        String passwordIngresado = new String(passwordField.getPassword());

        // Validación de credenciales
        if (usuarioIngresado.equals(USUARIO_CORRECTO) && passwordIngresado.equals(PASSWORD_CORRECTO)) {
            messageLabel.setText("¡Acceso concedido!");
            messageLabel.setForeground(Color.GREEN);
        } else {
            messageLabel.setText("Usuario o contraseña incorrectos.");
            messageLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}
