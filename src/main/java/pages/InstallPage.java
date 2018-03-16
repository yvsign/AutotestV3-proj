package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InstallPage extends ParentPage{

    public InstallPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "installation")
    WebElement inslattationElement;
    @FindBy (xpath = "//*[@data-original-title='Add']")
    WebElement addButton;
    @FindBy (id = "installation_installationDate_date_day")
    WebElement installationDateDay;
    @FindBy (id="installation_installationDate_date_month")
    WebElement installationDateMonth;
    @FindBy (id="installation_installationDate_date_year")
    WebElement installationDateYear;
    @FindBy(xpath = ("//*[@id='installation_installationDate_date_year']/option[text() = '2019']"))
    WebElement chooseYear;
    @FindBy (id="installation_installationDate_time_hour")
    WebElement installationDateHour;
    @FindBy (id="installation_installationDate_time_minute")
    WebElement installationDateMinute;
    @FindBy(id="installation_apparat")
    WebElement installationApparat;
    @FindBy(xpath = "//option[@value = '600']")
    WebElement chooseInstallationApparat;
    @FindBy(id="installation_worker")
    WebElement installationWorker;
    @FindBy(xpath = "//*[@id='installation_worker']/option[@value = '245']")
    WebElement chooseInstallationWorker;
    @FindBy(xpath = "//button[@name = 'add']" )
    WebElement submitInstalling;


    public void openInstallPage(){
        actionsWithWebElements.clickMethod(inslattationElement);
        actionsWithWebElements.clickMethod(addButton);
    }
    public void setDate(){
        actionsWithWebElements.clickMethod(installationDateDay);
        actionsWithWebElements.clickMethod(installationDateMonth);
        actionsWithWebElements.clickMethod(installationDateYear);
        actionsWithWebElements.clickMethod(chooseYear);
    }
    public void setTime() {
        actionsWithWebElements.clickMethod(installationDateHour);
        actionsWithWebElements.clickMethod(installationDateMinute);
    }
    public void chooseApparatToInstall(){
        actionsWithWebElements.clickMethod(installationApparat);
        actionsWithWebElements.clickMethod(chooseInstallationApparat);

    }
    public void chooseWorkerToInstall(){
        actionsWithWebElements.clickMethod(installationWorker);
        actionsWithWebElements.clickMethod(chooseInstallationWorker);
        actionsWithWebElements.clickMethod(submitInstalling);
    }


}
