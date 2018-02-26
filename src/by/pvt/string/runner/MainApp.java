package by.pvt.string.runner;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		MainApp mp = new MainApp();
		String sentense = "In Java we trust! In Java we trust! In Java we trust!";
		System.out.println(sentense);
		char newOne = 'e';
		String n = mp.changeCharInSentense(sentense, 2, newOne);
		System.out.println(n);
	}

	public String changeChar(String word, int offSet, char newChar) {
		String newWord = word;
		if (offSet > 0 && offSet <= word.length()) {
			StringBuilder sb = new StringBuilder(word);
			sb.insert(offSet, newChar);
			newWord = sb.toString();
		}
		return newWord;
	}

	public String[] splitSentense(String sentense) {
		String[] words = sentense.split(" ");
		return words;
	}

	public String replaseAllPunctuationMarks(String text) {
		return text.replaceAll("!", "").replaceAll(",", "").replaceAll(".", "");
	}

	public String changeCharInSentense(String sentense, int offSet, char newChar) {
		String s = replaseAllPunctuationMarks(sentense);
		String[] words = splitSentense(s);
		String[] newWords = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			newWords[i] = changeChar(words[i], offSet, newChar);
		}
		String newSentense = createSentense(newWords);
		return newSentense;
	}

	private String createSentense(String[] words) {
		StringBuilder sb = new StringBuilder();
		String newSentense = null;
		for (int i = 0; i < words.length; i++) {
			sb.append(words[i]);
			sb.append(" ");
		}
		return newSentense;
	}
}
