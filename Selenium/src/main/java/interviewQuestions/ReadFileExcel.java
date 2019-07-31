package interviewQuestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadFileExcel {
	String fileName="MyFile.txt";

	@Test(priority = 1)
	public void FileRead() 
	{
		String line=null;

		try 
		{
			FileReader fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			try {
				while((line=br.readLine())!=null) {
					System.out.println(line); 
				}
				br.close();
			} catch(IOException e) {
				e.printStackTrace();

			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void 



}

