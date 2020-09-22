	public class ComplexNumber {
		
		private double a;
		private double b;
//		static private String c;
		
		//constructors
		
		ComplexNumber() {}
		
		ComplexNumber(double x, double y)
		{	
			a = x;
			b = y;
		}
		
		
		//Getter
		
		public double get_a()
		{
			return a;
		}
		
		public double get_b()
		{
			return b;
		}
		
		
		//Setter
	
		public void set_a(double a)
		{
			this.a = a;
		}
		
		public void set_b(double b)
		{
			this.b = b;
		}
		

		//functions
	
		public String get_number()
		{
			String text = a + " : " + b;
			return text;
		}
		
		
		public String add(ComplexNumber x)
		
		{
			this.a += x.get_a();
			this.b += x.get_b();
			String sum = a + " : " + b;
			return sum;
		}
		
		
		public String addV2(ComplexNumber x, ComplexNumber y)
		
		{
			
			a = x.get_a() + y.get_a();
			b = x.get_b() + y.get_b();
			
			String sum = a + " : " + b;
			return sum;
		}
		
		
		
		public String multi(ComplexNumber x)
		
		{
			this.a *= x.get_a();
			this.b *= x.get_b();
			
			String multi = a + " : " + b;
			return multi;
		}
		
		
		public String mulitV2(ComplexNumber x, ComplexNumber y)
		
		{
			a = x.get_a() * y.get_a();
			b = x.get_b() * y.get_b();
			
			String multi = a + " : " + b;
			return multi;

		}
		
		

				

	
		
	}
	
	
	
//	public String get_number_toString()
//	{
//		//String text = String.valueOf(a) + ":" + String.valueOf(b);
//		String text = a + " : " + b;
//		return text;
//	}
//	
//	
//	public double[] get_number_asArray()
//	{
//		double[] A = {a, b};
//		return A;
//	}
//	
//	
//	public static String get_c() {
//		return c;
//	}
//
//	public static void set_c(String c) {
//		ComplexNumber.c = c;
//	}
	
//	public static String getC() {
//		return c;
//	}
//
//	public static void setC(String c) {
//		ComplexNumber.c = c;
//	}

	
	
	
	

