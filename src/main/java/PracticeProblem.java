public class PracticeProblem {
	public static void main(String args[]) {

	}

	public static int calculate(int a, int b, char op) {
		switch (op) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
			case '/':
				return a / b;
			case '%':
				return a % b;
			case '^':
				return (int)Math.pow(a, b);
		}
		return 0;
	}
	public static final int MAXIMUM = 10;
	public static boolean totalWordsChecker(String a) {
		if (a.split("[^a-zA-Z']+").length <= MAXIMUM) {
			return true;
		}
		return false;
	}

	public static String minString (String a, String b, String c) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		c = c.toLowerCase();
		if (a.compareTo(b) < 0) {
			if (c.compareTo(a) < 0) {
				return c;
			} else {
				return a;
			}
		} else {
			if (c.compareTo(b) < 0) {
				return c;
			} else {
				return b;
			}
		}
	}
}
