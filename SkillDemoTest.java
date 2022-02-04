import static org.junit.Assert.assertEquals;

import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplication(){
        assertEquals(1, SkillDemo.multiply(4, 5));
    }
}
