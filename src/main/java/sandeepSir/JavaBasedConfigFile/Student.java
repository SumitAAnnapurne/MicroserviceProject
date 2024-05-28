package sandeepSir.JavaBasedConfigFile;

public class Student {
	int id;
	String stdName;
	String stdAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public void Display() {
		System.out.println(id);
		System.out.println(stdName);
		System.out.println(stdAddress);
	}
	

}
