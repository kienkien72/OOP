package Tuan5;

import java.time.Year;

//static tronmg ham dung để báo rằng hàm đó thuộc về class
//không thuộc về object ta tạo ra
public class Person {// ten class

    String fullNamePerson;/// (1)
    int agePerson;// (2)

    public Person(String fullNamePerson, int agePerson) {
        this.fullNamePerson = fullNamePerson;// thuoc tinh cuar class(1)
        this.agePerson = agePerson;// thuộc tính của class (2)
    }

    public String getFullname() {
        return fullNamePerson;
    }

    public int calculateAge() {
        int currentYear = Year.now().getValue();
        return currentYear - agePerson;
    }

    public int totalAge(Person[] persons) {
        int sum = 0;
        for (Person person : persons) {
            sum += person.calculateAge();
        }
        return sum;
    }

}