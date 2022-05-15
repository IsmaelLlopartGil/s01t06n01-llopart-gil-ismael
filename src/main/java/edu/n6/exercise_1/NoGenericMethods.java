package edu.n6.exercise_1;

public class NoGenericMethods {
	
	private String[] stringArray;
	
	public NoGenericMethods(String string1, String string2, String string3) {
		stringArray=new String[3];
		setStrings(string1, string2, string3);
	}

	public void setStrings(String string1, String string2, String string3) {
		stringArray[0]=string1;
		stringArray[1]=string2;
		stringArray[2]=string3;
	}
	
	public String[] getStrings() {
		return stringArray;
	}


	
	
}
