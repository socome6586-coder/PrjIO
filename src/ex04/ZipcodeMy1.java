package ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ZipcodeMy1 {

	public static void main(String[] args) throws IOException {
	// zipcode,sido,gugun,dong,bunji,seq
	// 2. (읍면동 건물명:) 입력받아 출력
	// 키보드 입력
	Scanner        in    = new Scanner(System.in);
		
	
	// File
	String         path  = ZipcodeMy1.class.getResource("").getPath(); 
	String         fname = "zipcode_utf8.csv"; 
	File           file  = new File(path + fname);
	
	FileReader     fr    = new FileReader(file);
	BufferedReader br    = new BufferedReader(fr);
	
	String         title = br.readLine(); // 첫 번째 제목줄 skip
	String         line  = "";
	int            cnt   = 0;
	
	System.out.println("입력:시/도를 입력하세요.");
	String     inAddr    = in.nextLine();
	
	while( ( line = br.readLine() ) != null ) {
		String [] li     = line.trim().split(",");
		String zipcode   = li[0].trim(); 
		String sido      = li[1].trim();
		String gugun     = li[2].trim();
		String dong      = li[3].trim();
		String bunji     = li[4].trim(); 
		int    seq       = Integer.parseInt(li[5].trim());
		
		// 3. 부산, 울산, 대구 우편번호
		if ( sido.equals(inAddr) ) {
			String fmt  = "[%s] %s %s %s %s %d\n";
			String addr = String.format(fmt, zipcode, sido, gugun, dong, bunji, seq);
			System.out.print(addr);
			cnt++;
			}
		} // while end
	System.out.println(cnt + " 건");
	
	
	
	fr.close();
	br.close();
	
	} // main end

} // class end
