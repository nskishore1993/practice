package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MatrixRotation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t ;i++)
		{
			int s = Integer.parseInt(br.readLine());
			long [][] arr = new long[s][s];
			for(int j=0; j<s; j++)
			{
				arr[j] = Arrays.stream(br.readLine().split(" "))
					    .map(String::trim).mapToLong(Long::parseLong).toArray();
			}
			bw.write("Test Case #"+(i+1)+":\n");
			for(int j=0; j<s; j++)
			{
				for(int k=s-1; k>=0; k--)
				{
					if(k!=0)
					bw.write(arr[k][j]+" ");
					else
						bw.write(arr[k][j]+"");
				}
				bw.write("\n");
			}
		}
		bw.flush();
		
		
	}

}
