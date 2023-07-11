
public class TestCuentaExceptionChecked {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.deposita();
		} catch (MiException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
}
