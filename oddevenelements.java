package Array2;

public class oddevenelements {

	public static void main(String[] args) {
		oddevenelements oeobj=new oddevenelements();
		//oeobj.oddelements();
		oeobj.evenelements();

	}

	private void evenelements() {
		int a[]= {12,20,22,36,44,33,55,80,17};
		for(int i=1;i<a.length;i=i+2) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		
	}

	private void oddelements() {
		int a[]= {12,11,22,33,44,33,55,77,17};
		for(int i=0;i<a.length;i=i+2) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		
	}

}
