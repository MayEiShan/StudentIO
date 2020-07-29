package StudentInfo;
import java.io.Serializable;

public class Student implements Serializable{
	public String name=" ";
	public String phone=" ";
	public String rollno=" ";
	public String address=" ";
	public Student() {}
	public Student(String name,String phone,String rollno,String address) {
		this.name=name;
		this.phone=phone;
		this.rollno=rollno;
		this.address=address;
	}
	
	public String toString() {
		String str="Name:"+name+"\nPhone:"+phone+"\nRollno:"+rollno+"\nAddress:"+address+"\n";
		return str;
	}

}
