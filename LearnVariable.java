package week1.day.sheriba;

public class LearnVariable {
	String name="priya";
	static int Age=21;
	public void name() {
		System.out.println("name:"+name);	
	}
	public static void Age() {
		int age=31;
		System.out.println("age:"+age);	
		
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnVariable obj=new LearnVariable();
		obj.name();
		LearnVariable.Age();
		//Age(21);
		
	}
}
