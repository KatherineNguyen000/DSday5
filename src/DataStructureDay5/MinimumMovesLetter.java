package DataStructureDay5;

public class MinimumMovesLetter {

	public static void main(String[] args) {
		String input1 = "baaaa";
		String input2 = "baaabbaabbba";
		String input3 = "baabab";

		System.out.println("Minimum number of moves for " + input1 + " is : " + minimumMoves(input1));
		System.out.println("Minimum number of moves for " + input2 + " is : " + minimumMoves(input2));
		System.out.println("Minimum number of moves for " + input3 + " is : " + minimumMoves(input3));
	}

	public static int minimumMoves(String S) {
		int count = 0;

		for (int i = 2; i < S.length(); i++) {
			if (S.charAt(i) == S.charAt(i - 1) && S.charAt(i - 1) == S.charAt(i - 2)) {
				count++;
				i++;
			}
		}
		return count;
	}
}
// Time complexity: O(n)
