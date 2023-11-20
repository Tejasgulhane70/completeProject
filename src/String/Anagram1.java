package String;

public class Anagram1 {
	public static void main(String[] args) {
		String s1="tejas";
		String s2="ejast";
		
		int [] a1=new int[127];
		int [] a2=new int[127];
		for(int i=0;i<s1.length();i++)
		{
			int ascii1=s1.length();
			int ascii2=s2.length();
			a1[ascii1]++;
			a2[ascii2]++;
		}
		
		int i;
		for(i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i])
			{
				break;
			}
		}
		
		if(i==a1.length)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
}
