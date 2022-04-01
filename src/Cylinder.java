public class Cylinder extends Circle {
    double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }

    @Override
    public String toString() {
        return "Hình trụ chiều cao " + this.getHeight() +
                " có diện tích " + this.getArea() +
                " thuộc lớp " + super.toString();
    }
}
