package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
//        String permanentAddress = "another street 2";

        open("/automation-practice-form");
        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Egorov");
        $("#userEmail").setValue("Alex@egorov.com");
 //       $("#gender-radio-3").click();
        $("#genterWrapper").$(new ByText("Other")).click();





















//       $("#userName").setValue("Alex");
//        $("#userEmail").setValue("alex@qaguru.com");
 //       $("#currentAddress").setValue("some street 1");
//        $("#permanentAddress").setValue("another street 2");
//        $("#submit").click();
//
//        $("#output #name ").shouldHave(text("Alex"));
//        $("#output #email ").shouldHave(text("alex@qaguru.com"));
//       $("#output #currentAddress").shouldHave(text("some street 1"));
 //       $("#output #permanentAddress").shouldHave(text(permanentAddress));
    }
}
