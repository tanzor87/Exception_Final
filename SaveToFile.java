import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
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
