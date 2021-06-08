package com.an.others;

import java.io.File;

public class FileRenamer {

	public static void main(String[] args) {
		String filePath = "/media/next/04CE-D960/GODSONGS";
		File myfolder = new File(filePath); 
        File[] fileArray = myfolder.listFiles(); 
       
	}

}


/*
int counter=51;
for(int i=0;i<fileArray.length;i++) {
	File myfile = new File(filePath + 
            "/" + fileArray[i].getName()); 
   String longFileName = fileArray[i].getName(); 
   longFileName = longFileName.substring(3,longFileName.length());
   String newFileName=counter+"-"+longFileName;
   System.out.println(longFileName);
   myfile.renameTo(new File(myfolder + 
           "/" + newFileName + ".mp3")); 
   counter++;
}*/