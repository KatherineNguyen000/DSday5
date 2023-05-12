package DataStructureDay5;

import java.util.HashMap;
import java.util.HashSet;

public class HospitalSchedules {

	public static void main(String[] args) {
		int[][] A1 = { { 1, 2, 2 }, { 3, 1, 4 } };
		int[][] A2 = { { 1, 1, 5, 2, 3 }, { 4, 5, 6, 4, 3 }, { 9, 4, 4, 1, 5 } };
		int[][] A3 = { { 4, 3 }, { 5, 5 }, { 6, 2 } };

		System.out.println("Case1 - The number of doctors working at more than one hospital : " + solution(A1));
		System.out.println("Case2 - The number of doctors working at more than one hospital : " + solution(A2));
		System.out.println("Case3 - The number of doctors working at more than one hospital : " + solution(A3));
	}

	public static int solution(int[][] A) {
		HashMap<Integer, Integer> doctor = new HashMap<Integer, Integer>();
		int count = 0;
		int N = A.length;
		int M = A[0].length;

		for (int i = 0; i < N; i++) {
			HashSet<Integer> visited = new HashSet<Integer>();
			for (int j = 0; j < M; j++) {
				int doctorID = A[i][j];
				if (!visited.contains(doctorID)) {
					visited.add(doctorID);

					if (doctor.containsKey(doctorID)) {
						int frequency = doctor.get(doctorID);
						if (frequency == 1) {
							count++;
						}
						doctor.put(doctorID, frequency + 1);
					} else {
						doctor.put(doctorID, 1);
					}
				}
			}
		}
		return count;
	}
}
// Time complexity: O(N*M)
