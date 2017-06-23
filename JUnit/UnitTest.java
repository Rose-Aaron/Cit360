public class UnitTest {

    @Test
    public void testGetTheBoolean() {
        Unit Unit = new Unit();

        assertTrue (Unit.getTheBoolean());

        assertFalse (Unit.getTheBoolean());
    }
}
