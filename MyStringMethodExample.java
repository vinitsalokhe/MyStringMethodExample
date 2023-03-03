package com.array.exercise;

public class MyStringMethodExample {

	public static void main(String[] args) {

		String s = "  Java is a programming langauge & Java is easy langauge ";
		String s1 = "Java, is a cooding, langauge";
		String s2 = " ";
		String s3 = "Bengloer";

		System.out.println("The result is : " + s.equals(s1));
		System.out.println("The HashCode is : " + s.hashCode());
		System.out.println("The toString is : " + s.toString());
		System.out.println("The total length is : " + s.length());
		System.out.println("The cheracter at pirticular index is : " + s.charAt(5));
		System.out.println("The index of pirticular cheracter is : " + s.indexOf('o'));
		System.out.println("The last index of character is : " + s.lastIndexOf('e'));
		System.out.println("The String is Empty : " + s2.isEmpty());
		System.out.println("The String is Blank : " + s2.isBlank());
		System.out.println("The replace String is : " + s3.replace('B', 'M'));
		System.out.println("The replace String is : " + s.replaceAll("Java", "Python"));
		System.out.println("The replace String is : " + s.replaceFirst("Java", "Python"));
		System.out.println("The output of trim method is : " + s.trim());
		System.out.println("The String start with : " + s.startsWith("j"));
		System.out.println("The String ends with : " + s.endsWith("j"));
		System.out.println("Upper case String is : " + s.toUpperCase());
		System.out.println("Lower case String is : " + s.toLowerCase());
		System.out.println("Substring is : " + s.substring(7));
		System.out.println("Substring is : " + s.substring(1, 14));
		
		System.out.println("----------------Join method of String-------------------");
		String bbbb = String.join("@", "Java","Pythone","CCC");
		System.out.println(bbbb);

		String[] array = s1.split(" ");
		for (String result : array) {
			System.out.println(result);
		}

		String[] myArray = s1.split(",");
		for (String result1 : myArray) {
		}

		String ss = new String("Java");
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(ss.equals(sb));

		String a1 = "10";
		String a2 = "20";

		int n1 = Integer.parseInt(a1);
		int n2 = Integer.parseInt(a2);
		System.out.println(n1 + n2);

		/*
		 * int num = 30; String valueOf = String.valueOf(num);
		 * System.out.println(valueOf+10);
		 */

		String str = new String("VinitSalokhe");
		String str1 = "Vinit";
		String str2 = "Salokhe";
		String xxx = "VinitSalokhe";
		String str7 = "VinitSalokheRam";

		String str3 = str1.concat(str2);
		System.out.println(str3);
		System.out.println(str == str3);

		String str4 = str1 + str2;
		System.out.println(str4);
		System.out.println(str == str4);

		final String str5 = str1.concat(str2);
		System.out.println(str5);
		System.out.println(str5 == str);
		System.out.println(xxx == str5);

		String str6 = str5.concat("Ram");
		System.out.println(str6);
		System.out.println(str6 == str7);
		System.out.println(str6.equals(str7));

		System.out.println("-----------------To calculate character & word count-----------------------");
		String string = "india is my country india have 27 state";
		String[] words = string.split(" ");
		System.out.println("Total number of words : " + words.length);

		String withoutSpace = string.replace(" ", "");
		System.out.println("Total number of chars : " + withoutSpace.length());
		char[] characters = withoutSpace.toCharArray();
		System.out.println(characters);
		System.out.println();
		
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1.capacity());
		
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		
		sb2.append("vinittttttttttttt");
		System.out.println(sb2.capacity());
		
		System.out.println("----------------String revers using method--------------------");
		String xxxx = "vinit";
		StringBuffer sb4 = new StringBuffer(xxxx);
		System.out.println(sb4.reverse().toString());
		System.out.println();
		
		System.out.println("-----------------String reverse using loop---------------------");
		String xx1 = "my name is vinit";
		String rev = "";
		for(int i=xx1.length()-1; i>=0; i--) {
			rev = rev + xx1.charAt(i);
		}
		System.out.println(rev);
		System.out.println();
		
		System.out.println("-------------------character wise reverse string-------------------------");
		String vvv = "my name is vinit";
		String [] stringg = vvv.split(" ");
		for(int i=stringg.length-1; i>=0; i--) {
			System.out.print(stringg[i]);
		}
		System.out.println();
		
		System.out.println("-------------------palimdrone string-------------------------");
		String maax = "radar";
		String reev = "";
		for(int i=maax.length()-1; i>=0; i--) {
			reev = reev + maax.charAt(i);
		}
		System.out.println(reev);
		if(maax.equals(reev))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
		System.out.println();
		
		System.out.println("-------------------palimdrone number-------------------------");
		int r,sum = 0, temp;
		int num = 121;
		temp = num;
		while(num>0) {
			r = num % 10;
			sum = sum*10 + r;
			num = num/10;
		}
		if(sum==temp) 
			System.out.println("palimdeome");
		
		else 
			System.out.println("Not palimdrome");
		
		System.out.println();
		
		System.out.println("-------------------Reversed number-------------------------");
		int n = 12345,  revversed = 0;
		while(n!=0) {
			int reminder = n%10;
			revversed = revversed*10 + reminder;
			n=n/10;
		}
		System.out.println(revversed);
		
		
	}
	 

}
