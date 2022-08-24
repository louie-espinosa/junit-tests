package students;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {

    private Student stud1; //Declare!!!
    private Student stud2;
    private Student stud3;


    @Before
     public void setup() {
        stud1 = new Student("Buck", 1);
        stud2 = new Student("Shady", 2);
        stud3 = new Student("Greg", 3);

        //docrob added multiple grades for all students, except for his "new student" object.

    }

    @Test
    public void addNameAndID() {

        assertEquals("Buck", stud1.getName());
        assertEquals(2, stud2.getId());

    }
    @Test
    public void addGrade() {
        //ArrayList<Integer> expected = new ArrayList<>(); Import the library and use in the assertEquals, HAHAHA!!!
        stud3.addGrade(75);
        stud3.addGrade(80);
        stud3.addGrade(90);

        assertEquals(3, stud3.getGrades().size());
       // assertTrue(stud3.getGrades().contains(Lists.newArrayList(75, 80, 90)));
        //assertSame(stud3.getGrades().)
        assertEquals(Lists.newArrayList(75, 80, 90), stud3.getGrades());
    }


    @Test
    public void doubleGradeAverage() {
        stud1.addGrade(78);
        stud1.addGrade(80);
        stud1.addGrade(88);
        double expectedAverage = 82.0;

        assertEquals(expectedAverage, stud1.getGradeAverage(), .1);
    }



}
