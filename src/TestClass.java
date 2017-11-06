import java.io.File;
import java.io.IOException;

public class TestClass {
	public static void main(String [] args) throws IOException{
		String path = (new File(".")).getCanonicalPath() + File.separator + "src" + File.separator + "resource";
		File file = new File(path, "testFile.txt");
		file.createNewFile();
		
		System.out.println(path);
	}
}
