package Array2;

public class Arrayprime {

	private Object perfactnum;

	public static void main(String[] args) {
		Arrayprime aaobj=new Arrayprime();
		//aaobj.arraymethod();
		aaobj.perfactnum();

	}

	private void perfactnum() {
		int arr[]= {17,33,23,22,31,37,40,49,59};
		int perfact;
		for(int i=0;i<arr.length;i++) {
		perfact=(int) checkmethodprime(arr[i]);
		if(perfact>=1) {
			System.out.println(arr[i]);
		}}
	}
	private void arraymethod() {
		int arr[]= {17,33,23,22,31,37,40,49,59};
		int prime;
		for(int i=0;i<arr.length;i++) {
		prime=(int) checkmethodprime(arr[i]);
		if(prime==0) {
			System.out.println(arr[i]);
		}}
	}

	private Object checkmethodprime(int i) {
		int n=2;
		int count=0;
		while(n<i) {
			if(i%n==0) {
				count++;
			}
			n++;
		}
		return count;
	}

}
