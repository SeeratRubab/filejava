import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class task1 {
 
	public static void main(String[] args) throws FileNotFoundException {
	File file=new File("text.txt");
	 BufferedReader br= new BufferedReader(new FileReader(file));
	 String st;
	 Integer sum=0;
	 try {
		 
	 
	 while ((st=br.readLine())!= null) {
		 sum += Integer.parseInt(st);
		 System.out.println(st);
	 }
	 System.out.println("The sum of numbers ="+sum);
	 }
	 catch(IOException e) {
		 e.printStackTrace();
		 
		  }
	}
}
