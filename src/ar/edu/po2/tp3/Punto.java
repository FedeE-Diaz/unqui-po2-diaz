package ar.edu.po2.tp3;

public class Punto {

	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public Punto(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	private float x;
	private float y;
}