package decoratorpecas;

import decorator.Computador;
import decorator.Pecas;

public class PlacaDeVideo extends Pecas{
	
	private Computador computador;
	
	public PlacaDeVideo(Computador computador) {
		this.computador = computador;
	}

	@Override
	public String getDescricao() {
		return computador.getDescricao() + "NVIDIA GeForce RTX 2080 XC ";
	}
	
	@Override
	public double calcularCusto() {
		return computador.calcularCusto() + 5.398;
	}
	

}
