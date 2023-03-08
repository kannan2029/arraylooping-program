package Array2;

public class Correspten {

	public static void main(String[] args) {
		Correspten cobj=new Correspten();
		//cobj.corrmethod();
		cobj.multiply();
		cobj.divithree();
	}

	private void divithree() {
		int arr[]= {18,9,6,5,1,21,33};
		for(int j=0;j<arr.length-1;j++) {
			arr[j]=arr[j]/3;
			}
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}

	}

	private void multiply() {
		int arr[]= {7,6,4,5,1,20,7};
		for(int j=0;j<arr.length-1;j++) {
			int first=arr[j];
		for(int i=j+1;i<arr.length;i++) {
			int result=first*arr[i];
			if(result==20) {
				System.out.println(first+"  "+arr[i]+"   "+result);
			}
		}
	}

		
	}

	private void corrmethod() {
		int arr[]= {7,6,7,5,5,8,7};
		for(int j=0;j<arr.length-1;j++) {
			int first=arr[j];
		for(int i=j+1;i<arr.length;i++) {
			int result=first+arr[i];
			if(result==10) {
				System.out.println(first+"  "+arr[i]+"   "+result);
			}
		}
	}
	}
}
