package decorator;

import decorator.Computador;

public abstract class Computador {
	protected String descricao;
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public abstract double calcularCusto();
	
}
