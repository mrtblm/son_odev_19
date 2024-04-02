package org.test.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class ButtonPage {

    public String text(){

        return "You have done a dynamic click";
    }
    public ButtonPage open() {
        Selenide.open("https://demoqa.com/elements");
        return this;
    }

    public SelenideElement getStartedBtn() {
        return $(new ByText("Buttons"));
    }

    public SelenideElement clickMeBtn() {
        return $(new ByText("Click Me"));
    }

    public SelenideElement clickMessageText() {
        return $(By.id("dynamicClickMessage"));
    }



    public void assertUrl(String expectedUrl) {
        String url = WebDriverRunner.url();
        assertEquals(url, expectedUrl);

}
}
