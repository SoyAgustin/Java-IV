
public class TestConexion {
	
	public static void main(String[] args) {
		//Conexion con = new Conexion();
		
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		}catch(IllegalStateException ex) {
			System.out.println("Recibiendo excepcion");
			ex.printStackTrace();
			
		}finally { //Pase lo que pase en try-catch
			System.out.println("Ejecutando finally:");
			con.cerrar();
		}
		
	}
}
