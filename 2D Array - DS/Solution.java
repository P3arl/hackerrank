public class Solution{
  public static int maxHourGlassSum{
    
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close(); 
		int hourGlassWidth = 3;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0;i<row-hourGlassWidth+1;i++) {
			for(int j=0;j<row-hourGlassWidth+1;j++) {
				int upperPart = a[i][j]+a[i][j+1]+a[i][j+2];
				int midPart = a[i+1][j+1];
				int lowerPart = a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				int hourGlassSum = upperPart+midPart+lowerPart;
				if(hourGlassSum > maxSum) {
					maxSum = hourGlassSum;
				}
			}
		}
		
		System.out.println("Max hourGlassSum is:: "+maxSum);
	  return maxSum;
  }
}
