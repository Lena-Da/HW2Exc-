import java.util.Scanner;

/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи строку: ");
        String input = sc.nextLine();
        if (input.isEmpty()){
            throw new RuntimeException("Пустая строка ");
        } else {
            System.out.println("Вы ввели " + input);
        }
    }
}
