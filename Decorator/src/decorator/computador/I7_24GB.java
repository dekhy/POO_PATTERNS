package decorator.computador;

import decorator.Computador;

public class I7_24GB extends Computador{
	
	public I7_24GB() {
		descricao = "Computado com I7 24GB de ram tela LCD vem com wallpaper do ximbinha";
	}

	@Override
	public double calcularCusto() {
		return 2.599;
	}

}
