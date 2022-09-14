package guru.qa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("alex@qaguru.com");
        $("#currentAddress").setValue("some street 1");
        $("#permanentAddress").setValue("another street 2");
        $("#submit").click();
    }
}
