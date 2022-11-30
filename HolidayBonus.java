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

public class HolidayBonus extends Object {

		static final double highest = 5000.00;
		static final double lowest = 1000.00;
		static final double other = 2000.00;
		
		
	public HolidayBonus()
	{
		
	}
	
	public static double[] calculateHolidayBonus(double[][] data)
	{
		double[][] bonusArray = new double[data.length][];
		for(int i=0; i<data.length; i++)
		{
			bonusArray[i] = new double[data[i].length];
		}
		
		for(int i=0; i<bonusArray.length; i++)
		{
			for(int j=0; j<bonusArray.length; j++)
			{
				int highIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
				int lowIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, i);
				
					if(i<bonusArray[j].length)
					{
						bonusArray[highIndex][i] = highest;
						bonusArray[lowIndex][i] = lowest;
						
						if(j == highIndex || j == lowIndex)
							continue;
						else 
						{
							bonusArray[j][i] = other;
						}
						
					}
			}
			
		}
		
		double[] bonusPerStore = new double[data.length];
		for(int i=0; i<bonusArray.length; i++)
		{
			for(int j=0; j<bonusArray[i].length; j++)
			{
				bonusPerStore[i] += bonusArray[i][j];
			}
		}
		return bonusPerStore;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double[][] bonusArray = new double[data.length][];
		for(int i=0; i<data.length; i++)
		{
			bonusArray[i] = new double[data[i].length];
		}
		
		for(int i=0; i<bonusArray.length; i++)
		{
			for(int j=0; j<bonusArray.length; j++)
			{
				int highIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
				int lowIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, i);
				
				if(i<bonusArray[j].length)
				{
					bonusArray[highIndex][i] = highest;
					bonusArray[lowIndex][i] = lowest;
					
					if(j == highIndex || j == lowIndex)
						continue;
					
					else 
					{
						bonusArray[j][i] = other;
					}
				}
			}
			
		}
		
		double total = 0.0;
		
		for(int i=0; i<bonusArray.length; i++)
		{
			for(int j=0; j<bonusArray[i].length; j++)
			{
				total += bonusArray[i][j];
			}
		}
		
		return total;
	}	
}
