import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup {
    @Test
    public void doSum(){
        CalcScreen calcScreen=new CalcScreen(driver);
        String res= calcScreen.doSum();
        System.out.println(res);
        Assert.assertEquals(res,"12");
    }
}
