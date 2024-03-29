package org.test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.*;
import com.codeborne.selenide.selector.ByText;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class ButtonTest {

    @Test
    public void buttonsTest() {

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;

        //1.Adım

        open("https://demoqa.com/elements");
        $(new ByText("Buttons")).click();
        $(new ByText("Click Me")).click();
        sleep(1000);
        SelenideElement metin;
        metin = $(By.id("dynamicClickMessage"));
        metin.getText();
        System.out.println("Okunan Metin: " + metin.getText());
        sleep(500);
        String metinIcerik ="You have done a dynamic click";
        Assertions.assertThat(metinIcerik).isEqualTo(metin.getText());
        sleep(500);
    }

    @Test
            public void addTest() {
        //2.Adım
        open("https://demoqa.com/webtables");
        $(By.id("addNewRecordButton")).click();
        $("#firstName").setValue("Murat");
        $("#lastName").setValue("Bilim");
        $("#userEmail").setValue("bilim.murat@gmail.com");
        $("#age").setValue("36");
        $("#salary").setValue("35000");
        $("#department").setValue("IT Uzmanı");
        $("#submit").click();
        System.out.println("Yeni kayıt işlemi tamam");
        sleep(500);
        $("#edit-record-4").click();
        $("#department").setValue("Web Developer");
        $("#salary").setValue("40000");
        $("#submit").click();
        sleep(500);
        System.out.println("Yeni kayıt güncelleme işlemi tamam");
    }

}
