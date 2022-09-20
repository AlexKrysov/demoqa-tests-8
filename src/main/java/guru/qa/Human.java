package guru.qa;
//суперкласс
public class Human {



    static String country = "СССР";

    String name;
    int age;

    int getAge() {
        return age;
    }

    void born() {
        System.out.println("Я родился");
    }

    void sayCountry() {
        System.out.println(country);
    }
}
