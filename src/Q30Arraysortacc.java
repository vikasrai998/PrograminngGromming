public class Q30Arraysortacc {

	public static void main(String[] args) 
	{
		int [] arr=new int[] {3,7,4,7,6,9,1};
		int temp=0;
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+"");
		}
		
		for (int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("Elements of array sorted in ascending order :");
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
