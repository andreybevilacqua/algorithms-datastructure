package dynamic_programming.string_exercises;

import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.string_exercises.CanConstructExercise.canConstruct;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanConstructExerciseTest {

    @Test
    public void test1() {
        assertTrue(canConstruct("abcdef", new String[]{"ab","abc","cd","def","abcd"}, new HashMap<>()));
        assertFalse(canConstruct("skateboard", new String[]{"bo","rd","ate","t","ska", "sk", "boar"}, new HashMap<>()));
        assertTrue(canConstruct("enterapotentpot", new String[]{"a","p","ent","enter","ot", "o", "t"}, new HashMap<>()));
        assertFalse(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e","ee","eee","eeee","eeeee", "eeeeee"}, new HashMap<>()));
    }
}
