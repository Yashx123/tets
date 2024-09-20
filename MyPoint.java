
package mypoint;
public class MyPoint {
private int x=0;
private int y=0;
public MyPoint()
{
    this.x=0;
    this.y=0;
}
public MyPoint(int x,int y)
{
    this.x=x;
    this.y=y;
}
public double distance(int x,int y)
{
    int xDiff=this.x-x;
    int yDiff=this.y-y;
    return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
}
public double distance(MyPoint another)
{
    int xDiff=this.x-another.x;
    int yDiff=this.y-another.y;
    return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
}
public double distance()
{
    return Math.sqrt(x*x+y*y);
}
public int getX()
{
    return x;
}
public void setX(int X)
{
    this.x=x;
}
public int getY()
{
    return y;
}
public void setY(int Y)
{
    this.y=y;
}
public void setXY(int x,int y)
{
    this.x=x;
    this.y=y;
}
public String toString()
{
    return"("+x+","+y+")";
}
public static void main(String[] args) 
{
    MyPoint point1=new MyPoint(3,4);
    MyPoint point2=new MyPoint(6,8);
    System.out.println("Point 1 coordinate:"+point1.toString());
    System.out.println("Point 2 coordinate:"+point2.toString());
    System.out.println("distance from point1 to(6,8):"+point1.distance(6,8));
    System.out.println("distance from point1 to point2:"+point1.distance(point2));
    System.out.println("distance from point1 to origin:"+point1.distance());
    }
    
}
