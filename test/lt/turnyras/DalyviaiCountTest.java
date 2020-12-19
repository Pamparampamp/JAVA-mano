package lt.turnyras;

import lt.bit.TournamentUtils;
import lt.bit.Turnyras;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;

public class DalyviaiCountTest {
  @Test
  public void testNextRound() {
//    class TurnyrasTest extends Turnyras {
//      public TurnyrasTest(InputStream is, OutputStream out) {
//        super(is, out);
//      }
//
//      @Override
//      public int dalyviaiCountInNextRound(int totalDalyviai) {
//          return super.dalyviaiCountInNextRound(totalDalyviai);
//      }
//    }
//
//    TurnyrasTest   t = new TurnyrasTest(null, null);

    Assert.assertEquals(0, TournamentUtils.dalyviaiCountInNextRound(0));
    Assert.assertEquals(0, TournamentUtils.dalyviaiCountInNextRound(1));
    Assert.assertEquals(0, TournamentUtils.dalyviaiCountInNextRound(2));
    Assert.assertEquals(1, TournamentUtils.dalyviaiCountInNextRound(3));
    Assert.assertEquals(0, TournamentUtils.dalyviaiCountInNextRound(4));
    Assert.assertEquals(3, TournamentUtils.dalyviaiCountInNextRound(5));
    Assert.assertEquals(2, TournamentUtils.dalyviaiCountInNextRound(6));
    Assert.assertEquals(1, TournamentUtils.dalyviaiCountInNextRound(7));
    Assert.assertEquals(0, TournamentUtils.dalyviaiCountInNextRound(8));
    Assert.assertEquals(7, TournamentUtils.dalyviaiCountInNextRound(9));
    Assert.assertEquals(6, TournamentUtils.dalyviaiCountInNextRound(10));


  }
      @Test
  public void testRoundCount ( ){

    Assert.fail("TODO "); //Todo
  }
}

