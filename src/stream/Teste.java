package stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Teste {
	public static void main(String[] args) {
		
		ArrayList<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto(1, "PC", 1500));
		lista.add(new Produto(2, "Notebook", 1600));
		lista.add(new Produto(3, "Teclado", 150));
		lista.add(new Produto(4, "Mouse", 15));
		lista.add(new Produto(5, "Monitor", 500));
		
		lista.stream().forEach((p) -> {
			System.out.println(p);
		});
		
		
		  System.out.println("\nProuto em ordem alfabetica...");
		  lista.stream().sorted(Comparator.comparing(p -> p.getNome())) .forEach(p ->
		  System.out.println(p));;
		  
		  System.err.println("\nProduto mais caro: ");
		  Produto produtoMaisCaro;
		  produtoMaisCaro = lista.stream().max(Comparator.comparing(p -> p.getValor()))
				  							.orElse(null);
		  
		  if (produtoMaisCaro != null) {
			System.out.println(produtoMaisCaro);
		}
		 
	}
}
