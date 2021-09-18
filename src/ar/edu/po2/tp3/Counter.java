package ar.edu.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private int[] listaDeNumeros;
	
	Counter(int[] unaListaDeNumeros){
		this.setListaDeNumeros(unaListaDeNumeros);
}
	
	public int[] getListaDeNumeros() {
		return listaDeNumeros;
	}

	public void setListaDeNumeros(int[] listaDeNumeros) {
		this.listaDeNumeros = listaDeNumeros;
	}
	
	public int contarPares() {
		int contador;
		contador = 0;
		
		for(int numero:listaDeNumeros){
			if (numero / 2 == 0) {
				contador ++;
			}
		}
		return contador;
	}
	
	public int contarImpares( ) {
		int contador;
		contador = 0;
		
		for(int numero:listaDeNumeros){
			if (numero / 2 != 0) {
				contador ++;
			}
		}
		return contador;
	}
}