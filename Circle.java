import java.util.*;
import java.awt.*;

public class Circle {
    private int id;
    protected int x;
    protected int y;
    protected int radius;
    protected Color color;
    
    public Circle(int id, int x, int y, int radius, Color color) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }
    public int getId() {
        return this.id;
    }
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Color getColor() {
        return this.color;
    }
    public int diameter() {
        return this.radius * 2;
    }
    public boolean intersects(Circle other) {
        return Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2)) < this.radius + other.getRadius();
    }
}
