package data;

public abstract class User {
    public String getName() {
        return name;
    }

    public Student getAge() {
        return age;
    }

    public int getPassport() {
        return passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    private String name;
    private int age;
    private int passport;

    public User(String name, int age, int passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public abstract void write(String path);

    public abstract void read(String path);


}
