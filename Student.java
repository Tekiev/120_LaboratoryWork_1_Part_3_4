package DEV120_1_3_4_Tekiev;

import java.util.Collection;
import java.util.Objects;

public class Student extends Person {


    private Bolon bolon;

    private int numberOfCourse;

    private String themeOfDissertation;

    public Student(String nameOfPerson, Sex sex, String nameOfDepartment, Bolon bolon, int numberOfCourse) {
        super(nameOfPerson, sex, nameOfDepartment);
        setBolon(bolon);
        setNumberOfCourse(numberOfCourse);
    }

    public Student(String nameOfPerson, Sex sex, String nameOfDepartment, String themeOfDissertation) {
        super(nameOfPerson, sex, nameOfDepartment);
        setThemeOfDissertation(themeOfDissertation);
    }

    public Bolon getBolon() {
        return bolon;
    }

    public void setBolon(Bolon bolon) {
        this.bolon = bolon;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public String getThemeOfDissertation() {
        return themeOfDissertation;
    }

    public void setThemeOfDissertation(String themeOfDissertation) {
        this.themeOfDissertation = themeOfDissertation;
    }

    public void print() {

        String pronoun = getSex() == Person.Sex.M ? "He": "She";

        String pronoun2 = getSex() == Person.Sex.M ? "His": "Her";

        System.out.println("This is " + getName() + ". " + pronoun + " studies at " + getNameOfDepartment() + "\n" +  ((getBolon() != null) ?  pronoun +

                " is " + getNumberOfCourse() + "'th year " + getBolon() + " student." : pronoun2 + " thesis title is " + getThemeOfDissertation()) + "\n");

    }

    public static <T extends Person> void addToCollection (Collection<T> people, T person) {


        people.add(person);


    }

    enum Bolon {
        Bachelor,
        Master
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return numberOfCourse == student.numberOfCourse && bolon == student.bolon && Objects.equals(themeOfDissertation, student.themeOfDissertation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bolon, numberOfCourse, themeOfDissertation);
    }

}
