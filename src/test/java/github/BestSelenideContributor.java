package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class BestSelenideContributor {

    @Test
    void AndreiSolntsevShouldBeTheBestContributor(){
        open("https://github.com/selenide/selenide");
        $(".BorderGrid").$(byText("Contributors"))
                .closest("div").$("ul li").hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));
        sleep(5000);
    }
}
