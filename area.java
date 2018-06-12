public class area
{
public static void main(String...args)
{
  float pi=3.14f;
  float r=5f;
  int a=58;
  int l=8;
  int b=5;
  int h=20;
  System.out.println("RADIUS: "+r);
  System.out.println("SIDE OF SQUARE: "+a);
  System.out.println("LENGTH OF RECTANGLE: "+l);
  System.out.println("BREADTH OF RECTANGLE: "+b);
  System.out.println("HEIGHT OF CYLINDER: "+h);
  System.out.println("AREA OF CIRCLE: "+(pi*r*r));
  System.out.println("AREA OF SQUARE: "+(a*a));
  System.out.println("AREA OF RECTANGLE: "+(l*b)); 
  System.out.println("AREA OF CYLINDER: "+((2*pi*r)*(h+r)));
  System.out.println("----------------------------------------------------------------------------------------");
}
}