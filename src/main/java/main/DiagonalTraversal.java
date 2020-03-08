package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class DiagonalTraversal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t ;i++)
		{
			int s = Integer.parseInt(br.readLine());
			int [][] arr = new int[s][s];
			for(int j=0; j<s; j++)
			{
				arr[j] = Arrays.stream(br.readLine().split(" "))
					    .map(String::trim).mapToInt(Integer::parseInt).toArray();
			}
			for(int j=s-1; j>=0 ;j--)
			{
				int temp = j;
				int sum = 0;
				int k=0;
				while(temp <= s-1 )
				{
					sum = sum + arr[k][temp];
					//System.out.println(sum);
					k++;
					temp++;
				}
				bw.write(sum+" ");
				
			}
			for(int j=1; j<s;j++)
			{
				int temp = j;
				int sum = 0;
				int k=0;
				while(temp <= s-1 )
				{
					sum = sum + arr[temp][k];
					//System.out.println(sum);
					k++;
					temp++;
				}
				bw.write(sum+" ");
				
			}
			bw.write("\n");
			
		}
		bw.flush();

	}

}
