package array;

import java.util.HashMap;


public class MatrizHashMap {
	
	

	public static void main(String[] args) {
		
		//Chando a função HashMap
		HashMap<String, String>  carros = new HashMap<String, String>(); 
		
		carros.put("Uno", "preto");
		carros.put("Palio", "vermelho");
		carros.put("Camaro", "verde");
		
		//Mostrando registro através da string consultada
		System.out.println(carros.get("Uno"));

		//Forma de retonar todos o registros
		System.out.println(carros);
		
		//Forma de remover resgistro
		carros.remove("Uno");
		System.out.println(carros);
		
		//Mostrando quantidade de registro 
		System.out.println(carros.size());
		
		
	}

}
