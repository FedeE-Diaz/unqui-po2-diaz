package ar.edu.po2.tp3;


public class Counter {
	
	private int[] listaDeNumeros;
	
	public Counter(int[] unaListaDeNumeros){
		this.setListaDeNumeros(unaListaDeNumeros);
}
	
	public int[] getListaDeNumeros() {
		return listaDeNumeros;
	}

	public void setListaDeNumeros(int[] listaDeNumeros) {
		this.listaDeNumeros = listaDeNumeros;
	}
	
	public int cantidadPares() {
		int contador;
		contador = 0;
		
		for(int numero:listaDeNumeros){
			if (numero % 2 == 0) {
				contador ++;
			}
		}
		return contador;
	}
	
	public int cantidadImpares( ) {
		int contador;
		contador = 0;
		
		for(int numero:listaDeNumeros){
			if (numero % 2 != 0) {
				contador ++;
			}
		}
		return contador;
	}
	
	
	public int cantidadMultiplos(int numero) {
		int contador;
		contador = 0;
		for(int i = 1; i <= numero; i++ ) {
			if (numero % i == 0) {
				contador ++;
			}
		}
		return contador;
	}
}