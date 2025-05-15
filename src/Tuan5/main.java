package Tuan5;

public class main {
    // main cua Person.java- tuan5
    public static void main(String[] args) {
        Person newPerson = new Person(null, 0);

        Person[] persons = { new Person("Nguyen Thanh Nam", 2004),
                new Person("Tran Duc Anh", 2003),
                new Person("Bui Tan Phat", 2004),
                new Person("Pham Kim Chung", 2004),
                new Person("Mai Hoang Phuc", 2004),
                new Person("Ngo Si Hoang Quy", 2004),
                new Person("Nguyen Duy Kien", 2004),
                new Person("Nguyen Phat Dai", 2003) };
        // kieudulieu[] tenkieudulieu = new tenkieudulieu[soluongphantu]

        // in ra cac phan tu trong mang
        // for (Person person : persons) {
        // System.out.println("Name : " + person.getFullname() + " is " +
        // person.calculateAge() + " years old.");
        // }
        int totalAge = newPerson.totalAge(persons);
        System.out.println("Total age : " + totalAge);

    }

}
