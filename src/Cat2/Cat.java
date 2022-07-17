package Cat2;

public class Cat {
    public String name;
    public String city;
    public int age;

    public Cat(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Cat:" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '\n';
    }
}
