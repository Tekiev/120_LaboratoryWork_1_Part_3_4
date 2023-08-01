package DEV120_1_3_4_Tekiev;

import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Collection<Person> people = new HashSet<>();

        people.add(new Person("Ivan", Person.Sex.M, "Computer science"));

        people.add(new Person("Anna", Person.Sex.F, "World economy"));

        Student.addToCollection(people, new Person("Andrey", Person.Sex.M, "Computer science"));

        Person.printAll(people);

        System.out.println();

        Collection <Student> students = new HashSet<>();

        students.add(new Student("Leo Wilkinson", Person.Sex.M, "Computer science", Student.Bolon.Bachelor, 3));

        students.add(new Student("Anna Cunningham", Person.Sex.F, "World economy", Student.Bolon.Bachelor, 1));

        Student.addToCollection(students, new Student("Jill Lundqvist", Person.Sex.F, "Jurisprudence", Student.Bolon.Master, 1));

        Student.addToCollection(students, new Student("Ronald Correra", Person.Sex.M, "Computer science", "Design of a functional programming language"));

        Person.printAll(students);

    }

}
