import exceptions.BirthDateException;
import exceptions.LengthExceptions;
import exceptions.SexException;
import exceptions.StringToIntException;

import java.util.Scanner;

/**
 * Точка входа выполнения программы
 */
public class Program {
    public static void main(String[] args) {
//        String personData = "Иванов Иван Иванович 24.05.1978 1234567 m";
//        String personData = "Сидоров Иван Иванович 24.05.1978 1234567 m";
//        String personData = "Иванов Иван Иванович 24.05.1978 1234567";
//        String personData = "Иванов Иван Данилович 24_05.1978 1234567 f";
//        String personData = "Иванов Иван Иванович 24.05.1978 1234567a f";
//        String personData = "Иванов Иван Иванович 24.05.1978 1234567 a";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
        String personData = scanner.nextLine();

        try{
            Person person = InputData.inputData(personData);
            System.out.println(person);
            SaveToFile.saveToFile(person);
        }
        catch (LengthExceptions e){
            System.out.printf("%s, требовалось ввести 6 полей, а введено %d\n", e.getMessage(), e.getLen());
        }
        catch (BirthDateException e){
            System.out.printf("%s, введены данные %s\n", e.getMessage(), e.getDate());
        }
        catch (StringToIntException e){
            System.out.println(e.getMessage());
        }
        catch (SexException e){
            System.out.printf("%s, введен %s", e.getMessage(), e.getSex());
        }
    }
}
