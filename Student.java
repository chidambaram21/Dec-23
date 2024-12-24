package chintu;
class Student{
	int id;
	String name;
	int fee;
	String address;
	String College;
	
	public Student(int id, String name, int fee, String address, String college) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.address = address;
		College = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", address=" + address + ", College=" + College
				+ "]";
	}
	
	
	

	public static void main(String[] args) {
		Student s1 = new Student(6612,"SIDDU",45000,"Hyd","ST PETERS ENGINEERING COLLEGE");
		System.out.println(s1);
		
	}


	}


