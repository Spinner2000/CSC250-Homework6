import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		
		BibleBook[] book=new BibleBook[4];
		Scanner input=new Scanner(new File(System.getProperty("user.dir")+"/src/BibleBooks"));
		while(input.hasNext()) {
			BibleBook a=new BibleBook(input.nextLine());
			a.display();
		}
		input.close();
		
		
	}
}
