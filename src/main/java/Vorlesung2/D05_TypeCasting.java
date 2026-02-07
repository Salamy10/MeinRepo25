public class D05_Typecasting {
	
	public static void main(String[] args) {
		
		//erweiterte Typumwandlung (Type promotion)
		byte b1 = 65;
		short s1 = b1;	//kleiner container in großen 01000010 -> 00000000 01000010
		int i1 = s1;
		long l1 = i1;
		float f1 = l1;	//!!!!float lkeiner 8->4 byte
		double d1 = f1;
		
		System.out.println(b1);	//65
		System.out.println(s1);	//"
		System.out.println(i1);	//"
		System.out.println(l1);	//"
		System.out.println(f1);	//65.0
		System.out.println(d1);	//"
		
		
		//Einschränktende Typumwandlung (Type Demotion)
		double d2 = 1.9;
		//float f2 = d2;	//funktioniert nicht, da möglicher werteverlust
		float f2 = (float) d2;	//Expizit eingeforderter Wert
		long l2 = (long) f2;
		int i2 = (int) l2;
		short s2 = (short) i2;
		byte b2 = (byte) s2;
		
		System.out.println(d2);	//1.9
		System.out.println(f2);	//"
		System.out.println(l2);	//1	-> massiver wertverlust
		System.out.println(i2);	//"
		System.out.println(s2);	//"
		System.out.println(b2);	//"
		
		//Typumwandlung für Char <-> int
		int i3 = 'A';	//zahlenwert 65
		char c3 = 65;	//Zeichen "A"
		
		System.out.println(i3);
		System.out.println(c3);
	}
}
