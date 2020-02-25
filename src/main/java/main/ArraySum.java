package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++)
		{
			int n=Integer.parseInt(br.readLine());
			bw.write(Arrays.stream(br.readLine().split(" "))
				    .map(String::trim).mapToLong(Long::parseLong).sum()+"\n");
		}
		bw.flush();
		

	}

}
