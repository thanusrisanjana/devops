package prg2_b1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class resultTest {

    @Test
    public void testeven() {
        Assert.assertEquals(result.display(6), "even");
    }

    @Test
    public void testodd() {
        Assert.assertEquals(result.display(3), "odd");
    }
}

