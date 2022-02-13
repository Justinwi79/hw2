// Harold Justin Windham

public class IntegerSet 
{
	private boolean [] IntSet;
	
	public IntegerSet()
	{
		IntSet = new boolean [101]; // setting empty array 
		for(int i = 0; i <= 100; i++)
		{
			IntSet[i] = false;
		}
	};
	
	public IntegerSet union(IntegerSet iSet)
	{
		IntegerSet uSet = new IntegerSet();
		for(int i = 0; i <= 100; i++) // loop index to check boolean array
		{
			if(this.IntSet[i] == true || this.IntSet[i] == true)
			{
				uSet.IntSet[i] = true; // place integer in union set
			}
		}
		return uSet;
	};
	
	public IntegerSet intersection(IntegerSet iSet)
	{
		IntegerSet uSet = new IntegerSet();
		for(int i = 0; i <= 100; i++) // loop to check intersect
		{
			if(this.IntSet[i] == true && iSet.IntSet[i] == true)
			{
				uSet.IntSet[i] = true; // will return true if intersection of both sets
			}
		}
		return uSet;
	};
	
	public IntegerSet insertElement(int data)
	{
		this.IntSet[data] = true; // adds integer to the set
		return this;
	};
	
	public IntegerSet deleteElement(int data)
	{
		this.IntSet[data] = false; // deletes integer from the set
		return this;
	};
	
	public boolean isEqualTo(IntegerSet iSet)
	{
		boolean same = true;
		for(int i = 0; i <= 100; i++)
		{
			if(this.IntSet[i] != iSet.IntSet[i])
			{  // check if elements are equal 
				same = false;
			}
		}
		return same;
	};
	
	public String toString()
	{
		String printIt = new String();
		boolean isEmpty = true;
		for(int i = 0; i <= 100; i++) 
		{ // checking contents of array
			if(this.IntSet[i] == true) 
			{
				printIt = new String(printIt + " " + i); // print if not empty 
				isEmpty = false; 
			}
		}
		if(isEmpty == true) // return "---" to show empty array
		{
			printIt = new String("----");
		}
		return printIt;
	};
	
}