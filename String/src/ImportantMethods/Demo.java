package ImportantMethods;

public class Demo {
		
		
		public static void main(String[] args) {
			String s1 = "ABCDEFG";
			String s2 = "xyx";
			
			System.out.println(s1.charAt(2));// print C.
			System.out.println(s1.charAt(5));// print F.
			
			
			System.out.println(s1.length());//Print 7.
			
			System.out.println(s1.toLowerCase()); // Print abcdefg.
			System.out.println(s2.toUpperCase()); // Print  XYZ.
			 
			System.out.println(s1.substring(2, 5)); // Print CDE
			
			
			System.out.println(s1.endsWith("AB")); // Print false
			System.out.println(s1.endsWith("EFG")); // Print true
			//or
			// 1.
			if(s1.endsWith("AC")) {
				System.out.println("\n\nEnd Match");
			}
			else {												//print End not Match.
				System.out.println("\n\nEnd Not Match.");
			}
			
			// 2.
			if(s1.endsWith("fg")) {
				System.out.println("End Match");
			}
			else {															//print End not Match.
				System.out.println("End Not Match.");
			}
			
			// 3.
			if(s1.endsWith("FG")) {
				System.out.println("End Match");
			}															//print End Match.
			else {
				System.out.println("End Not Match.");
			}
			
			
			
			
			
			
			// 1.
			if(s1.startsWith("AB")) {
				System.out.println("\n\nEnd Match");
			}
			else {												//print End Match.
				System.out.println("\n\nEnd Not Match.");
			}
			
			// 2.
			if(s1.startsWith("ab")) {
				System.out.println("End Match");
			}
			else {															//print End not Match.
				System.out.println("End Not Match.");
			}
			
			// 3.
			if(s1.startsWith("FG")) {
				System.out.println("End Match");
			}															//print End not Match.
			else {
				System.out.println("End Not Match.");
			}
			
			
			//As like SubString
			System.out.println(s1.contains("abc")); //print false. // you can use if, else condition.
			System.out.println(s1.contains("ABC")); //print True.  // you can use if, else condition.
			System.out.println(s1.contains("AC")); //print false.  // you can use if, else condition.
			
			String s3 = "     Shanzida Anika     ";
			System.out.println("'"+s3+"'"); // Print with White Space.// The First blank spaces and last blank spaces are call White space.
			
			System.out.println(s3.trim()); // Print without  White Space
			
			
			int a = 10;
			int b = 20;
			
			System.out.println(a+b); // Before convert into String,print 30
			
			
			//Convert into String.
			String a1 = String.valueOf(a);
			String b1 = String.valueOf(b);
			
			System.out.println(a1+b1); // Before convert into String,print 1020.
			
			
			String s4 = "100";
			String s5 = "200";
			System.out.println(s4+s5); // Print as a String 100200
			
			int a2 = Integer.parseInt(s4);
			int b2 = Integer.parseInt(s5);
			System.out.println(a2+b2);
			
			
			
	
		}
		
}
