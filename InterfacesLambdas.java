

public class InterfacesLambdas {

	interface TwoStringPredicate {
		
		boolean someMethod(String s1, String s2);
	}
	
	static String betterString(String s1, String s2, TwoStringPredicate instance) {
	
		return instance.someMethod(s1, s2)?s1:s2;
	}
	
	public static void main(String[] args) {

		String str1 = "Yo, what's up.";
		String str2 = "Nothing much. Just chillin.";
		System.out.println(betterString(str1,str2,(s1,s2)->true));   //Yo, what's up.
		System.out.println(betterString(str1,str2,(s1,s2)->false));  //Nothing much. Just chillin.
		
		
		System.out.println(betterString(str1,str2,(s1,s2)->s1.length() < s2.length()));  //Yo, what's up.
		System.out.println(betterString(str1,str2,(s1,s2)->s1.length() > s2.length()));  //Nothing much. Just chillin.
	}

}
