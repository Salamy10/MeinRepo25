public class D07_ArithmeticOperators {
	public static void main(String[] args) {
		
		//Grundrechenarten
		int a = 5, b = 3;
		
		int c1 = a + b;	//addition
		int c2 = a - b;	//subtraktion
		int c3 = a * b;	//multiplikation
		int c4 = a / b; //ganzzahlige division (Quotient)
		int c5 = a % b; //ganzzahlige division (Divisionsrest)
		double c6 = (double) a / b;	//division
		float c7 = (float) a/b;	//weniger nachkommastellen
		
		System.out.println("addition: " + c1);
		System.out.println("subtraktion: " + c2);
		System.out.println("multiplikation: " + c3);
		System.out.println("division (Quotient + Rest): " + c4 + " Rest " + c5);
		System.out.println("division (mit \"casting\"): " + c6);
		System.out.println("\" mit float (kürzer): " + c7);
		
		//Inkrementieren
		int c = 0;
		c = c + 1;	//keine Ungeleichung sondern eine Zuweisung
		c += 1; //kurform
		c++; // noch kürzer
		
		System.out.println("Inkrement \"0+1+1+1\": " + c);		
		
		//Dekrementieren
		c = c - 1;
		c -= 1;
		c--;
		
		System.out.println("Dekrement \"3-1-1-1\": " + c);
		
		//Postinkrement vs Preinkrement (UNWICHTIG)
		c = 0;
		a = 1;
		c = a++;	//c ist alter Wert von a
		System.out.println("c: " + c);
		System.out.println("a: " + a);
		
		c = 0;
		a = 1;
		c = ++a;	//c ist neuer Wert von a
		System.out.println("c: " + c);
		System.out.println("a: " + a);
		
		//Teilen durch Null
		double d1 = 1.0 / 0.0;
		double d2 = 1.0 / -0.0;
		double d3 = 0.0 / 0.0;
		double d4 = 0.0 / -0.0;
//		int i1 = 1 / 0;	//programmabbruch
//		int i2 = 1 / -0;	//"
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
//		System.out.println(i1);
//		System.out.println(i2);
		
		
	}

}
