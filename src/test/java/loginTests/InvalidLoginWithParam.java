package loginTests;

import javafx.print.Collation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.LoginPage;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)

public class InvalidLoginWithParam extends ParentTest{
    String login, pass;

    public InvalidLoginWithParam(String browser, String login, String pass) {
        super(browser);
        this.login = login;
        this.pass = pass;
    }

    @Parameterized.Parameters
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {"chrome", "Student", "906090"},
                {"chrome", "tudent", "909090"}
        });

        }
    @Test
    public void invalidLogin(){
        loginPage.loginUser(login,pass);
        checkAcceptanceCriteria("title not match", loginPage.getTitle(), "Account of spare: Авторизация");
    }



}
