import java.util.*;

class Sequence{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a;
		int sum=0;
		System.out.println("Enter number of elements:");
		a=sc.nextInt();
		int[] array = new int[100];  
		System.out.println("enter elements:");
		for(int i=1;i<a;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("array elements are:\n");
        for(int i=1;i<a;i++){
		System.out.println(array[i]);
		}
		for(int i=1;i<a;i++){
			sum=sum+array[i];
			
		}
		System.out.println("sum of array elements:"+sum);
		int total=(a*(a+1))/2;
		System.out.println("total:"+total);
		int v=total-sum;
		System.out.println("missing number from given sequence is:"+v);
		
			
		
		
	}
}
		
