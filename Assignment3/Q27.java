class Q27{
	public static void main(String args[]){
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		int c[] = {7,8,9};
		int d[] = {10,11,12};
		int e[] = {13,14,15,16,17};
		int arr[][] = new int[5][];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
		int max = arr[0][0], min = arr[0][0];
		
		for( int i = 0 ; i < arr.length ; i++ ){
			for( int j = 0 ; j < arr[i].length ; j++ ){
				if( arr[i][j] > max ){
					max = arr[i][j];
				}
				if( arr[i][j] < min ){
					min = arr[i][j];
				}
			}
			
		}
		
		System.out.println("Smallest : " + min + " Greatest : " + max);
	}
}


