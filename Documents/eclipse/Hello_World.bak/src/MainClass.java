public class MainClass {

public class mine_class {
    //private static int ostani_wynik
    
    private static void display(String inpMessage) {
        System.out.println(inpMessage);
    }
    
    private static int convert(String inpNumber) {
        int localResult = 0;
        
        try {
            localResult = Integer.parseInt(inpNumber);
        }
        catch (NumberFormatException localException) {
            display("Exception in convert method: " + localException.getMessage());
        }
        return localResult;
    }
    
    private static int add(int inpLiczba1, int inpLiczba2) {
        return inpLiczba1 + inpLiczba2;
    }

    public static void main (String[] args) {
        if(args.length == 2) {
            String localString1 = args[0];
            String localString2 = args[1];
            
            System.out.println("Argument 1: " + localString1);
            System.out.println("Argument 2: " + localString2);
            
            int localInteger1 = convert(localString1);
            int localInteger2 = convert(localString2);
            
            int localWynik = add(localInteger1, localInteger2);
            
            System.out.println("Wynik: " + localWynik);
        }
        else {
            System.out.println("podaj dwa argumenty");
        }
    }
}

//public class MainClass {
//	private static int add(String inpLiczba1, String inpLiczba2) {
//		int localLiczba1 = Integer.parseInt(inpLiczba1);
//		int localLiczba2 = Integer.parseInt(inpLiczba2);
//		
//		return localLiczba1 + localLiczba2;
//	}
//	public static void main(String[] args) {
//		if(args.length == 2) {
//			String localInteger1 = args[0];
//			String localInteger2 = args[1];
//			
//			System.out.println("Liczba nr 1: " + localInteger1);
//			System.out.println("Liczba nr 2: " + localInteger2);
//			
//			int  localWynik = add(localInteger1, localInteger2);
//			
//			System.out.println("Wynik: " + localWynik);
//		}
//		else {
//			System.out.println("Podaj dwa Argumenty");
//		}
//	}
//}