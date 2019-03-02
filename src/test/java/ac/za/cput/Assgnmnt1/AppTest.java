package ac.za.cput.Assgnmnt1;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        App theBigining = new App();
            int ans = 3;
        Assert.assertEquals(ans,theBigining.Ngisa());
    }
}
