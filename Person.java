import java.util.Date;

/**
 * Класс создает тип данных Person
 */
public class Person {
    String lastName;
    String firstName;
    String patronymic;
    String birthDate;
    Integer phoneNumber;
    Character sex;

    /**
     * Конструктор класса. Здесь задаются следующие параметры класса:
     * @param lastName - Фамилия
     * @param firstName - Имя
     * @param patronymic - Отчество
     * @param birthDate - дата рождения
     * @param phoneNumber - номер телефона
     * @param sex - пол
     */
    public Person(String lastName,
                  String firstName,
                  String patronymic,
                  String birthDate,
                  Integer phoneNumber,
                  Character sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public Character getSex() {
        return sex;
    }


    @Override
    public String toString() {
        return lastName + " " +
                firstName + " " +
                patronymic + " " +
                birthDate + " " +
                phoneNumber + " " +
                sex;
    }
}
