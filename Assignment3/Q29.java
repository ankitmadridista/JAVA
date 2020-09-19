class Q29{
	public static void main(String args[]){
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		int c[] = {7,8,9};
		int arr[][] = new int[3][];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		System.out.println("Total number of one-D arrays: " + arr.length );
		for( int i = 0 ; i < arr.length ; i++ ){
		int sum = 0;
			for( int j = 0 ; j < arr[i].length ; j++ ){
				sum++;
			}
		System.out.println("Total number of elements of one-D array " + i + ": " + sum );
			
		}	
		
	}	
}


