import java.io.*;
import java.util.Scanner;

class FileReaderJava{
	public static void main(String[] args) throws IOException, FileNotFoundException{
		try{
		/*File f = new File("C:/Users/Dev Ops/Documents/FileWriter Java/myFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null){
		System.out.println(s);
		}
		br.close();*/
		File f = new File("C:/Users/Dev Ops/Documents/FileWriter Java/myFile.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()){
		System.out.println(sc.nextLine());
		}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			//e.getMessage();
		}

	}
}