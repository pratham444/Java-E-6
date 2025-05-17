class Anagram{
	public static void main(String[] args) {
		String a="bat";
		String b="atba";
		int n=a.length();
		int m=b.length();

		int count=0;

		for(int i=0;i<n;i++){
			for(int j=0;j<m ;j++){
				if(a.charAt(i)==b.charAt(j)){
					count++;
					b.replace(b.charAt(j),'~');
				}	
			}

		}

		if(count==n){
			System.out.println("Anagram");
		}
		else{
			System.out.println("fof");
		}

	}
}