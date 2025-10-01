package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritteAndReadTxtFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fi="C:\\Users\\sures\\Downloads\\sample.txt";
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fi))){
			writer.write("Success");
			writer.newLine();
			writer.write("Success2");
		}
		
		try(BufferedReader reader = new BufferedReader(new FileReader(fi))){
			String line;
			while((line=reader.readLine())!=null)
			{
			System.out.println(line);
			}
		}
	}

}
