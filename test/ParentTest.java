import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParentTest {
    @Test
    public void parentDoAskChildToDoStuff() {
        Parent parent = new Parent();
        TestChild child = new TestChild();
        parent.doesStuff(child);

        assertTrue(child.hasBeenCalled);
    }
}
