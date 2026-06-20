package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogPage {
    public DialogPage(){

        PageFactory.initElements(
                GWD.getDriver(),
                this
        );
    }

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[4]/a")
    public WebElement billPay;

    @FindBy (xpath = "//*[@id='billpayForm']/form/table/tbody/tr[14]/td[2]/input")
    public  WebElement sendPayment;

    @FindBy (xpath = "//*[@id='billpayForm6']/form/table/tbody/tr[11]/td[2]/input")
    public WebElement amount;

    @FindBy (xpath = "//*[@id='billpayForm']/form/table/tbody/tr[8]/td[2]/input")
    public WebElement account ;

    @FindBy (xpath = "//*[@id='billpayForm']/form/table/tbody/tr[9]/td[2]/input")
    public WebElement verifyAccount;

    @FindBy (xpath = "//*[@id='billpayForm']/form/table/tbody/tr[1]/td[2]/input")
    public WebElement payeeName;

    @FindBy (xpath = "//*[@id='leftPanel']/ul/li[8]/a")
    public WebElement logOut;

    @FindBy (css = "[class='login']>input")
    public  WebElement userName;

    @FindBy (xpath =" //*[@id='loginPanel']/form/div[2]/input" )
    public WebElement passWord;

    @FindBy (xpath = "//*[@id='loginPanel']/form/div[3]/input")
    public WebElement loginButton;


}
