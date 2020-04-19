import java.sql.SQLOutput;
import java.util.Scanner;

public class Number_N {


    //Написать программу, которая:
    //Считывает с консоли число n
    //В пределах от 1 до n находит все простые числа
    //	Все числа вывести на консоль.
    public static void main(String[] args) {
        System.out.println("Введите число в консоль: ");
         Scanner in= new Scanner(System.in);
         int n= in.nextInt();
        System.out.println("Число введенное в консоль  "+ n);
        System.out.println("В пределах от 1 до "+n+ " находятся следующие простые числа: ");
        for (int i=1; i<n; i++){
          if(!(i%2==0)) {
              System.out.println(i);}
            }



}}
