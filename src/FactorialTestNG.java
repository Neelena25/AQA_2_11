import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTestNG {

    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(Factorial.factorial(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        Assert.assertEquals(Factorial.factorial(5), 120); // 5! = 120
        Assert.assertEquals(Factorial.factorial(6), 720); // 6! = 720
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Не можете вычислить факториал отрицательного числа.")
    public void testFactorialOfNegativeNumber() {
        Factorial.factorial(-1);
    }
}
