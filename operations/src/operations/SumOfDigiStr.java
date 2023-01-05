package operations;

public class SumOfDigiStr {
	public static void main(String[] args) {
		String s = "aa12a3da4fb5xfg6";
		char ch[]=s.toCharArray();
		int sum=0;
		for(int i =0; i<s.length();i++) {
			if(Character.isDigit(ch[i])) {
				sum=sum+Integer.parseInt(String.valueOf(ch[i]));	
			}
		}
		System.out.println(sum);
	}
	
	
	
//	public static void main(String[] args) {
//		String s = "aa12a3da4fb5xfg6";
//		String temp="0";
//		char ch[]=s.toCharArray();
//		int sum=0;
//		
//		for(int i=0; i<s.length();i++) {
//			if(Character.isDigit(ch[i])) {
//				temp=temp+ch[i];
//				
//			} else {
//				sum=sum+Integer.parseInt(String.valueOf(temp));
//				temp="0";
//			}
//		}
//		sum=sum+Integer.parseInt(String.valueOf(temp));
//		
//		System.out.println("sum >>"+sum);
//	}
}
