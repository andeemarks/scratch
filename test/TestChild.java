public class TestChild implements Child {
    protected boolean hasBeenCalled = false;

    @Override
    public void stuff() {
        hasBeenCalled = true;
    }
}
