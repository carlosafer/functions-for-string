package application;

public class Program {

	public static void main(String[] args) {

		String original = "ABCDE FGHIJ abcde fghij AbCdE FGhIJ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('A', 'z');
		String s07 = original.replace("AB", "35");
		int i = original.indexOf("FG");
		int j = original.lastIndexOf("FG");
		
		
		System.out.println("Alphabet: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("Substring(2): -" + s04 + "-");
		System.out.println("Substring(2, 9): -" + s05 + "-");
		System.out.println("Replace('A', 'z'): -" + s06 + "-");
		System.out.println("Replace('AB, 35'): -" + s07 + "-");
		System.out.println("Index of 'FG': -" + i + "-");
		System.out.println("Last index of 'FG': -" + j + "-");

	}

}
