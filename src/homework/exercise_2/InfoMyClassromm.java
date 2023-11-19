package homework.exercise_2;

/**
 * Задача 2
 * Создать класс для описания студента нашей группы.
 * Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
 * Создать объекты этого класса для каждого из студента нашей группы.
 * Поместить все эти обеъекты в массив.
 * Пройти по массиву циклом for-each и вывести информацию на консоль.
 */
public class InfoMyClassromm {
    public static void main(String[] args) {
        MyClassroom person1 = new MyClassroom("Andrey", "Divin", "AB5657987BB7", "c26");
        MyClassroom person2 = new MyClassroom("Olya", "Neronena", "AB4386557BB1", "c26");
        MyClassroom person3 = new MyClassroom("Vyasya", "Kolivik", "AB6557977BB4", "c26");
        MyClassroom person4 = new MyClassroom("Anton", "Terin", "AB1257946BB8", "c26");

        String[][] groupBase= {{person1.firstname, person1.lastname, person1.passportID, person1.groupName},{person2.firstname, person2.lastname, person2.passportID, person2.groupName},{person3.firstname, person3.lastname, person3.passportID, person3.groupName},{person4.firstname, person4.lastname, person4.passportID, person4.groupName}};

        for (String[] p1: groupBase) {
            System.out.println(" ");
            for (String p2: p1){
                System.out.print(p2 + " ");
            }
        }
    }
}
