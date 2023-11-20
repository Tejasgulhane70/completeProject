package String;

public class Extract {

	public static void main(String[] args) {
		String s1="Java By Tejas";
		String ch[]=s1.split(" ");
		String ans="";
		System.out.println("=============");
		for(int i=0;i<ch.length;i++)
		{
			String reverse="";
			String s2=ch[i];
			for(int j=0;j<s2.length();j++)
			{
				reverse+=s2.charAt(s2.length()-1-j);
			}
			ans+=reverse+" ";
		}
	
		System.out.println(ans);
		
	}
}
