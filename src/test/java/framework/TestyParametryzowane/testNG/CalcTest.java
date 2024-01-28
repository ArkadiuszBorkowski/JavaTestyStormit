package framework.TestyParametryzowane.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class CalcTest {

    @DataProvider(name = "data")
    public Object[] [] dataProviderMethod() {

        return new Object[][] {
                {2,3,4},
                {-1,5,-5},
                {0,3,0}
        };
    }

    @Test(dataProvider = "data")
    public void multiply_withDataProvider_resultFromDataProvider(int one, int two, int reqResult) {
        Calc calc = new Calc();
        int result = calc.multiply(one, two);
        Assert.assertEquals(reqResult, result);

    }

}