public class Task1 {
    public static void main(String[] args) {
        // Створюємо грошові суми
        Money money1 = new Money(16, (byte) 50);
        Money money2 = new Money(5, (byte) 75);

        System.out.println("Сума 1: " + money1);
        System.out.println("Сума 2: " + money2);
        System.out.println();


        Money resultAdd = money1.add(money2);
        System.out.println("Додавання: " + money1 + " + " + money2 + " = " + resultAdd);

        // Віднімання
        Money resultSubtract = money1.subtract(money2);
        System.out.println("Віднімання: " + money1 + " - " + money2 + " = " + resultSubtract);

        // Ділення на суму
        double resultDivide = money1.divide(money2);
        System.out.println("Ділення: " + money1 + " / " + money2 + " = " + resultDivide);

        // Ділення на число
        Money resultDivideByNumber = money1.divideByNumber(2);
        System.out.println("Ділення на число: " + money1 + " / 2= " + resultDivideByNumber);

        System.out.println();

        // Порівняння
        System.out.println("Порівняння:");
        System.out.println(money1 + " == " + money2 + " : " + money1.isEqual(money2));
        System.out.println(money1 + " > " + money2 + " : " + money1.isGreater(money2));
        System.out.println(money1 + " < " + money2 + " : " + money1.isLess(money2));
    }
}