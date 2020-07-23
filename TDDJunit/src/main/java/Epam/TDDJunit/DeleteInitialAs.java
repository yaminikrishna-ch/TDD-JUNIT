package Epam.TDDJunit;

public class DeleteInitialAs {
	public String removingAifPresentInFirstTwoCharacters(String input) {
		String output="";
		if(input.length()>1) {
			if(input.charAt(0)=='A' && input.charAt(1)=='A') {
				output=input.substring(2);
			}
			else if(input.charAt(0)=='A' && input.charAt(1)!='A') {
				output= input.substring(1,input.length());
			}
			else if(input.charAt(0)!='A' && input.charAt(1)=='A' ) {
				output= input.substring(0,1) + input.substring(2,input.length());
			}
			else {
				output = input;
			}
			
		}
		else {
			if( (input.length()== 1 && input.charAt(0)=='A') || (input.length()==0) ) {
				output= "";
			}
			else {
				output=input;
			}
		}
		return output;
	}
}
