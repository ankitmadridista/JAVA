class Q4{
	public static void main(String args[]){
		byte a,b,c,d;
		a = 15;
		b = 20;
		c = (byte)( (int)a + (int)b ); //addition of byte data type is not supported
		d = (byte)c;
		int i = (int)c; // upcasting of c from byte to int
		System.out.println("Byte: "+d);
		System.out.println("Int: "+i);
			
		
	}	
}	