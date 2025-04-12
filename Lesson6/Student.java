package G.Lesson6;

public class Student {
    private int id;
    private String name;
    private String major;
    private int age;


    public Student(){}

    public Student(int id, String name, String major, int age){
        this.name=name;
        this.major=major;
        this.age=age;
        this.id=id;
    }

    public String displayInfo(){
        String student = "Студент: " + id + ": \n" +
                "Имя: " + name + ", \n" +
                "Специальность: " + major + ", \n" +
                "Возраст: " + age + " \n";
        return student;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }


}
