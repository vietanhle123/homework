package BTVN_Java;
public class Student {

	private int id;
	private String name;
	private boolean gender;

	public Student(){
		this.id= -1;
		this.name = "noname";
		this.gender= true;
	}
	
	public Student(int id,String name, boolean gender){
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int value){
		this.id = value;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public boolean isMale(){
		return this.gender;
	}

	public void setMale(boolean value){
		this.gender = value;
	}

	public void printlnfo(){
		System.out.println("-------------------------------------------");
		System.out.println("|  ID   |         NAME            | MALE   |");
		System.out.printf(" | %d    | %s             | %b     |\n",this.id,this.name,this.gender);
	}

	public class Client {
		public static void main(String []agrs) {
			Student studentA;
			Student studentB;

			studentA=new Student();
			studentB=new Student(1,"Nguyen Van A",true);

			studentB.printlnfo();

			studentB.setName("Nguyen Van B");
			studentB.printlnfo();


		}
	}
}
