package HomeWorkApp;

public class Main {
    public static void main(String[] args) {
        //     System.out.println("Hello world!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        //������� �� ���������
        drawSquare();

    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = 4;
        int b = 2;
        int result = a + b;
        if (result > 0) {
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }

    private static void printColor() {
        int value = -1;
        if (value <= 0) {
            System.out.println("�������");
        } else if (0 <= value && value <= 100) {
            System.out.println("������");
        } else if (100 <= value) {
            System.out.println("�������");
        }
    }

    private static void compareNumbers() {
        int a = 5;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.printf("a < b");
        }
    }

    // ������� �� ���������
    private static void drawSquare() {
        System.out.println("""
                �������
                �������
                �������
                """);
    }
}
