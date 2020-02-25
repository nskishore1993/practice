package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HollowDiamond {

	/*
	 * public static String printDiamond(int n) { String str=""; int mid=(n/2); int
	 * p=mid, q=mid; for(int i=0; i<n; i++) { for(int j=0;j<n;j++) { if(j==p ||
	 * j==q) { str= str+"*"; } else { str=str + " "; } } if(p==0 && q==(n-1)) { int
	 * temp=p; p=q; q=temp; } p=p-1; q=q+1; str = str + "\n"; }
	 * 
	 * return str; }
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write("Case #"+(i+1)+":\n");
			int mid=(n/2);
			int p=mid, q=mid;
			for(int l=0; l<n; l++)
			{	
				for(int j=0;j<n;j++)
				{
					if(j==p || j==q)
					{
						//str= str+"*";
						bw.write("*");
					}
					else
					{
						//str=str + " ";
						bw.write(" ");
					}
				}
				if(p==0 && q==(n-1))
				{
					int temp=p;
					p=q;
					q=temp;
				}
				p=p-1;
				q=q+1;
				//str = str + "\n";
				bw.write("\n");
			}

		}
		bw.flush();

	}

}
