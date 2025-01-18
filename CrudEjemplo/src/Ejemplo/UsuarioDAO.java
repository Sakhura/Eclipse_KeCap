package Ejemplo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    // CREATE
    public void agregarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, email, telefono) VALUES (?, ?, ?)";
        try (Connection con = Conexion.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTelefono());
            stmt.executeUpdate();
            System.out.println("Usuario agregado exitosamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try (Connection con = Conexion.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("telefono")
                );
                listaUsuarios.add(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    // UPDATE
    public void actualizarUsuario(Usuario usuario) {
        String sql = "UPDATE usuarios SET nombre=?, email=?, telefono=? WHERE id=?";
        try (Connection con = Conexion.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTelefono());
            stmt.setInt(4, usuario.getId());
            stmt.executeUpdate();
            System.out.println("Usuario actualizado exitosamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminarUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id=?";
        try (Connection con = Conexion.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Usuario eliminado exitosamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
