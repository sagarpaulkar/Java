
public class prime1t10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp=0;
		
		for(int no=1;no<=10;no++) {
			
		for(int i=2;i<=no;i++) {
			
			if(no%i==0) {
				
				temp=temp+1;
				
			}
		}
		
		if(temp==0) {
			
			System.out.println(no);
		}else 
		{
			temp=0;
			
		}
		}
	}

	}
