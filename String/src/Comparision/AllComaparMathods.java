package Comparision;

public class AllComaparMathods {
	public static void main(String[] args) {
		String s1 = "Sumit";
		String s2 = "Shanzida";
		String s3 = new String("SumiT");
		String s4 = "SUMIT";
		String s5 = "SHANIDA";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		System.out.println(s4.equalsIgnoreCase(s5));// true

		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
		
	}
}
