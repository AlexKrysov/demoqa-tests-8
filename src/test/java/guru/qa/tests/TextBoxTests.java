package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormTest() {
        String permanentAddress = "another street 2";

        open("https://demoqa.com/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("alex@qaguru.com");
        $("#currentAddress").setValue("some street 1");
        $("#permanentAddress").setValue("another street 2");
        $("#submit").click();

        $("#output #name ").shouldHave(text("Alex"));
        $("#output #email ").shouldHave(text("alex@qaguru.com"));
        $("#output #currentAddress").shouldHave(text("some street 1"));
        $("#output #permanentAddress").shouldHave(text(permanentAddress));
    }
}
