import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideGithubTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
    }

        @Test
        void jUnit5ShouldBeIntoSoftAssertions() {
            open("/selenide/selenide");
            $("[data-tab-item=i5wiki-tab]").click();
            $(".js-wiki-more-pages-link").click();
            $(".wiki-more-pages [href='/selenide/selenide/wiki/SoftAssertions']").shouldHave(text("SoftAssertions"));
            $(".wiki-more-pages [href='/selenide/selenide/wiki/SoftAssertions']").click();
            $$(".heading-element").filterBy(text("Junit5")).shouldHave((sizeGreaterThan(0)));
        }
}
