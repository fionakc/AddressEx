import java.util.ArrayList;
import java.util.List;

public class test {

	static List<Person> people =new ArrayList<>();
	
	public static void main(String[] args) {
		
		//public Person(int a, String ap, int s, String st, String sb, String tw, String cy, 
		//String co, String p, String sta, String cn) {
	Person p1=new Person(1, "bob", 3, "cain st", "dave sub", "edith twn", "frank cty", "george co", "henry pro", "icarus sta", "jones cn");
	Person p2=new Person(2, "bob", 3, "cain st", "dave sub", "edith twn", "frank cty", "george co", "henry pro", "icarus sta", "jones cn");
	Person p3=new Person(0, null, 4, "caleb st", "donald sub", "edith twn", "frank cty", "george co", "henry pro", "icarus sta", "jones cn");
	Person p4=new Person(0, null, 20, "courtney st", "dingo sub", "ernie twn", "fred cty", "goth co", "holmes pro", "issac sta", "james cn");
	Person p5=new Person(14, "bill", 62, "cus st", "dylan sub", "errol twn", "ford cty", null, null, "icarus sta", "jones cn");
	
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		
		for(int i=0;i<people.size();i++) {
			System.out.println(people.get(i).getAddress());
		}
		
		
	}
	
}
