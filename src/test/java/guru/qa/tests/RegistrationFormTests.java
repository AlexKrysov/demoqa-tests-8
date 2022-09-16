package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

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
        $("#userNumber").setValue("1231231231");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("2005");
        $(".react-datepicker__day--028:not(.react-datepicker__day--outside-month)").click();
     //   $$(".react-datepicker__day--028")
     //           .filter(not(cssClass("react-datepicker__day--outside-month"))).first().click();
        $("#subjectsInput").setValue("Math").pressEnter();
        $("#hobbiesWrapper").$(new ByText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue("Qa guru street 7");
        $("#state").click();
        $("#stateCity-wrapper").$(new ByText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(new ByText("Delhi")).click();
        $("#submit").click();

        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Alex Egorov"),text("Alex@egorov.com"),text("28 July,2005"));







        $("#submit").click();














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
