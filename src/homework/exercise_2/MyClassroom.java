package homework.exercise_2;

/**
 * Задача 2
 * Создать класс для описания студента нашей группы.
 * Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
 * Создать объекты этого класса для каждого из студента нашей группы.
 * Поместить все эти обеъекты в массив.
 * Пройти по массиву циклом for-each и вывести информацию на консоль.
 */
public class MyClassroom {
    String firstname;
    String lastname;
    String passportID;
    String groupName;

    public MyClassroom (String firstname1, String lastname1, String passportID1, String groupName1){
        firstname = firstname1;
        lastname = lastname1;
        passportID = passportID1;
        groupName = groupName1;
    }
}
