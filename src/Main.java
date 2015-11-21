
public class Main {
	private static int myLastResult;
	
	private static void display(String inpMessage) {
		System.out.println(inpMessage);
	}
	
	private static int convert(String inpNumber) {
		int localResult;
		
		try {
			localResult = Integer.parseInt(inpNumber);
		}
		catch(NumberFormatException localException) {
			display("Exception in convert method: " + localException.getMessage());
		}
		finally {
			localResult = 0;
		}
		
		return localResult;
	}
	
	private static int addExtended(int inpInteger1, int inpInteger2) {
		display("Before addition: " + myLastResult);
		myLastResult = add(inpInteger1, inpInteger2);
		display("After addition: " + myLastResult);
		
		return myLastResult;
	}
	
	private static int add(int inpInteger1, int inpInteger2) {
		int localResult = inpInteger1 + inpInteger2;
		myLastResult = localResult;
		
		return localResult;
	}
	
	public static void main(String[] args) {		
		if(args.length == 2) {
			String localString1 = args[0];
			String localString2 = args[1];
			
			display("Liczba nr 1: " + localString1);
			display("Liczba nr 2: " + localString2);
			
			int localInteger1 = convert(localString1);
			int localInteger2 = convert(localString2);
			int localWynik = addExtended(localInteger1, localInteger2);
			
			System.out.println("Wynik: " + localWynik);
		}
		else {
			System.out.println("Podaj dwa argumenty");
		}
	}
}


