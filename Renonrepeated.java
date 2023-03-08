package Array2;

public class Renonrepeated {

	public static void main(String[] args) {
		Renonrepeated robj=new Renonrepeated();
		robj.nonrepeatedmethod();
		robj.repeatedmethod();
	}

	private void repeatedmethod() {
		char names[]= {'k','a','v','i','t','h','a'};
		int j=0;
		boolean rep=false;
		while(rep==false) {
			char first=names[j];
			int i=j+1;
		for(;i<names.length;i++) {
		if(names[i]==first) {
			 System.out.println("The First repeated   "+first);
			 rep=true;
			break;
		}
		else {
			continue;
		}
		}
		j++;
	}
		
	}

	private void nonrepeatedmethod() {
		char names[]= {'p','i','r','a','m','u'};
		
		for(int j=0;j<names.length-1;j++) {
		int first=names[j];
		boolean rep=false;
		int i=j+1;
		for(;i<names.length;i++) {
		if(names[i]!=first) {
			continue;
		}
		else {
			rep=true;
			break;
		}
		}	
		if(rep==false) {
			System.out.println("The First non-repeated   "+names[j]);
			 break;	 }

	}
		}
}
