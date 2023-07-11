public class Flujo {

  public static void main(String[] args) {
    System.out.println("Inicio de main");
    try {
		metodo1();
	} catch (Exception e) { // Esto atrapa todos los tipos de excepciones
		e.printStackTrace();
	}
    System.out.println("Fin main");
  }
  
  public static void metodo1() throws MiException{
    System.out.println("Inicio de metodo1");
    
    metodo2();
    
    System.out.println("Fin de metodo1");
  }
  
  public static void metodo2() throws MiException{
    System.out.println("Inicio de metodo2");
    
    int a = 50/0;
    Cuenta c = null;
    c.deposita();
    throw new MiException("Mi excepcion fue lanzada");
  }
  
  
}
