package ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zipcode05_dong {

	public static void main(String[] args) throws IOException {
	// zipcode,sido,gugun,dong,bunji,seq
	// 2. (읍면동 건물명:) 입력받아 출력
	// 키보드 입력
	Scanner        in    = new Scanner(System.in);
		
	
	// File
	String         path      = Zipcode05_dong.class.getResource("").getPath(); 
	String         fname     = "zipcode_utf8.csv"; 
	File           file      = new File(path + fname);
	
	// 입력파일
	FileReader     fr        = new FileReader(file);
	BufferedReader br        = new BufferedReader(fr);
	
	// 출력파일
	// String         filename2 = "result.txt";
	// FileWriter     fw        = new FileWriter(path + filename2);
	// BufferedWriter bw        = new BufferedWriter(fw);
	
	String         title = br.readLine(); // 첫 번째 제목줄 skip
	String         line  = "";
	int            cnt   = 0;
	
	System.out.println("입력:동을(를) 입력하세요.\n부전동, 부암동, 개포동 등");
	String     inAddr    = in.nextLine();
	
	while( ( line = br.readLine() ) != null ) {
		String [] li     = line.trim().split(",");
		String zipcode   = li[0].trim(); 
		String dong      = li[3].trim();
		
		// 6. 부산의 부전2동 우편번호만 화면 출력
		if ( (dong.contains(inAddr)) ) {
			String fmt  = "[%s] %s\n";
			String addr = String.format(fmt, zipcode, dong);
		// 	bw.write(addr);
			System.out.print(addr);
			cnt++;
			}
		} // while end
	System.out.println(cnt + " 건");
	
	
	
	br.close();
	// bw.close();
	fr.close();
	// fw.close();
	} // main end

} // class end
