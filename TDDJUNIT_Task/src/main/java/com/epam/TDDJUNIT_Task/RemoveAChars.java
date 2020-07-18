package com.epam.TDDJUNIT_Task;

public class RemoveAChars {

	public String remove(String string) {
		String result="";
		if(string.charAt(0)=='A') {
		    result= string.replaceFirst("A", "");
		    if(string.charAt(1)=='A') {
				result=result.replaceFirst("A", "");
		    }
		}
		else {
			if(string.charAt(0)!='A' && string.charAt(1)=='A') {
				result=string.replace("A", "");
			}
		}	
		 return result;
	}
	
}
