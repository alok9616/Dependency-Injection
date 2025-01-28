package in.sp.beans;

public class Address {
  private int houseno;
  private String city;
  private int pincode;
public void setHouseno(int houseno) {
	System.out.println("setter method houseno");// cheak the work setter method in this program
	this.houseno = houseno;
}
public void setCity(String city) {
	System.out.println("setter method city");// cheak the work setter method in this program
	this.city = city;
}
public void setPincode(int pincode) {
	System.out.println("setter method pincode");// cheak the work setter method in this program
	this.pincode = pincode;
}

@Override
	public String toString() {
		 
		return "#"+houseno+" ,"+city+" -"+pincode;
	}
  
}
