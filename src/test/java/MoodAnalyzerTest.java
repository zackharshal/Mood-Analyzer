import org.example.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void result1(){
        MoodAnalyzer mood1 = new MoodAnalyzer("I am in Sad Mood");
        String result = mood1.analyseMood();
        Assert.assertEquals("SAD", result);
    }
    @Test
    public void result2(){
        MoodAnalyzer mood1 = new MoodAnalyzer("I am in Happy Mood");
        String result = mood1.analyseMood();
        Assert.assertEquals("HAPPY", result);
    }

}
