class MathOperation {
	int i ;
	void multiply(int a, int b){
		System.out.println(a*b);
	}
	void multiply(float a, float b, float c){
		System.out.println(a * b * c);
	}
	void multiply( int a[] ){
		int mul = 1;
		for( int x : a ){
			mul = mul * x;
		}
		System.out.println(mul);
	}
	void multiply(double a, int b){
		System.out.println(a * b );
	}
	
}
class Q36{
	public static void main(String args[]){
		MathOperation obj = new MathOperation();
		obj.multiply(2,2);
		obj.multiply(2.5f,2.5f,2.5f);
		obj.multiply(2.56,2); 
		obj.multiply(2,2);
		int arr[] = {1,2,3};
		obj.multiply(arr);
		
	}
}