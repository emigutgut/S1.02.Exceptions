package n2exercici1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	static Scanner dades = new Scanner(System.in);
	static byte dadaByte;
	static int dadaInt;
	static float dadaFloat;
	static double dadaDouble;
	static char dadaChar;
	static String dadaString;
	static String dadaBoolean;
	
	
	
	
	public static byte llegirByte(String missatge) throws InputMismatchException {
		
		System.out.println(missatge);
		dadaByte = dades.nextByte();
		
		return dadaByte;
		
	}
	
	public static int introduirInt(String missatge) throws InputMismatchException {
		
		System.out.println(missatge);
		dadaInt = dades.nextInt();
		
		return dadaInt;

	}
	
	public static float introduirFloat(String missatge) throws InputMismatchException {
		
		System.out.println(missatge);
		dadaFloat = dades.nextFloat();
		
		return dadaFloat;
		
	}
	
	public static double introduirDouble(String missatge) throws InputMismatchException {
		
		System.out.println(missatge);
		dadaDouble = dades.nextDouble();
		
		return dadaDouble;

	}
	
	public static char introduirChar(String missatge) throws Exception {
		
		System.out.println(missatge);
		dadaChar = (char) dades.nextInt();
		
		return dadaChar;
		
	}
	
	public static String introduirString(String missatge) throws Exception {
		
		System.out.println(missatge);
		dadaString = dades.nextLine();
		
		return dadaString;
		
	}
	
	public static boolean introduirBoolean(String missatge) throws Exception {
		
		System.out.println(missatge);
		dadaBoolean = dades.nextLine();
		
		if(dadaBoolean == "s") {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	
	
}
