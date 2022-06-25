package dynamic_programming.tabulation.string_exercises;

import org.junit.Test;

import static dynamic_programming.tabulation.string_exercises.CountConstructExercise.countConstruct;
import static org.junit.Assert.assertEquals;

public class CountConstructExerciseTest {

    @Test
    public void test1() {
        assertEquals(2, countConstruct("purple", new String[]{"purp","p","ur","le","purpl"}));
        assertEquals(1, countConstruct("abcdef", new String[]{"ab","abc","cd","def","abcd"}));
        assertEquals(0, countConstruct("skateboard", new String[]{"bo","rd","ate","t","ska", "sk", "boar"}));
        assertEquals(4, countConstruct("enterapotentpot", new String[]{"a","p","ent","enter","ot", "o", "t"}));
        assertEquals(0, countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e","ee","eee","eeee","eeeee", "eeeeee"}));
    }
}
