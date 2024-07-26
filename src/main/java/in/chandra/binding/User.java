package in.chandra.binding;

public class User {
    private  Integer id;
    private String name;
    private String gender;
    private Long Phno;

    public  User(){

    }

    public User(Integer id, String name, Long phno, String gender) {
        this.id = id;
        this.name = name;
        Phno = phno;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getPhno() {
        return Phno;
    }

    public void setPhno(Long phno) {
        Phno = phno;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", Phno=" + Phno +
                '}';
    }
}
