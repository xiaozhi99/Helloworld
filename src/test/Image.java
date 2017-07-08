package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Image {
	public static void main(String[] args) throws Exception{
		File inFile=new File("d:\\111.jpg");
		File outFile=new File("d:\\222.jpg");
		//建立数据通道，让图片的二进制数据流入
		FileInputStream input=new FileInputStream(inFile);
		FileOutputStream output=new FileOutputStream(outFile);
		//边读，把读到的数据
		int content=0;
		while((content=input.read())!=-1){
			output.write(content);
		}
		output.close();
		input.close();
		
	}
}
