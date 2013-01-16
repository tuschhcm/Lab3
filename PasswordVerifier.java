public class PasswordVerifier {
	//constand for minimum password length
	private static int MINIMUM_PASSWORD_LENGTH = 6;
	
	/**
		isMinimumLength returns true when the given
		password is at least as long as the minimum
		password length
	*/
	public static boolean isMinimumLength(String str) {
		
		if(str.length() >= MINIMUM_PASSWORD_LENGTH) {
			return true;
		}
		return false;
	}
	
	/**
		hasUpperCase checks that the password has at
		least one uppercase letter
	*/
	public static boolean hasUpperCase(String str) {
		
		Character currentChar;
		
		for(int i = 0; i < str.length(); i++) {
			currentChar = str.charAt(i);
			if(currentChar.isUpperCase(currentChar)) {
				return true;
			}
		}
		return false;
	}
	
	/**
		hasLowerCase checks that the password has at
		least one lowercase letter
	*/
	public static boolean hasLowerCase(String str) {
		
		Character currentChar;
		
		for(int i = 0; i < str.length(); i++) {
			currentChar = str.charAt(i);
			if(currentChar.isLowerCase(currentChar)) {
				return true;
			}
		}
		return false;
	}
	
	/**
		hasDigit checks that the password has at least
		one digit
	*/
	public static boolean hasDigit(String str) {
		
		Character currentChar;
		
		for(int i = 0; i < str.length(); i++) {
			currentChar = str.charAt(i);
			if(currentChar.isDigit(currentChar)) {
				return true;
			}
		}
		return false;
	}
	
	/**
		hasLegalChars checks that all characters
		is the givin string are legal
	*/
	public static boolean hasLegalChars(String str) {
		boolean isLegal = false;
		Character currentChar;
		
		for(int i = 0; i < str.length(); i++) {
			
			currentChar = str.charAt(i);
			
			if(currentChar.isDigit(currentChar) || 
				currentChar.isLetter(currentChar) ||
				currentChar.equals('_')) {
				
				isLegal = true;
			
			} else {
				isLegal = false;
				break;
			}
		}
		return isLegal;
	}
	
	
	/**
		isValid checks that all requirements of
		the password are met.
	*/
	public static boolean isValid(String str) {
		
		if(isMinimumLength(str) && hasUpperCase(str) &&
			hasLowerCase(str) && hasDigit(str) && hasLegalChars(str)) {
		
			return true;	
		}
		return false;
	}
}