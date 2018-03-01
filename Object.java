package sortingArrayObject;
import eddy.Eddy;

import java.util.Random;

public class Object
{
	final int segment = 100;
	int distance = 0;
	int rate1 = 3; 
	String carNames;
	Eddy rand = new Eddy();	
	void racing(int rate)
	{
		distance += rate;
	}
	int getRate2()
	{	
		int rate2;
		rate2 = rand.randomNumber(2, 3);
		return rate2;
	}
	int getRate3()
	{
		int rate3;
		rate3 = rand.randomNumber(1, 5);
		return rate3;
	}
	
	String getCarName(String carName)
	{
		this.carNames = carName;
		return carNames;
	}
}
