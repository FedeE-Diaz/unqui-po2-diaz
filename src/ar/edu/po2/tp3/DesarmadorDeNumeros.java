package ar.edu.po2.tp3;

import java.util.ArrayList;

public class DesarmadorDeNumeros {
	
	
	public int selectorDeEnterosConMayorCantidadDePares(int[] arrayDeEnteros) {
	
		ArrayList arrayDeCantidadDePares = new ArrayList();
	
		for(int numero: arrayDeEnteros) {
			Counter contador = new Counter(this.numeroDesarmado(numero));
			arrayDeCantidadDePares.add(contador.cantidadPares())
		}
	
	}
	
	private ArrayList numeroDesarmado(int numeroEntero) {
		ArrayList arrayDeDigitos = new ArrayList();
		double restoDeNumero = numeroEntero;
		int baseDecimalAplicable = this.cantidadDeDigitos(numeroEntero);
		
		for (int i = 0; i == this.cantidadDeDigitos(numeroEntero); i++){
			arrayDeDigitos.add(this.digitoDePosicion(restoDeNumero, baseDecimalAplicable)); 
			restoDeNumero = restoDeNumero - Math.pow(10, baseDecimalAplicable);
		}
		
		
		return arrayDeDigitos;
	}
}
