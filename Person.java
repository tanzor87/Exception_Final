import java.util.Date;

public class Person {
    String lastName;
    String firstName;
    String patronymic;
    String birthDate;
    Integer phoneNumber;
    Character sex;


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
