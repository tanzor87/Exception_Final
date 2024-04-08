import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс сохранения типа данных Person в файл
 */
public class SaveToFile {
    /**
     * Метод сохраняет тип данных Person в файл .txt.
     * Новая фамилия, новый файл
     * Однофамильцы записаться в один и тот же файл, в отдельные строки.
     * @param person - на вход подается тип данных Person
     */
    public static void saveToFile(Person person){
        String fileName = person.getLastName();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt", true))){
            writer.write(
                    person.getLastName()+ " " +
                            person.getFirstName() + " " +
                            person.getPatronymic() + " " +
                            person.getBirthDate() + " " +
                            person.getPhoneNumber() + " " +
                            person.getSex() + "\n"
            );
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
