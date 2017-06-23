public class UnitTest {

    @Test
    public void testGetTheBoolean() {
        Unit Unit = new Unit();

        assertTrue (Unit.getTheBoolean());

        assertFalse (Unit.getTheBoolean());
    }
}

public class UnitTest {

    @Test
    public void testGetTheObject() {
        Unit Unit = new Unit();

        assertNull (Unit.getTheObject());

        assertNotNull (Unit.getTheObject());
    }
}

public class UnitTest {

    @Test
    public void testGetTheSameObject() {
        Unit Unit = new Unit();

        assertSame   (Unit.getTheSameObject(),
                      Unit.getTheSameObject());
        
        assertNotSame (Unit.getTheSameObject(),
                      Unit.getTheSameObject());
    }
}
