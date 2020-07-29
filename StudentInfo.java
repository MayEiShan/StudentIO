package StudentInfo;
import java.util.*;

import java.io.*;


public class StudentInfo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String std;
		String st = "";
 		Student s;
		do {
			System.out.print("Enter name: ");
	 		String name = sc.nextLine();
	 		System.out.print("Enter ph no: ");
	 		String ph= sc.nextLine();
	 		System.out.print("Enter roll no: ");
	 		String rno= sc.nextLine();
	 		System.out.print("Enter address: ");
	 		String address= sc.nextLine();
	 		Student student = new Student (name,ph,rno,address);
		      try {
		    	  File  file = new File("StudentInfo.txt");
		    	  file.createNewFile();
		    	  FileOutputStream fout= new FileOutputStream(file);
		    	  ObjectOutputStream oout = new ObjectOutputStream(fout);
		    	  oout.writeObject(student);
		    	  oout.close();
		    	  
		    	  FileInputStream fin = new FileInputStream(file);
		    	  ObjectInputStream oin = new ObjectInputStream(fin);
		    	  s = (Student) oin.readObject();
		    	  st+=s.toString()+"\n";
		    	  System.out.println(st);
		    	  oin.close();
		    	  fin.close();
		      }
		      catch(IOException e) {
		    	  e.printStackTrace();
		      }
		      catch(ClassNotFoundException e) {
		    	  e.printStackTrace();
		      }
		     
		      System.out.print("Do you enter next (y/n)?: ");
		      std= sc.nextLine();
		}while(std.equals("y"));	
	}
}
