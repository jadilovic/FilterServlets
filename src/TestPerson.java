import model.Person;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] enjoyList = {"beef", "beer", "water"};
		
		Person ja = new Person();
		ja.setName("Aki");
		ja.setGender("Male");
		ja.setEnjoy(enjoyList);
		
		System.out.println(ja.getListOfEnjoys());
	}

}
