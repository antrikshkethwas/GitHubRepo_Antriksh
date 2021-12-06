package NumeroProb;

 class NumeroNum {
	
	 int inp;
	 int sum;
	 
	 NumeroNum(int i)
	 {
		 inp = i;
	 }
	 
	int sumOfDigits()
	{
		sum = 0;
		int sInp = inp;
		while(sInp%10!=0)
		{
			//7654
			sum = sum + sInp%10;
			sInp = sInp/10;
			
		}
		return sum;
	}
	
	int numerology()
	{
		int nInp = sum;
		if(nInp<=9)
		{
			return nInp;
		}
		else
		{
			int sum2 = 0;
			while(nInp%10!=0)
			{
				//7654
				sum2 = sum2 + nInp%10;
				nInp = nInp/10;
			}
			
			return sum2;
		}
	}
	
	int evenNums()
	{
		int eInp = inp;
		int digit = 0;
		int eCount = 0;
		while(eInp%10!=0)
		{
			digit = eInp%10;
			if(digit%2==0)
				eCount++;
			
			eInp = eInp/10;
		}
		return eCount;	
	}
	int oNums()
	{
		int oInp = inp;
		int digit = 0;
		int oCount = 0;
		while(oInp%10!=0)
		{
			digit = oInp%10;
			if(digit%2!=0)
				oCount++;
			
			oInp = oInp/10;
		}
		return oCount;	
	}
	
}

public class numeroProb {
	public static void main(String arg[])
	{
		NumeroNum o1 = new NumeroNum(7654);
		System.out.println(o1.sumOfDigits());
		System.out.println(o1.numerology());
		System.out.println(o1.evenNums());
		System.out.println(o1.oNums());
		
	}
}
