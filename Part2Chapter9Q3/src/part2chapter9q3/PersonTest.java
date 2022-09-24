package part2chapter9q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class PersonTest {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Person p1 = new Person("Elifnur", "Dönmez", new ArrayList<>(Arrays.asList("adres1")), new ArrayList<>(Arrays.asList("telefon1")));
        Person p2 = new Person("Nazire", "Yuksel", new ArrayList<>(Arrays.asList("adres2")), new ArrayList<>(Arrays.asList("telefon2")));
        Person p3 = new Person("Demir", "Mervan", new ArrayList<>(Arrays.asList("adres3")), new ArrayList<>(Arrays.asList("telefon3")));
        Person p4 = new Person("Meltem", "Ansal", new ArrayList<>(Arrays.asList("adres4")), new ArrayList<>(Arrays.asList("telefon4")));

        personList.add(p4);
        personList.add(p2);
        personList.add(p3);
        personList.add(p2);
        personList.add(p3);
        personList.add(p1);

        System.out.println("\n --- List People --- \n");
        personList.listPerson();
        System.out.println("\n --- Sort By Surname --- \n");
        printTreeSet(personList.sortBySurname());
        System.out.println("\n --- Search 'el' --- \n");
        printTreeSet(personList.search("z"));
    }

    private static void printTreeSet(TreeSet<Person> people) {
        Iterator iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = (Person) iterator.next();
            System.out.println(person.toString());
        }
    }
}