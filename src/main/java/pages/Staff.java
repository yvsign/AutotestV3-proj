package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Staff extends ParentPage {

    public Staff(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text() = 'Словари']")
    WebElement slovariMenuElement;
    @FindBy(xpath = "//li[@id='workers']")
    WebElement slovariWorkersElement;
    @FindBy(xpath = "//*[@data-original-title='Add']")
    WebElement addWokerButton;
    @FindBy(xpath = "//input[@id='workers_workerSurname']")
    WebElement surnameField;
    @FindBy(xpath = "//*[@id='workers_workerName']")
    WebElement nameField;
    @FindBy(xpath = "//*[@id='workers_workerMiddleName']")
    WebElement midleNameField;
    @FindBy(xpath = "//*[@id='workers_workerPhone']")
    WebElement workersPhoneField;
    @FindBy(xpath = "//button[@name = 'add']")
    WebElement submitButton;


    public void  openSlovariWorkers() {

        actionsWithWebElements.clickMethod(slovariMenuElement);
        actionsWithWebElements.clickMethod(slovariWorkersElement);
    }

    public void createWorker(String surname, String name, String midlename, String phone){
        actionsWithWebElements.clickMethod(addWokerButton);
        actionsWithWebElements.inputToTextField(surnameField, surname);
        actionsWithWebElements.inputToTextField(nameField, name);
        actionsWithWebElements.inputToTextField(midleNameField, midlename);
        actionsWithWebElements.inputToTextField(workersPhoneField, phone);
        actionsWithWebElements.clickMethod(submitButton);


    }


}
