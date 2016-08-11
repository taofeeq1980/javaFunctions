package xter_in_string;

public class MatchPattern {

	public static void main(String[] args) {
		String r = matchPattern("olayinka", "oyin");
		System.out.println("Order of Occurence: " + r);

	}
	//function that accepts string1 and string2 and return string in order it appears in string1
		private static String matchPattern(String str, String pat) {

			int slen = str.length();
			int plen = pat.length();
			int prevInd = -1, curInd;
			int count = 0;
			String occurText = "";
			for (int i = 0; i < slen; i++) {
				curInd = pat.indexOf(str.charAt(i));
				if (curInd != -1) {
					if (prevInd == curInd)
						continue;
					else if (curInd == (prevInd + 1)) {
						occurText = occurText.length() == 0 ? String.valueOf(str
								.charAt(i)) : occurText + ""
								+ String.valueOf(str.charAt(i));
						count++;
					} else if (curInd == 0)
						count = 1;
					else
						count = 0;

					prevInd = curInd;
				}
				if (count == plen)
					return occurText;
			}
			return occurText;
		}
}
