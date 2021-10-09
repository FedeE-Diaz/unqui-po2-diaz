package ar.edu.po2.tp4;

public class Producto {
	private String nombre;
	private Double precio;
	private Boolean esencial;
	
	public Producto(String nombre, Double precio) {
		setNombre(nombre);
		setPrecio(precio);
		setEsencial(false);
	}
	public Producto(String nombre, Double precio, Boolean esencial,Double descuento) {
		setNombre(nombre);
		setPrecio(precio * (1-descuento));
		setEsencial(esencial);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Boolean getEsencial() {
		return esencial;
	}
	public void setEsencial(Boolean esencial) {
		this.esencial = esencial;
	}
	
	
}
