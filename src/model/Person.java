package model;

public class Person {

	private String name;
	private String gender;
	private String[] enjoy;
	
	
	public String getListOfEnjoys() {
		String listOfEnjoys = print();
		return listOfEnjoys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getEnjoy() {
		return enjoy;
	}

	public void setEnjoy(String[] enjoy) {
		this.enjoy = enjoy;
	}
	
	public String print() {
		String listOfEnjoys = "";
		for(int i = 0; i < enjoy.length; i++) {
			listOfEnjoys = listOfEnjoys + enjoy[i] + ", ";
		}
		return listOfEnjoys;
	}

}