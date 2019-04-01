
public class ejer2 {

	public static void main(String[] args) {
		int[] temperatures= {65,71,68,85,87,89,78};
		int[] daylytemperatures = temperatures;
		daylytemperatures[6]=101;
		System.out.print(temperatures[6]);
	}

}
