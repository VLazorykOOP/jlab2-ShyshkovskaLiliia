public class Task2 {
    public static void main(String[] args) {
        // Створюємо два кола
        Circle circle1 = new Circle(5.0, 0.0, 0.0);
        Circle circle2 = new Circle(3.0, 4.0, 0.0);

        System.out.println("Довжина кола: " + circle1.getCircumference());

        System.out.println("Площа круга: " + circle1.getArea());

        double x = 3.0;
        double y = 4.0;
        System.out.println("Точка (" + x + ", " + y + ") належить кругу: " + circle1.containsPoint(x, y));

        int intersections = circle1.getIntersectionPoints(circle2);
        System.out.println("Кількість точок перетину з іншим колом: " + intersections);
    }
}