import org.example.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void sadMoodTest(){
        MoodAnalyzer mood1 = new MoodAnalyzer("I am in Sad Mood");
        boolean result = mood1.analyseMood();
        Assert.assertEquals(false, result);
    }
    @Test
    public void happyMoodTest(){
        MoodAnalyzer mood1 = new MoodAnalyzer("I am in Happy Mood");
        boolean result = mood1.analyseMood();
        Assert.assertEquals(true, result);
    }

}
