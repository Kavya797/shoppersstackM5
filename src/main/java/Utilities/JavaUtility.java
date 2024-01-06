package Utilities;

import java.util.Random;

public class JavaUtility {
	
	public int GenerateRandom(int range)
	{
		Random random=new Random(range);
		int ranNumber=random.nextInt();
		return ranNumber;
	}

}
