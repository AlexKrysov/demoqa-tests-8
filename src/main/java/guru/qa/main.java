package guru.qa;

public class main {

    // целые числа
    byte byteVar;
    short aShort;
    int anInt = 1;
    long aLong;

    //числа с плаввющей точкой
    double aDouble = 1.23;
    float aFloat;

    //логический тип
    boolean aBoolean = true;

    //символ
    char aChar = 'c';

    public static void main(String[] args) {


        Kulak Kulak = new Kulak();
        Kulak.born();
        Kulak anotherKulak = new Kulak();
        anotherKulak.name = "Борис";

        Human.country = "England";

        Kulak.name = "иван";
        Kulak.age = 31;
        anotherKulak.age = 40;

        System.out.println(Kulak.name);
        System.out.println(anotherKulak.name);
        System.out.println(Kulak.age);
        System.out.println(anotherKulak.age);
        Kulak.noFart();
        anotherKulak.noFart();
        Kulak.sayCountry();
        anotherKulak.sayCountry();

        Kulak.getAge();

    }

}
