package ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zipcode05_gugun {

	public static void main(String[] args) throws IOException {
	// zipcode,sido,gugun,dong,bunji,seq
	// 7. 부산 부산진구 우편번호를 파일( .csv )로 출력
	// 키보드 입력
	Scanner        in    = new Scanner(System.in);
		
	
	// File
	String         path      = "D:/dev/java/PrjIO/src/ex04/"; 
	String         fname     = "zipcode_utf8.csv";
	File           file      = new File(path + fname);
	
	// 입력파일
	FileReader     fr        = new FileReader(file);
	BufferedReader br        = new BufferedReader(fr);
	
	// 출력파일
	String         filename2 = "busanjingu.csv";
	FileWriter     fw        = new FileWriter(path + filename2);
	BufferedWriter bw        = new BufferedWriter(fw);
	
	String         title = br.readLine(); // 첫 번째 제목줄 skip
	String         line  = "";
	int            cnt   = 0;
	
	System.out.println("입력:'구/군'을(를) 입력하세요.\n강남(구), 부산(진구) 등");
	String     inAddr    = in.nextLine();
	
	while( ( line = br.readLine() ) != null ) {
		String [] li     = line.trim().split(",");
		String zipcode   = li[0].trim(); 
		String gugun     = li[2].trim();
		
		// 7. 부산 부산진구 우편번호를 파일( .csv )로 출력
		if ( (gugun.contains(inAddr)) ) {
			String fmt  = "[%s] %s\n";
			String addr = String.format(fmt, zipcode, gugun);
			bw.write(addr);
			System.out.print(addr);
			cnt++;
			}
		} // while end
	System.out.println(cnt + " 건");
	
	
	
	br.close();
	bw.close();
	fr.close();
	fw.close();
	} // main end

} // class end
