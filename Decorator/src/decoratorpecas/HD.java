package decoratorpecas;

import decorator.Computador;
import decorator.Pecas;

public class HD extends Pecas{
	
	private Computador computador;
	
	public HD(Computador computador) {
		this.computador = computador;
	}

	@Override
	public String getDescricao() {
		return computador.getDescricao() + "SSD de 5TB ";
	}
	
	@Override
	public double calcularCusto() {
		return computador.calcularCusto() + 5.398;
	}
	

}
