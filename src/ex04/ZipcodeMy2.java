package ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ZipcodeMy2 {

	public static void main(String[] args) throws IOException {
	// zipcode,sido,gugun,dong,bunji,seq
	// 2. (읍면동 건물명:) 입력받아 출력
	// 키보드 입력
	Scanner        in    = new Scanner(System.in);
		
	
	// File
	String         path  = ZipcodeMy2.class.getResource("").getPath(); 
	String         fname = "zipcode_utf8.csv"; 
	File           file  = new File(path + fname);
	
	FileReader     fr    = new FileReader(file);
	BufferedReader br    = new BufferedReader(fr);
	
	String         title = br.readLine(); // 첫 번째 제목줄 skip
	String         line  = "";
	int            cnt   = 0;
	
	String        inAddr = "";
	
	while( ( line = br.readLine() ) != null ) {
		String [] li     = line.trim().split(",");
		String zipcode   = li[0].trim(); 
		String sido      = li[1].trim();
		
		// 3. 부산, 울산, 대구 우편번호
		/* if ( !(sido.equals(inAddr)) ) {
			String fmt  = "%s\n";
			String addr = String.format(fmt, sido);
			System.out.print(addr);
			inAddr      = sido;
			cnt++;
			} */
		 if (!(sido.equals(inAddr))) {
			String fmt  = "%s\n";
			String addr = String.format(fmt, sido);
			System.out.print(addr);
			inAddr      = sido;
			cnt++;
		 }
		
		
		
		} // while end
	System.out.println(cnt + " 건");
	
	
	
	fr.close();
	br.close();
	
	} // main end

} // class end
