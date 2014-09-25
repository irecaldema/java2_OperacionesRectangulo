public class Rectangulo {

	private double base = 0;
	private double altura = 0;
	private double area = 0;
	private double peri = 0;
	
public void setMedidas(double base, double altura) 
 {
	this.base = base;
	this.altura = altura;
	area = base*altura;
	peri = 2*base+2*altura;
 }
 
public double getArea() 
 {	
	return area;
 }
 
public double getPeri() 
 {	
	return peri;
 }
}
