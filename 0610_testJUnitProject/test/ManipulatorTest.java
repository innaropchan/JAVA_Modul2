import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManipulatorTest {

    @Test
    public void testCompareNumbersTrueCase() {
        Manipulator manipulator = new Manipulator();
        boolean b = manipulator.compareNumbers(3, 5);
        Assert.assertTrue(b);
    }

    @Test
    public void testCompareNumbersFalseCase() {
        Manipulator manipulator = new Manipulator();
        Assert.assertFalse("CompareNumberTrueCase", manipulator.compareNumbers(6, 2));
    }

    //aa,bb -<aabb;
    //notNull
    //s1.length() + s2.length() = res.length()
    @Test
    public void testConcatValue() {
        Manipulator manipulator = new Manipulator();
        String s = manipulator.concat("aa", "bb");
        Assert.assertEquals("test fall","aabb", s);
    }
    @Test
    public void testConcatLengthResult(){
        Manipulator manipulator= new Manipulator();
        String s= manipulator.concat("aa", "bb");
        Assert.assertEquals(4,s.length());
    }

}