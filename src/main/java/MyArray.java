import java.util.Arrays;
import java.util.Collections;
//Написать программу, которая:
//Заполняет массив случайными числами
//Находит среди массива максимальное число
//Находит среди массива минимальное число
//Находит среднее значение всех чисел
//Все числа вывести на консоль.

    public class MyArray {
        public static void main(String[] args) {
            Integer [] arra= {1,2,3,5,6,19,8,9,10,13};
            System.out.println(Arrays.toString(arra));
            int min = Collections.min(Arrays.asList(arra));
            int max= Collections.max(Arrays.asList(arra));
            System.out.println(min);
            System.out.println(max);
            double averagevalue=0;


for(int i: arra) { averagevalue += i ;   }

            System.out.println( "Среднее значение "+averagevalue/arra.length); }
    }
