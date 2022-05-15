package edu.n6.exercise_1;

public class App {

	public static void main(String[] args) {
		NoGenericMethods ngm=new NoGenericMethods("Cadena1", "cadena2", "cadena3");
		NoGenericMethods ngm2=new NoGenericMethods("Cadena3", "cadena1", "cadena2");
		String[] stringArray=ngm.getStrings();
		
		for (String string : stringArray) {
			System.out.println(string);
		}
		
		System.out.println("");
		stringArray=ngm2.getStrings();
		
		for (String string : stringArray) {
			System.out.println(string);
		}
	}

}
