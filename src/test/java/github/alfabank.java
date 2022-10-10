package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class alfabank {


    @Test
    void testAlfa(){

        open("https://alfabank.ru/");
        $(byText("Вклады")).click();
        $("body").shouldHave(text("Накопительные продукты"));
        $("data-widget-name=Link").click();

    }
}
