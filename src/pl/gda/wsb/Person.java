package pl.gda.wsb;

import java.time.LocalDate;
import java.time.Duration;

public class Person {
    private String name;
    private String surname;
    private String dateOfBirth;

    public Person(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getDateOfBirth() { return dateOfBirth; }

    public void howManyYears() {
        LocalDate birthday = LocalDate.parse(dateOfBirth);
        LocalDate today = LocalDate.now();
        long age = Duration.between(birthday.atStartOfDay(),today.atStartOfDay()).toDays()/365;
        System.out.println(getSurname() + " is " + age + " years old.");
    }

    public String toString() {
        return "Name and surname: " + name + " " + surname + ", date of birth: " + dateOfBirth;
    }
}
