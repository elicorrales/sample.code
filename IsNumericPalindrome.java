public class IsNumericPalindrome {

		public static boolean isPalindrome(int number) {
			
			String numStr = ""+number;

			boolean isNegative = false;
			if (numStr.charAt(0)=='-') isNegative = true;

			if (isNegative && numStr.length()>2) {

				numStr = numStr.substring(1);

			}
			
			String revStr = new StringBuilder(numStr).reverse().toString();
			
			return (revStr.equals(numStr));
			
		}
        
        public static void main(String[] args) {
        	
        	System.out.println(isPalindrome(1));
        	System.out.println(isPalindrome(11));
        	System.out.println(isPalindrome(-111));
        	System.out.println(isPalindrome(1111));
        	System.out.println(isPalindrome(1221));
        	System.out.println(isPalindrome(212212));
        	System.out.println(isPalindrome(-101));
        	System.out.println(isPalindrome(10101));
        	System.out.println(isPalindrome(-10101));
        	System.out.println(isPalindrome(12));
        	System.out.println(isPalindrome(211));
        	System.out.println(isPalindrome(-2111));
        	System.out.println(isPalindrome(12111));
        	System.out.println(isPalindrome(21221));
        	System.out.println(isPalindrome(2212212));
        	System.out.println(isPalindrome(-2101));
        	System.out.println(isPalindrome(120101));
        	System.out.println(isPalindrome(-210101));
        }
}
