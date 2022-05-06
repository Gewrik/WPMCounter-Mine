
import java.time.LocalTime;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class WPMProgramm {
  //Создаём список слов для теста
  static String [] words = {"neck", "gate", "calendar", "tan", "ham", "cat", "suck", "hat", "frog"};
 
  public static void main(String[] args) throws InterruptedException { 
    //Печатаем 3 2 1  
    System.out.println("3");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("2");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("1");
    TimeUnit.SECONDS.sleep(1);
    
    //Создаем экземпляр класса Random
    Random rand = new Random();
    //Цикл для вызывания принта 10 раз
    String randWords = "";
    for (int i = 0; i < 10; i++) { 
    //Вывод рандомного слова из списка слов "words"
      String temp = words[rand.nextInt(9)]  + " " ;
      randWords += temp;
      System.out.print(temp);
    }
                          System.out.println();
    //Получаем количество секунд прошедшее с 1970
                      double start = LocalTime.now().toNanoOfDay();
    Scanner scan = new Scanner (System.in);
    String typedWords = scan.nextLine();
    if (!(typedWords + " ").equals(randWords)) 
    {
       System.out.println("Вы неправильно написали слова");
       scan.close();
       return;
    }
    //Получаем количество секунд прошедшее с 1970 до момента нажатия Enter
                      double end = LocalTime.now().toNanoOfDay();
                      double finishTime = end - start;
                      double seconds = finishTime/1000000000.0;
    // (x characters/4) / 1 min =y Wpm
    int numChars = typedWords.length();
    int wpm = (int) ((((double) numChars/4)/seconds)*60);
      
    System.out.println(wpm);
    scan.close(); //Closing the scanner
   
  } 
}
