package Level01;

import org.junit.Assert;
import org.junit.Test;

public class ProblemsTest {

    @Test
    public void wordCountTest01(){
        Problems problems = new Problems();
        String input = "Hello World";

        String expected = "2";
        String actual = problems.wordCount(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wordCountTest02(){
        Problems problems = new Problems();
        String input = "one 22 three";

        String expected = "3";
        String actual = problems.wordCount(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void firstReverseTest01(){
        Problems problems = new Problems();
        String input = "Hello World and Coders";

        String expected = "sredoC dna dlroW olleH";
        String actual = problems.firstReverse(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void firstReverseTest02(){
        Problems problems = new Problems();
        String input = "Do you think you can code?";

        String expected = "?edoc nac uoy kniht uoy oD";
        String actual = problems.firstReverse(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestWordTest01(){
        Problems problems = new Problems();
        String input = "fun&!! time";

        String expected = "time";
        String actual = problems.longestWord(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestWordTest02(){
        Problems problems = new Problems();
        String input = "I love dogs";

        String expected = "love";
        String actual = problems.longestWord(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void swapCaseyTest01(){
        Problems problems = new Problems();
        String input = "Hello-LOL";

        String expected = "hELLO-lol";
        String actual = problems.swapCase(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void swapCaseyTest02(){
        Problems problems = new Problems();
        String input = "Sup DUDE!!?";

        String expected = "sUP dude!!?";
        String actual = problems.swapCase(input);
        Assert.assertEquals(expected, actual);
    }


}
