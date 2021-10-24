package ar.edu.po2.tp4;

public class Producto {
	private String nombre;
	private Double precio;
	private Boolean esencial;
	private Double descuento;
	
	public Producto(String nombre, Double precio) {
		setNombre(nombre);
		setPrecio(precio);
		setEsencial(false);
		setDescuento(0);
	}
	public Producto(String nombre, Double precio, Boolean esencial,Double descuento) {
		setNombre(nombre);
		setPrecio(precio);
		setEsencial(esencial);
		setDescuento(descuento);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		if (this.esPrecioCuidado()) {
			return (this.precio - (this.precio * this.descuento));
		}else {
			return this.precio;
		}
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Boolean esPrecioCuidado() {
		return esencial;
	}
	public void setEsencial(Boolean esencial) {
		this.esencial = esencial;
	}
	
	public void aumentarPrecio(Double cantidadAAumentar) {
		this.setPrecio(this.precio + cantidadAAumentar);
	}
	
	private void setDescuento(double descuento){
		this.descuento =descuento;
	}
}
