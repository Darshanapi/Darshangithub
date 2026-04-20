package com.actitimej.generic;

import java.io.IOException;

public class GenericLibraray {

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		String url=f.getPropertyData("url");
		String un=f.getPropertyData("username");
		String pw=f.getPropertyData("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		String cn=f.getExcelData("Sheet1",1,1);
		System.out.println(cn);
		f.setExcelData("Sheet1",1,1,"Pass");
	}

}
