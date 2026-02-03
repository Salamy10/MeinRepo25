package P1;

public class zeichenketten {

	  public static void main(String[] args){

		    //ganze zahlen
		    byte byte1 = 67;
		    short short1 = 22_743;
		    int int1 = 1_000_000;
		    long long1 = 5_000_000_000L;    //"L" an die zahl hängen um "long" zu deklarieren

		    System.out.println("byte1: " + byte1);
		    System.out.println("short1: " + short1);
		    System.out.println("int1: " + int1);
		    System.out.println("long1: " + long1);
		    
		    
		    //zeichen
		    char char1 = 'A';
		    char char2 = 0b1000001;
		    char char3 = 0101;
		    char char4 = 65;
		    char char5 = 0x41;
		    char char6 = '\u0041';
		    
		    System.out.println("1: " + char1);
		    System.out.println("2: " + char2);
		    System.out.println("3: " + char3);
		    System.out.println("4: " + char4);
		    System.out.println("5: " + char5);
		    System.out.println("6: " + char6);

		  	//boolscher wahrheitswert
		    boolean boolean1 = true;
		    boolean boolean2 = false;
		    
		    System.out.println("1: " + boolean1);
		    System.out.println("2: " + boolean2);


		  	//Gleitkommazahlen (Floating Point Numbers)
		    float float1 = 0.1F;	//"F" an die zahl hängen um "float" zu deklarieren
		    double double1 = 0.1;
		    
		    System.out.println("float1: " + float1);
		    System.out.println("double1: " + double1);		  
		  } 		

}
