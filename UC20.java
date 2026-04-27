import org.junit.Test;
import static org.junit.Assert.*;

public class QuantityMeasurementAppTest {

    @Test(expected = IllegalStateException.class)
    public void testSearch_ThrowsExceptionWhenEmpty() {
        String[] emptyBogieIds = {};
        UseCase20TrainConsistMgmt.performSearch(emptyBogieIds, "BG101");
    }

    @Test
    public void testSearch_AllowsSearchWhenDataExists() {
        String[] bogieIds = {"BG101", "BG205"};
        // Should execute without throwing IllegalStateException
        UseCase20TrainConsistMgmt.performSearch(bogieIds, "BG101");
        assertTrue(true); 
    }

    @Test
    public void testSearch_BogieFoundAfterValidation() {
        String[] bogieIds = {"BG101", "BG205", "BG309"};
        assertTrue(UseCase20TrainConsistMgmt.performSearch(bogieIds, "BG205"));
    }

    @Test
    public void testSearch_BogieNotFoundAfterValidation() {
        String[] bogieIds = {"BG101", "BG205", "BG309"};
        assertFalse(UseCase20TrainConsistMgmt.performSearch(bogieIds, "BG999"));
    }

    @Test
    public void testSearch_SingleElementValidCase() {
        String[] bogieIds = {"BG101"};
        assertTrue(UseCase20TrainConsistMgmt.performSearch(bogieIds, "BG101"));
    }
}
