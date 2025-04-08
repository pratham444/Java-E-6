class RemoveVowelFromString
{
	public static void main(String[] args) {
		String str = "HELLO HOW ARE YOU TODAY?";
		String op = "";
		for (int i = 0 ; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if (!(isVowelCons(ch)))
				op+=ch;

			System.out.println(str);
		System.out.println(ch);
		}
		

	}

	public static boolean isVowelCons(char ch)
	{
		if(ch=='A' || ch =='E' || ch =='I' || ch =='O' ||ch =='U' )
			return true;
		else 
			return false;
	}
}