package students_rec;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author MEGAMAN
 */
public class Student_CRUD {
//    Student_Data data = new Student_Data("akram","23","770770072","3", "Male");

    LinkedList<Student_Data> stuData = new LinkedList<>();

    void addNew(String name, String age, String phone, String level, String gender) {
        Student_Data newStudent = new Student_Data(name, age, phone, level, gender);
        stuData.add(newStudent);
    }

    void delete(int index) {
        stuData.remove(index);
    }

    void update(int index, String name, String age, String phone, String level, String gender) {
        Student_Data updatedStudent = new Student_Data(name, age, phone, level, gender);
        stuData.remove(index);
        stuData.add(index, updatedStudent);
    }

    void displayAll_To_Console() {

        System.out.println(stuData.toString());
    }

}
