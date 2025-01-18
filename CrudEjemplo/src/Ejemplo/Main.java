package Ejemplo;

import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		UsuarioDAO dao = new UsuarioDAO();
		
		//agregar usuario
		dao.agregarUsuario(new Usuario("Sabina", "sabina@sabina.cl", "123456789"));
		
		//lista de usuario
		List<Usuario> usuarios = dao.obtenerUsuarios();
		System.out.println("Lista de Usuarios: ");
		for( Usuario u : usuarios) {
			System.out.println(u.getId() + " - " + u.getNombre() + " - " + u.getEmail() + " - " + u.getTelefono());
		}
		
		//actualizar usuario
		Usuario usuarioActualizado = new Usuario(1, "Sabina actulizado", "sabina@sabina.cl", "123456789" );
		dao.actualizarUsuario(usuarioActualizado);

	
		//eliminar usuario
		dao.eliminarUsuario(1);
	}
}
