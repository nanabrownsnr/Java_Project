package LockedMe;

import java.io.File;
import java.io.IOException;

public class Service {
	
	
	static String path = System.getProperty("user.dir");
	static File files = new File(path);

	public static void listAllfiles ()
	{
		
		for(File f:files.listFiles())
		{
			System.out.println(f);
		}
	    System.out.println("All Files Displayed");
	}
 

	public static void addfile (String fname) throws IOException
    {
		
		File file = new File( path , fname);
		file.createNewFile();
		
		System.out.println("File Added");
    }
	
	public static void deletefile (String fname)
    {
		File file = new File( path , fname);
		file.delete();
        System.out.println("File Deleted");
	}
	
	public static void searchfile (String fname)
    {
		File file = new File( path , fname);
	
		
		for(File f :files.listFiles())
		{
			if (file==f){
				System.out.println(file);
				System.out.println(file.isDirectory());}
		}
		
		System.out.println("File Not Found");
    }
	
}