import java.util.*;

/**
 * Student is the class that contains all the parameters that are specific to one student.
 * name is the name of the student.
 * age is the age of the student.
 * gender is the gender of the student.
 * year is what year the student is in.
 *  major is the major the student is studying.
 * gpa is the student's gpa
 * roommatePreferences is a prefernce list of who the student wants to be roommates with.
 * previousInternships is a list of all the previous internships the student has held.
 */

public abstract class Student {
    protected String name;
    protected int age;
    protected String gender;
    protected int year;
    protected String major;
    protected double gpa;
    protected List<String> roommatePreferences;
    protected List<String> previousInternships;

    /**
     *
     * @param other is another student that we used to calculate the connection strength between the current student and other.
     * @return an integer with the value of the connection strength between the current student and other.
     */
    public abstract int calculateConnectionStrength(Student other);
}
