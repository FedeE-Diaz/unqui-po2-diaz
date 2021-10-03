package ar.edu.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> listaDeNumeros;
	
	public Counter(ArrayList<Integer> unaListaDeNumeros){
		this.setListaDeNumeros(unaListaDeNumeros);
}
	
	public ArrayList<Integer> getListaDeNumeros() {
		return listaDeNumeros;
	}

	public void setListaDeNumeros(ArrayList<Integer> listaDeNumeros) {
		this.listaDeNumeros = listaDeNumeros;
	}
	
	public int cantidadPares() {
		int contador;
		contador = 0;
		
		for(Integer numero:this.listaDeNumeros){
			if (numero % 2 == 0) {
				contador ++;
			}
		}
		return contador;
	}
	
	public int cantidadImpares() {
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
			if (esMultiploDe(numero, i)) {
				contador ++;
			}
		}
		return contador;
	}

	private boolean esMultiploDe(int numero, int i) {
		return numero % i == 0;
	}
	
	public int mayorNumeroMenorA1000DeLosQueSonMultiplos(int x, int y) {
		int mayorNumeroSinProbar = 0;
		
		for(int i = 1000; xEySonMultiplosDe(x, y, i) || i < 0; i--) {
			mayorNumeroSinProbar = i;
		}
		return mayorNumeroSinProbar;
	}
	
	private boolean xEySonMultiplosDe(int x, int y, int entero) {
		return (esMultiploDe(entero, x) && esMultiploDe(entero, y));
	}
}

// Dados dos enteros devuelve el mayor multiplo posible entre 0 y 1000


