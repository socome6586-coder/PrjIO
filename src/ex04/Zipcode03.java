package ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zipcode03 {

	public static void main(String[] args) throws IOException {
		// 3. 부산, 대구, 울산 우편번호
		// 부산:3605
		// 대구:2782
		// 울산:820
		
	Scanner in = new Scanner(System.in);
	System.out.println("검색할 시/도를 입력하세요.\n부산,대구,울산");
	String         sidos = in.nextLine(); // "부산,대구,울산"
	
	// File
	String         path  = Zipcode03.class.getResource("").getPath(); 
	String         fname = "zipcode_utf8.csv"; 
	File           file  = new File(path + fname);
	if(!file.exists()) {
		System.out.println(file + "이 없습니다.");
		System.exit(-1); // 프로그램 강제 종료
	}
	
	FileReader     fr    = new FileReader(file);
	BufferedReader br    = new BufferedReader(fr);
	
	String         title = br.readLine(); // 첫 번째 제목줄 skip
	String         line  = "";
	int            cnt   = 0;
	int            cnt1  = 0;  //부산
	int            cnt2  = 0;  //대구
	int            cnt3  = 0;  //울산
	
	while( ( line = br.readLine() ) != null ) {
		String [] li     = line.trim().split(",");
		String zipcode   = li[0].trim(); 
		String sido      = li[1].trim();
		String gugun     = li[2].trim();
		String dong      = li[3].trim();
		String bunji     = li[4].trim(); 
		int    seq       = Integer.parseInt(li[5].trim());
		
		// 3~4. 부산, 울산, 대구 우편번호
		// 부산:3605
		// 대구:2782
		// 울산:820
		switch(sido) {
		case "부산": cnt1++; break;
		case "대구": cnt2++; break;
		case "울산": cnt3++; break;
		}
		
	} // while end
	
	System.out.println("부산 : " + cnt1 + " 건");
	System.out.println("대구 : " + cnt2 + " 건");
	System.out.println("울산 : " + cnt3 + " 건");
	
	
	fr.close();
	br.close();

	}// main end
}// class end