
import model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
@Test
    void TestName(){
    Student testStudent = new Student("Anna", 21, false);
    //testStudent.setName("Anna");
    assertEquals("Anna", testStudent.getName());
}
    @Test
    void TestAge(){
        Student testStudent = new Student("Anna", 21, false);
        //testStudent.setAge(21);
        assertEquals(21, testStudent.getAge());
    }
//    @Test
//    void TestMale(){
//        model.Student testStudent = new model.Student();
//        testStudent.setMale(false);
//        assertFalse(testStudent.getMale());
//    }
//    @Test
//    void TestMale(){
//        model.Student testStudent = new model.Student();
//        testStudent.setMale(false);
//        assertEquals(false,testStudent.getMale());
//    }
    @Test
    void TestMale(){
        Student testStudent = new Student("Anna", 21, false);
        //testStudent.setMale(false);
        assertEquals(false,testStudent.isMale());
    }

    @Test
    void TestEquals(){
        Student testStudent1 = new Student("Anna", 21, false);
        Student testStudent2 = new Student("Anne", 21, false);
        //testStudent.setMale(false);
        assertEquals(false, testStudent1.equals(testStudent2));
    }

}
