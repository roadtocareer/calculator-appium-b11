import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id="com.google.android.calculator:id/digit_7")
    WebElement btn7;
    @FindBy(id="com.google.android.calculator:id/digit_5")
    WebElement btn5;
    @FindBy(id="com.google.android.calculator:id/op_add")
    WebElement btnAdd;
    @FindBy(id="com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id="com.google.android.calculator:id/result_final")
    WebElement txtResult;

    public CalcScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public String doSum(){
        btn7.click();
        btnAdd.click();
        btn5.click();
        btnEqual.click();
        return txtResult.getText();
    }
}
