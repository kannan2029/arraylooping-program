package Array2;

public class splitarray {

	public static void main(String[] args) {
		splitarray spobj=new splitarray();
		spobj.splitmethod();
	}

	private void splitmethod() {
		int arr[]= {8,9,7,11,12,33,44,55};
		int even=0;int odd=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			even++;
		}
		else {
			odd++;
		}
	}
		/*System.out.println(even);
		System.out.println(odd);*/
	int evenarray[]=new int[even];
	int oddarray[]=new int[odd];
	int k=0;
	for(int l=0;l<arr.length;l++) {
		if(arr[l]%2==0) {
			evenarray[k]=arr[l];
			k++;
		}
		int M=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddarray[M]=arr[i];
				M++;
			}
		}
	/*	else{
			oddarray[k]=arr[l];
		}*/
	}
	System.out.println("the even array is printing");
	for(int p=0;p<even;p++) {
		System.out.println(evenarray[p]);
	}
	System.out.println("the odd array is printing");
	for(int p=0;p<odd;p++) {
		System.out.println(oddarray[p]);
	}

}
}