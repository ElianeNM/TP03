public interface Shape {
  public double area();
  public double perimeter();
}

//
public abstract class Quadrilateral implements Shape {
  private double a;
  private double b;
  private double c;
  private double d;

  public Quadrilateral(double a, double b, double c, double d) {
    this.a = validate(a);
    this.b = validate(b);
    this.c = validate(c);
    this.d = validate(d);
  }

  protected double getA() {
    return a;
  }

  protected double getB() {
    return b;
  }

  protected double getC() {
    return c;
  }

  protected double getD() {
    return d;
  }

  private double validate(double value) {
    if (value >= 0) {
      return value;
    }

    throw new IllegalArgumentException();
  }
}

public class Rectangle extends Quadrilateral {
  public Rectangle(double b, double h) {
    super(0.0, b, h, 0.0);
  }

  public double getB() {
    return super.getB();
  }

  public double getH() {
    return super.getC();
  }

  public double area() {
    return getB() * getH();
  }

  public double perimeter() {
    return  getB() + getH() + getB() + getH() ;
  }
}
public class Square extends Quadrilateral {
  public Square(double a) {
    super(a, 0.0, 0.0, 0.0);
  }

  public double getA() {
    return super.getA();
  }

  public double area() {
    return Math.pow(getA(), 2.0);
  }
  public double perimeter() {
    return 4.0 * getA();
  }
}
public class Circle extends Quadrilateral {
  public Circle(double r) {
    super(r, 0.0, 0.0, 0.0);
  }

  public double getR() {
    return super.getA();
  }

  public double area() {
    return Math.PI * Math.pow(getR(), 2.0);
  }

  public double perimeter() {
    return 2.0 * Math.PI * getR();
  }
}
import java.util.ArrayList;

import java.util.List;

public class Principal {

  public static void main(String[] args) {

  Shape fg1 = new Rectangle(3,4);

  Shape fg2 = new Circle(5);
  
  Shape fg3 = new Square(4);

  List<Shape> lista = new ArrayList<Shape>();

  lista.add(fg1);

  lista.add(fg2);
  
  lista.add(fg3);

  for (Shape fg : lista) {

  System.out.println("Área da figura: " + fg.area());

  System.out.println("Perímetro da figura: " + fg.perimeter());
  
  }

  }

}
