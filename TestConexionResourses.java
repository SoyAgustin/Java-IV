
public class TestConexionResourses {
	public static void main(String[] args) throws Exception {
		
		try (Conexion con = new Conexion()){
			con.leerDatos();
		}catch(IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
	}
	//Este código hace lo mismo que la clase TestConexion
}
