import org.example.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void nullPointerTest(){
        MoodAnalyzer mood1 = new MoodAnalyzer(null);
        boolean result = mood1.analyseMood();
        Assert.assertEquals(true, result);
    }
//    @Test
//    public void result2(){
//        MoodAnalyzer mood1 = new MoodAnalyzer("I am in Happy Mood");
//        String result = mood1.analyseMood();
//        Assert.assertEquals("HAPPY", result);
//    }

}
