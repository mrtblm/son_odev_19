package org.test.tests;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

import com.codeborne.selenide.*;
import com.codeborne.selenide.selector.ByText;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.test.pages.AddPage;
import org.test.pages.ButtonPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.*;

@Epic("Login Tests Epic")
@Feature("Login Features")

public class ButtonTest extends BaseTest {
    ButtonPage button=new ButtonPage();

    AddPage addPage=new AddPage();


    @Test(priority = 1)
    @Description("Geçerli butona tıklayınız")
    @Severity(SeverityLevel.CRITICAL)
    @Story("İlgili butona tıklama işlemini yapar")
    public void buttonsTest() {

        //1.Adım
        button.open();
        button.getStartedBtn().click();
        button.clickMeBtn().click();
        sleep(500);
        button.clickMessageText().getText();
        sleep(500);
        assertThat(button.clickMessageText().isDisplayed()).isTrue();
        System.out.println("Okunan Metin: " + button.clickMessageText().getText());

    }

    @Test (priority = 2)
    @Description("Yeni bir kullanıcı ekleyiniz")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Yeni bir kullanıcı ekleme işlemi yapar ve günceller")
    public void addTest() {

        //2.Adım
        addPage.addOpen();
        addPage.addBtn().click();
        sleep(500);
        addPage.firstNameTxt();
        addPage.lastNameTxt();
        addPage.userEmail();
        addPage.age();
        addPage.salary();
        addPage.department();
        addPage.addClick().click();
        sleep(500);
        System.out.println("Kayıt İşlemi Tamam");
        sleep(500);
        addPage.editBtn().click();
        addPage.editUserEmail();
        addPage.editSalary();
        addPage.addClick().click();
        sleep(500);
        System.out.println("Güncelleme İşlemi Tamam");
        addPage.addClick().shouldBe(visible);
        sleep(500);
        assertThat(addPage.editBtn().isDisplayed()).isTrue();

    }

}
