package repeticao;


public class Tabuada1Ao9 {
	
	public static void main(String[] args) {
		
		
		//Laço de repetição
		for (int i = 1; i < 10; i++) {
			System.out.println("======================================");
			System.out.println("=========== TABUADA DO " + i + " =============");
			System.out.println("======================================");

			for (int j = 0; j < 10; j++) {
				System.out.println(j + " x  " + i + " = " + (j * i) );
			}
		}
	}

}
