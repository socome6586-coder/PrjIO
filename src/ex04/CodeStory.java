package ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CodeStory {

	public static void main(String[] args) throws IOException {
		String path       = "D:/dev/java/PrjIO/src/ex04/";
		String filename   = "korea.csv";
		
		// 입력 파일
		FileReader fr     = new FileReader(path + filename);
		BufferedReader br = new BufferedReader(fr);
		
		// 출력 파일
		// String filename2  = "";
		// FileWriter fw     = new FileWriter(path + filename2, true);
		// BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner in = new Scanner (System.in);
		System.out.println("입력:우편번호,시/도,구/군,동,번지,SEQ");
		String   find = in.nextLine();
		br.readLine();
		
		while(true) {
			String line = br.readLine();
			if(line==null)
				break;
			String [] li   = line.trim().split(",");
			String num     = li[0].trim();
			String sido    = li[1].trim();
			String gugun   = li[2].trim();
			String dong    = li[3].trim();
			String bunji   = li[4].trim();
			int    seq     = Integer.parseInt(li[5].trim());
			
			if (find.equals(dong)) {
				
			}
			
		}
		
	}
	
}
