import java.util.*;
//Написать программу, которая:
//Заполняет массив случайными числами
//Сортирует массив в порядке возрастания
//Сортирует массив в порядке убывания
//	Все массивы вывести на консоль.

public class RandomNumbersCompare {
    public static void main(String[] args) {


        Random rand = new Random();

        int[] ar = new int[10];
        for (int i = 0; i < 10; i++) {

            ar[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(ar));

        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        Collections.reverse(Arrays.asList(ar));
        System.out.println(Arrays.toString(ar));

//         reverse(ar);


    }
//static  void reverse (int a[]){
//        Collections.reverse(Arrays.asList(a));
//    System.out.println(Arrays.asList(a));
//}
}

