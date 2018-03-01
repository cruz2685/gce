package sortingArrayObject;

public class SortObject
{
	public static void main(String[] args)
	{	
		// TODO Auto-generated method stub
		//Hello THERE
		String carN1, carN2, carN3;
		int rateNum = 0; 		
		Object car1 = new Object();
		Object car2 = new Object();
		Object car3 = new Object();
		Object temp = new Object();		
		Object[] carArr = new Object[3];		
		carN1 = car1.getCarName("Car 1");
		carN2 = car2.getCarName("Car 2");
		carN3 = car3.getCarName("Car 3");			
		carArr = new Object[]{car1, car2, car3};		
 		while (car1.distance < 100 & car2.distance < 100 & car3.distance < 100)
		{
			rateNum = car1.rate1;
			car1.racing(rateNum);
			rateNum = car2.getRate2();
			car2.racing(rateNum);
			rateNum = car3.getRate3();
			car3.racing(rateNum);
			for (int i = 0; i < carArr.length; i++)
			{
				for (int j = 0; j < carArr.length; j++)
				{
					if (j + 1 < carArr.length)
					{
						if (carArr[j].distance < carArr[j + 1].distance)
						{
							temp = carArr[j];// Temp keeps the value of arr[j]
							carArr[j] = carArr[j + 1];
							carArr[j + 1] = temp;
						}
					} // END OF IF
				} // END OF INNER LOOP
			} // END OF OUTER LOOP
			System.out.println(" ");
			
			for(int i =0; i < carArr.length; i++)
			{
				if(i < carArr.length-1)
				{
					if(carArr[i].distance == carArr[i+1].distance)
					{
						System.out.print(carArr[i].distance + " "+carArr[i].carNames);
						System.out.print(" TIED ");
					}
					else
					{
						System.out.print(carArr[i].distance + " "+ carArr[i].carNames);
						System.out.print("   ");
					}
				}//END OF IF
				else
				{
					System.out.print(carArr[i].distance + " "+carArr[i].carNames );
					System.out.print("   ");
				}
			}//END OF FOR LOOP
			System.out.println("  ");	
		} // END OF WHILE	
	}// END OF MAIN	
}// END OF CLASS
