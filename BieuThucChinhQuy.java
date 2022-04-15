package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BieuThucChinhQuy {
	public static void main(String[] args) {
		String input="2bkbv";
		String patternStr = ".+[abc][zv].*";
		Pattern pattern = Pattern.compile(patternStr);
		Matcher match = pattern.matcher(input);
		Boolean matchFound= match.matches();
		System.out.println("_Match"+ matchFound);
	}

}
