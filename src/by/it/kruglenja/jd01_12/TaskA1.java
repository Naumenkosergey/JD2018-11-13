package by.it.kruglenja.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 08.12.2018.
 */
public class TaskA1 {
   private ArrayList<Integer> grades = new ArrayList<>();

    void clearBad(List<Integer> grades){
         Iterator<Integer> iterator = grades.iterator();
         while (iterator.hasNext()){
             int grade = iterator.next();
             if (grade<4){
                 iterator.remove();
             }
         }
         System.out.println(grades);
     }
    public static void main(String[] args) {
        TaskA1 taskA1 = new TaskA1();
        taskA1.grades.add((int) (Math.random() * 10 + 1));
        System.out.println(taskA1.grades);
        taskA1.clearBad(taskA1.grades);
    }
}
