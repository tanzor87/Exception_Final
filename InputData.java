import exceptions.BirthDateException;
import exceptions.LengthExceptions;
import exceptions.SexException;
import exceptions.StringToIntException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Класс ввода и обработки данных
 */
public class InputData {
    /**
     * Метод получает на вход пользовательские данные в виде строки и обрабатывает исключения если они возникли
     * @param data - данные о пользователе тип String в формате "Фамилия Имя Отчество дата _ рождения номер _ телефона пол"
     * @return тип данных Person
     * @throws LengthExceptions - Исключение корректности длинны вводимых данных
     * @throws BirthDateException - Исключение корректности введенной даты рождения
     * @throws StringToIntException - Исключение корректности введенного номера телефона
     * @throws SexException - Исключение корректности введенного значения пола
     */
    public static Person inputData(String data) throws LengthExceptions, BirthDateException, StringToIntException, SexException {
        String[] dataList = data.split(" ");
        if (dataList.length != 6) {
            throw new LengthExceptions("Некорректное количество введенных данных", dataList.length);
        }

        try {
            LocalDate.parse(dataList[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }
        catch (Exception e){
            throw new BirthDateException("Неверный формат даты рождения. Ожидается формат dd.MM.yyyy (день.месяц.год)",
                    dataList[3]);
        }

        try {
            Integer.parseInt(dataList[4]);
        }
        catch (Exception e){
            throw new StringToIntException("Неверный формат телефона. Ожидается целое беззнаковое число без форматирования.");
        }

        if (!dataList[5].equals("m") && !dataList[5].equals("f")){
            throw new SexException("Неверный формат пола. Ожидается символ 'f' или 'm'", dataList[5]);
        }

        Person person = new Person(
                dataList[0],
                dataList[1],
                dataList[2],
                dataList[3],
                Integer.parseInt(dataList[4]),
                dataList[5].charAt(0));

        return person;
    }
}
