package com.arya.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCountInFile {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/BlueScope/EclipseWork/Test/src/wordCount.txt"));
			Map<String,Integer> map = new HashMap<String,Integer>();
			String line = null;
			while((line = br.readLine()) != null)
			{
				StringTokenizer st = new StringTokenizer(line, " ");
				
				while(st.hasMoreTokens())
				{
					String temp = st.nextToken();
					if(map.containsKey(temp))
						map.put(temp, map.get(temp)+1);
					else
						map.put(temp, 1);
				}
			}
			
			System.out.println(map);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		
	}
}
