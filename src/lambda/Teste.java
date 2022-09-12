package lambda;

public class Teste {
	public static void main(String[] args) {
		
		InterfaceServico i = new InterfaceServico() {
			
			@Override
			public void executar() {
				System.out.println("Executando i");
				
			}
		};
		i.executar();
		
		InterfaceServico i2 = new InterfaceServico() {
			
			@Override
			public void executar() {
				System.out.println("Executando i2");
			}
		};
		
		i2.executar();
		
		InterfaceServico i3 = () -> {
			System.out.println("Executando i3");
		};
		
		i3.executar();
		
	}

}
