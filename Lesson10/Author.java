package G.Lesson10;

public class Author {
    private String name;
    private String lastName;
    private String speciality;

    public Author(){}
    public Author(String name, String lastName, String speciality){
        this.name=name;
        this.lastName=lastName;
        this.speciality=speciality;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
