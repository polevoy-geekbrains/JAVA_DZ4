// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;
import java.util.ListIterator;
  
public class dz_04_01 {
    public static void main(String[] args)
    {
  
        LinkedList<String> difficultYears = new LinkedList<>();
          
        difficultYears.add("1991");
        difficultYears.add("1995");
        difficultYears.add("1998");
        difficultYears.add("2008");
        difficultYears.add("2014");
        difficultYears.add("2018");
        difficultYears.add("2020");
        difficultYears.add("2022");

             
        String str = String.join(" ", difficultYears); //Для красоты записи переводим очередь в строку
        System.out.println(str);
        
        
        ListIterator<String> listIterator = difficultYears.listIterator(difficultYears.size());
        
        while (listIterator.hasPrevious())
        {
            System.out.print(listIterator.previous() + " "); //Выводим очередь на печать в обратном порядке
        }
        
    }

}