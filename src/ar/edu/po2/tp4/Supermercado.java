package ar.edu.po2.tp4;

import java.util.ArrayList;


public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> catalogo;
	
	public Supermercado(String nombre, String direccion) {
		setNombre(nombre);
		setDireccion(direccion);
		setCatalogo(new ArrayList<Producto>());
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Producto> getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(ArrayList<Producto> catalogo) {
		this.catalogo = catalogo;
	}
	
	public void agregarProducto(Producto producto) {
		this.catalogo.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return this.getCatalogo().size();
	    
	}
	public double getPrecioTotal() {
		double precioTotal;
		precioTotal = 0;
		
		for(Producto producto:this.catalogo) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		return precioTotal;
	}    
	
}
