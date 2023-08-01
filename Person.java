package DEV120_1_3_4_Tekiev;

import java.util.Collection;
import java.util.Objects;

public class Person {

    private String name;

    private Sex sex;

    private String nameOfDepartment;

    public Person(String name, Sex sex, String nameOfDepartment) {

        setName(name);
        setSex(sex);
        setNameOfDepartment(nameOfDepartment);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public static <T extends Person> void printAll (Collection<T> people) {


        for (T person: people) {

            System.out.println(person);

        }

    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", sex=" + sex +
                ", nameOfDepartment='" + nameOfDepartment + '\'';
    }


    enum Sex {
        M,
        F
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && sex == person.sex && Objects.equals(nameOfDepartment, person.nameOfDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, nameOfDepartment);
    }

}
