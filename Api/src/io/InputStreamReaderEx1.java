package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;

// ���� ��ȯ ���� ��Ʈ��
// ����Ʈ��� ��Ʈ�� => Reader or Writer �� ��ȯ�ؼ� ���
// ���ڵ� ��� ����(utf-8,euc-kr,ms949,ascii.....)


public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		
		
		try(InputStreamReader reader = new InputStreamReader
				(new FileInputStream("c:\\temp\\file1.txt"),"ms949");
			FileWriter writer = new FileWriter("c:\\temp\\test3.txt")) {
			
			char cbuf[]=new char[100];
			
			while(reader.read(cbuf)!=-1) {
				writer.write(cbuf);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}














