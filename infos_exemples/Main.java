
import java.util.Enumeration;
import java.util.Properties;

public class Main {

	public static final int SIZE = 2 * 1024 * 1024;

	// pour lancer une OutOfMemoryException : java -Xmx12m Main
	private static void lancerOutOfMemoryException() {
		int[] i = new int[SIZE];
	}


	private static void afficherVariablesSysteme() {
		Properties p = System.getProperties();
		Enumeration<?> keys = p.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = (String) p.get(key);
			System.out.println(key + ": " + value);
		}

	}

	public static void main(String[] args) {
		//lancerOutOfMemoryException()
		afficherVariablesSysteme();
	}
}

