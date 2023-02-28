import java.util.Scanner;
import java.util.Stack;

public class dz_04_03 {
                                                              
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Stack<Float> result = new Stack<>();
        System.out.println("""
                Введите первое число, действие (+,-,* или /), и второе число
                Команды вводятся поочередно, каждая в новой строке.
                "c" - отмена последней операции.
                "q" - завершение работы калькулятора.
                """);
        while (true) {
            if (iScanner.hasNextFloat()) {
                result.add(iScanner.nextFloat());
            } else {
                    String action = iScanner.next();
                    if (action.equalsIgnoreCase("q")) {
                        break;
                    }
                    if (action.equalsIgnoreCase("c")) {
                        result.remove(0);
                        System.out.println("Отмена");
                        System.out.println(result.firstElement());
                    }
                    if (iScanner.hasNextFloat()) {
                        result.add(iScanner.nextFloat());
                        float x = result.firstElement();
                        float y = result.pop();
                        switch (action) {
                            case "+" -> {
                                result.add(0, x + y);
                                System.out.printf("Ответ\n%.2f\n", result.firstElement());
                            }
                            case "-" -> {
                                result.add(0, x - y);
                                System.out.printf("Ответ\n%.2f\n", result.firstElement());
                            }
                            case "*" -> {
                                result.add(0, x * y);
                                System.out.printf("Ответ\n%.2f\n", result.firstElement());
                            }
                            case "/" -> {
                                result.add(0, x / y);
                                System.out.printf("Ответ\n%.2f\n", result.firstElement());
                            }
                        }
                    }
                }
            }
        iScanner.close();
        }
    }