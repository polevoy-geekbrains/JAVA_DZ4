
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
public class dz_04_02 {
    public static Deque<Object> fillList(){
        Deque<Object> list = new LinkedList<>();
        list.add("1991");
        list.add("1995");
        list.add("1998");
        list.add("2008");
        list.add("2014");
        list.add("2018");
        list.add("2020");
        list.add("2022");
        return list;
    }
    public static void printList(Deque<Object> list){
        for(Object el: list){
            System.out.printf(el + " ");
        }
        System.out.println();
    }
    public static void enqueue(Deque<Object> list){
        System.out.println("Введите элемент, который хотите добавить: ");
        Scanner sc1 = new Scanner(System.in);
        Object element = sc1.nextLine();
        list.addLast(element);
        
    }
    public static Object dequeue(Deque<Object> list){
        Object item = list.pollFirst();
        return item;
    }
    public static Object first(Deque<Object> list){
        return list.peekFirst();
    }
    public static void main(String[] args) {
        Deque<Object> que = new LinkedList<>();
        que = fillList();
        printList(que);
        System.out.println("""
             Введите номер операции:
        1 - поместить элемент в конец очереди;
        2 - вернуть первый элемент из очереди и удалить его;
        3 - вернуть первый элемент из очереди, не удаляя;
        4 - распечатать очередь
        5 - завершение работы
         """);
        
        while(true){
            Scanner sc = new Scanner(System.in);
            int cmd = sc.nextInt();
            if (cmd == 1){
                enqueue(que);
                printList(que);
                continue;
            }
            if (cmd == 2) {
                System.out.println("Первый элемент: " + dequeue(que)); 
                printList(que);
                continue;
            }
            if (cmd == 3){
                System.out.println("Первым элементом был: " + first(que)); 
                continue;
            }
            if (cmd == 4){
                printList(que); 
                continue;
            }
            if (cmd == 5) break;
            else {
                System.out.println("Для выхода из программы введите 4");
            }
            sc.close();
        }
               
    }
}