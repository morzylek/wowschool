public class Main {
	private static int add(String inpLiczba1, String inpLiczba2) {
		int localLiczba1 = Integer.parseInt(inpLiczba1);
		int localLiczba2 = Integer.parseInt(inpLiczba2);
		
		return localLiczba1 + localLiczba2;
	}
	public static void main(String[] args) {
		if(args.length == 2) {
			String localInteger1 = args[0];
 		String localInteger2 = args[1];
			
			System.out.println("Liczba nr 1: " + localInteger1);
			System.out.println("Liczba nr 2: " + localInteger2);
					
			int  localWynik = add(localInteger1, localInteger2);
			
			System.out.println("Wynik: " + localWynik);
			System.out.println("© Copyright Micha³ Orzy³owski");
		}
		else {
			System.out.println("Podaj dwa Argumenty");
			System.out.println("© Copyright Micha³ Orzy³owski");
		}
	}
}