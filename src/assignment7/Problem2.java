package assignment7;
import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
	List<String> emails= new LinkedList<String>();
	List<String> validEmails= new LinkedList<String>();
	List<String> invalidEmails= new LinkedList<String>();
	
	emails.add("ex@example.com");
	emails.add("e@aaa");
	emails.add("has.com");
	emails.add("i.am@ex.com");
	emails.add("@asaa.com");
	emails.add("i.am@com");
	emails.add("s_s@ex.com");
	emails.add(".@cex.com");
	emails.add(" @aa.com");
	
	
	checkEmails(emails, validEmails, invalidEmails);
	System.out.println("\nEmails:");
	printList(emails);
	System.out.println("\nInvalid Emails::");
	printList(invalidEmails);
	System.out.println("\nValid Emails:");
	printList(validEmails);
	

	}
	
	
	public static void checkEmails(List<String> mails, List<String> valid, List<String> invalid) {
		
		for(String x: mails) {
			if(!x.contains("@")|| !x.contains("."))
				invalid.add(x);
			else if(x.charAt(0)==' ')
				invalid.add(x);
			
			else if(x.indexOf("@")> x.lastIndexOf("."))
				invalid.add(x);
			
			else if(x.indexOf("@")==0)
				invalid.add(x);
			else if(x.indexOf("@")==1 && x.charAt(0)== '.' || x.charAt(0) == '_' )
				invalid.add(x);
			else
				valid.add(x);
		}
		
	}
	

	private static void printList(List<String> list) {
		//System.out.println();
		for(String x: list) {
			System.out.printf("%s ",x);
			System.out.println();
		}
	}

}
