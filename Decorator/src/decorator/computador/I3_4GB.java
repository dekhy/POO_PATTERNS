package decorator.computador;

import decorator.Computador;

public class I3_4GB extends Computador{
	
	public I3_4GB() {
		descricao = "Computado com I3 4GB de ram tela LCD vem com wallpaper do Joelma";
	}

	@Override
	public double calcularCusto() {
		return 3.599;
	}

}
