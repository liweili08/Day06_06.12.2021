
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
@Test
    void TestName(){
    Student testStudent = new Student();
    testStudent.setName("Anna");
    assertEquals("Anna", testStudent.getName());
}
    @Test
    void TestAge(){
        Student testStudent = new Student();
        testStudent.setAge(21);

        assertEquals(21, testStudent.getAge());
    }@Test
    void TestMale(){
        Student testStudent = new Student();
        testStudent.setMale(false);
        assertFalse(testStudent.getMale());
    }


}
