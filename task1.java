import java.util.Scanner;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

public class task1 {
    public static void main(String[] args) {
        try {
            System.out.println("Вещественное число: ");
            System.out.println("Вы ввели: " + inputNum());
        } catch (Exception ex) {
            System.out.println("Только вещественное число. Введите еще раз: ");
            System.out.println("Вы ввели: " + inputNum());
        }
    }

    public static float inputNum() {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }

}