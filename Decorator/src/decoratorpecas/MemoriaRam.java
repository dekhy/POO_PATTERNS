package decoratorpecas;

import decorator.Computador;
import decorator.Pecas;

public class MemoriaRam extends Pecas{
	
	private Computador computador;
	
	public MemoriaRam(Computador computador) {
		this.computador = computador;
	}

	@Override
	public String getDescricao() {
		return computador.getDescricao() + " i9 Ultima geralção ";
	}
	@Override
	public double calcularCusto() {
		return computador.calcularCusto() + 12.398;
	}
	

}
