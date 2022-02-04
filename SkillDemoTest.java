import static org.junit.Assert.assertEquals;

import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplication(){
        assertEquals(20, SkillDemo.multiply(4, 5));
    }
}
