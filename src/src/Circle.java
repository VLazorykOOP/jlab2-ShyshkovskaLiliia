public class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getCenterX() { return centerX; }
    public void setCenterX(double centerX) { this.centerX = centerX; }

    public double getCenterY() { return centerY; }
    public void setCenterY(double centerY) { this.centerY = centerY; }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean containsPoint(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
        return distance <= radius;
    }

    public int getIntersectionPoints(Circle other) {
        double distanceBetweenCenters = Math.sqrt(
                Math.pow(this.centerX - other.centerX, 2) +
                        Math.pow(this.centerY - other.centerY, 2)
        );

        double sumOfRadii = this.radius + other.radius;
        double differenceOfRadii = Math.abs(this.radius - other.radius);

        if (distanceBetweenCenters > sumOfRadii) {
            return 0;
        } else if (distanceBetweenCenters < differenceOfRadii) {
            return 0;
        } else if (distanceBetweenCenters == 0 && this.radius == other.radius) {
            return -1;
        } else if (distanceBetweenCenters == sumOfRadii || distanceBetweenCenters == differenceOfRadii) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public String toString() {
        return String.format("Коло з центром (%.2f, %.2f) і радіусом %.2f", centerX, centerY, radius);
    }
}