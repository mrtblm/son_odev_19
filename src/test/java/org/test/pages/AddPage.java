package org.test.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddPage {
    String firstname="Murat";
    String lastname="Bilim";
    String useremail="bilim.murat@gmail.com";
    Integer age=36;
    Integer salary=35000;
    String department="IT Uzmanı";
    String edituseremail="muratbilim@msn.com";
    Integer editsalary=40000;


    public String userEmailText(){

        return "muratbilim@msn.com";
    }
    String actualText;
    public AddPage addOpen() {
        Selenide.open("https://demoqa.com/webtables");
        return this;
    }
    public SelenideElement addBtn() {
        return  $(By.id("addNewRecordButton"));
    }
        public SelenideElement firstNameTxt() { return  $("#firstName").setValue(firstname); }
        public SelenideElement lastNameTxt() { return $("#lastName").setValue(lastname); }
        public SelenideElement userEmail() { return  $("#userEmail").setValue(useremail); }
        public SelenideElement age() { return  $("#age").setValue(String.valueOf(age)); }
        public SelenideElement salary() { return  $("#salary").setValue(String.valueOf(salary)); }
        public SelenideElement department() { return  $("#department").setValue(department);}
        public SelenideElement addClick() { return  $("#submit"); }

        public SelenideElement editBtn() { return   $("#edit-record-4");  }
        public SelenideElement editUserEmail() { return  $("#userEmail").setValue(edituseremail); }
        public SelenideElement editSalary() { return $("#salary").setValue(String.valueOf(editsalary)); }
         public SelenideElement firstNameC() { return $(new ByText("First Name"));
    }


}


