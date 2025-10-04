import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Видалено: " + stack.pop());
        stack.printStack();

        int searchValue = 20;
        int pos = stack.search(searchValue);
        if (pos != -1) {
            System.out.println("Елемент " + searchValue + " знайдено на позиції: " + pos);
        } else {
            System.out.println("Елемент " + searchValue + " не знайдено.");
        }

        sc.close();
    }
}