package com.tnsif.jagged_array;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		int[][] jagged_arr = new int[3][];
		
		jagged_arr[0]=new int[3];
		jagged_arr[1]=new int[2];
		jagged_arr[2]=new int[4];
		
		jagged_arr[0][0]=12;
		jagged_arr[0][1]=131;
		jagged_arr[0][2]=123;
		
		jagged_arr[1][0]=31;
		jagged_arr[1][1]=124;
		
		jagged_arr[2][0]=56;
		jagged_arr[2][1]=73;
		jagged_arr[2][2]=90;
		jagged_arr[2][3]=61;
		
		for(int i=0;i<jagged_arr.length;i++)
		{
			for(int j=0;j<jagged_arr[i].length;j++)
			{
				System.out.print(jagged_arr[i][j]+" ");
			}
			System.out.println();
		}
	    

	}

}
