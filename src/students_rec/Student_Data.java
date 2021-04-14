package students_rec;

/**
 *
 * @author MEGAMAN
 */
public class Student_Data {

    private String name;
    private String age;
    private String phone;
    private String level;
    private String gender;

    public Student_Data(String name, String age, String phone, String level, String gender) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.level = level;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return name + "\t" + age + "\t" + phone + "\t" + level + "\t" + gender;
    }

}
