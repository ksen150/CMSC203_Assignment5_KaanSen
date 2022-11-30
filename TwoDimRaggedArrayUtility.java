/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: (Give a brief description for each Class)
 * Due: 11/30/2022
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __Kaan Sen________
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public final class TwoDimRaggedArrayUtility extends Object {
	
	public TwoDimRaggedArrayUtility()
	{
		
	}

	public static double getTotal(double[][] data)
	{
		double total = 0;
		for(int i=0; i<data.length; i++)
		{
			for(int j=0; j<data[i].length; j++)
			{
				total += data[i][j];
			}
		}
		return total;
	}
	
	public static double getAverage(double[][] data)
	{
		double total = 0;
		int numOfElements = 0;
		for(int i=0; i<data.length; i++)
		{
			for(int j=0; j<data[i].length; j++)
			{
				total += data[i][j];
				numOfElements += 1;
			}
		}
		return (total/numOfElements);
	}
	
	public static double getRowTotal(double[][] data, int row)
	{
		double total = 0;
		for(int i=0; i<data[row].length; i++)
		{
			total += data[row][i];
		}
		return total;
	}
	
	public static double getColumnTotal(double[][] data, int col)
	{
		double total = 0;
		for(int i=0; i<data.length; i++)
		{
			if(col <= data[i].length - 1)
			{
				total += data[i][col];
			}
		}
		return total;
	}
	
	public static double getHighestInRow(double[][] data, int row)
	{
		double largest = data[row][0];
		for(int i=0; i<data[row].length; i++)
		{
			if(data[row][i] > largest)
			{
				largest = data[row][i];
			}
		}
		return largest;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		int largestIndex = 0;
		for(int i=0; i<data[row].length; i++)
		{
			if(data[row][i] > data[row][largestIndex])
			{
				largestIndex = i;
			}
		}
		return largestIndex;
	}
	
	public static double getLowestInRow(double[][] data, int row)
	{
		double lowest = data[row][0];
		for(int i=0; i<data[row].length; i++)
		{
			if(data[row][i] < lowest)
			{
				lowest = data[row][i];
			}
		}
		return lowest;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		int lowestIndex = 0;
		for(int i=0; i<data[row].length; i++)
		{
			if(data[row][i] < data[row][lowestIndex])
			{
				lowestIndex = i;
			}
		}
		return lowestIndex;
	}
	
	public static double getHighestInColumn(double[][] data, int col)
	{
		double largest = data[0][col];
		for(int i=0; i<data.length; i++)
		{
			if(col <= data[i].length -1)
			{
				if(data[i][col] > largest)
				{
					largest = data[i][col];
				}
			}
		}
		return largest;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		int largestIndex = 0;
		for(int i=0; i<data.length; i++)
		{
			if(data[i].length > col)
			{
				if(data[i][col] > data[largestIndex][col])
				{
					largestIndex = i;
				}
			}
		}
		return largestIndex;
	}
	
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowest = data[0][col];
		for(int i=0; i<data.length; i++)
		{
			if(col <= data[i].length -1)
			{
				if(data[i][col] < lowest)
				{
					lowest = data[i][col];
				}
			}
		}
		return lowest;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		int lowestIndex = 0;
		for(int i=0; i<data.length; i++)
		{
			if(data[i].length > col)
			{
				if(data[i][col] < data[lowestIndex][col])
				{
					lowestIndex = i;
				}
			}
		}
		return lowestIndex;
	}
	
	public static double getHighestInArray(double[][] data)
	{
		double largest = data[0][0];
		for(int i=0; i<data.length; i++)
		{
			for(int j=0; i<data[i].length; j++)
			{
				if(data[i][j] > largest)
				{
					largest = data[i][j];
				}
			}
		}
		return largest;
	}
	
	public static double getLowestInArray(double[][] data)
	{
		double lowest = data[0][0];
		for(int i=0; i<data.length; i++)
		{
			for(int j=0; i<data[i].length; j++)
			{
				if(data[i][j] < lowest)
				{
					lowest = data[i][j];
				}
			}
		}
		return lowest;
	}
	
	public static double[][] readFile(File file) throws FileNotFoundException 
	{
		String [][] Array = new String[10][10];
		FileReader f = new FileReader(file);
		BufferedReader b = new BufferedReader(f);
		
		String x;
		int r =0;
		
		try {
			while((x = b.readLine()) != null)
			{
				String Array1[] = x.split(" ");
				Array[r++]=Array1;
			}
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		double[][] array = new double[r][];
		for(int i=0; i<r; i++)
		{
			int col = Array[i].length;
			double Array2[] = new double[col];
			for(int j=0; j<col; j++)
			{
				Array2[j] = Double.parseDouble(Array[i][j]);
			}
			array[i] = Array2;
		}
		
		try {
			b.close();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			f.close();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return array;
	 }
		
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException 
	{
		FileWriter f = null;
			
		try 
		{
			f = new FileWriter(outputFile);
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		BufferedWriter b = new BufferedWriter(f);
			
		for(int i=0; i<data.length; i++)
		{
			String x = " ";
			for(int j=0; j<data[i].length; j++)
			{
				x += data[i][j] + " ";
			}
			
			try 
			{
				b.write(x);
			} 
				
			catch (IOException e) 
			{
				e.printStackTrace();
			}
				
			try 
			{
				b.newLine();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
			
		try 
		{
			b.close();
		} 
			
		catch (IOException e) 
		{
			e.printStackTrace();
		}
			
		try {
				f.close();
			} 
			
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}	
}
