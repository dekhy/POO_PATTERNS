package decorator;


import decoratorpecas.MemoriaRam;
import decoratorpecas.PlacaDeVideo;
import decorator.computador.I7_24GB;
import decoratorpecas.HD;


 class Tester {
	public static void main(String[] args) {
		
		Computador s1 = new I7_24GB();
		s1 = new MemoriaRam(s1);
		s1 = new PlacaDeVideo(s1);
		s1 = new HD(s1);
		s1 = new HD(s1);
		
		System.out.println(s1.getDescricao());
		System.out.println(s1.calcularCusto());
		
		
	}

}
