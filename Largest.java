public class Largest {
public static void main(String args[]){
	int [] a={34,67,12,9,4};
	int maximum=a[0];
	for (int i=0;i< a.length;i++)
	{
		if(a[i]>maximum)
			maximum=a[i];
	}
	System.out.println("largest number is" + maximum);
	}
}


			