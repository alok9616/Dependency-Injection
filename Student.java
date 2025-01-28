package in.sp.beans;

public class Student {
	private int rollno;
	private String name;
	private Address address;
	
	public void setRollno(int rollno) {
		System.out.println("setter method rollno");// cheak the work setter method in this program 
		this.rollno = rollno;
	}
	
	public void setName(String name) {
		System.out.println("setter method name");// cheak the work setter method in this program
		this.name = name;
	}
	
	public void setAddress(Address address) {
		System.out.println("setter method address");// cheak the work setter method in this program
		this.address = address;
	}
	public void display() {
		System.out.println("Roll no:"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Address"+address);
	}
	

}
