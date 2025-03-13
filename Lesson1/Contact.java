package GPT.Lesson1;

public class Contact {
    private String first_name;
    private String last_name;
    private String email;
    private int phone_number;

    public Contact(String first_name, String last_name, String email, int phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Имя ='" + first_name + '\'' +
                ", Фамилия ='" + last_name + '\'' +
                ", email ='" + email + '\'' +
                ", Номер =" + phone_number +
                '}';
    }
}
