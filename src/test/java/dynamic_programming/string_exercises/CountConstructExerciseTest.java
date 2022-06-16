package dynamic_programming.string_exercises;

import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.string_exercises.CountConstructExercise.countConstruct;
import static org.junit.Assert.assertEquals;

public class CountConstructExerciseTest {

    @Test
    public void test1() {
        assertEquals(2, countConstruct("purple", new String[]{"purp","p","ur","le","purpl"}, new HashMap<>()));
        assertEquals(1, countConstruct("abcdef", new String[]{"ab","abc","cd","def","abcd"}, new HashMap<>()));
        assertEquals(0, countConstruct("skateboard", new String[]{"bo","rd","ate","t","ska", "sk", "boar"}, new HashMap<>()));
        assertEquals(4, countConstruct("enterapotentpot", new String[]{"a","p","ent","enter","ot", "o", "t"}, new HashMap<>()));
        assertEquals(0, countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e","ee","eee","eeee","eeeee", "eeeeee"}, new HashMap<>()));
    }
}
