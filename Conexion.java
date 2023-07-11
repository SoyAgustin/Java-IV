public class Conexion implements AutoCloseable {

   public Conexion() {
       System.out.println("Abriendo conexion");
       //throw new IllegalStateException();
   }

   public void leerDatos() {
       System.out.println("Recibiendo datos");
       throw new IllegalStateException();  //Cuando no hay conexion exitosa
       //En este caso se simula una situación de conexion no exitosa
   }

   public void cerrar() {
       System.out.println("Cerrando conexion");
   }

   //La interfaz autocloseable tiene un metodo close()
@Override
public void close() throws Exception {
	cerrar();
	
}
}