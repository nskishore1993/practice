package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RightTriangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			bw.write("Case #"+(i+1)+":\n");
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				for (int k = 0; k <n; k++) {
					if(k>=(n-1-j))
						bw.write("*");
					else
						bw.write(" ");
				}
				bw.write("\n");
			}
			
		}
		bw.flush();

	}

}
