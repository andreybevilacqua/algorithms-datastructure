package dynamic_programming.tabulation.string_exercises;

import org.junit.Test;

import static dynamic_programming.tabulation.string_exercises.CanConstructExercise.canConstruct;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanConstructExerciseTest {

    @Test
    public void test1() {
        assertTrue(canConstruct("abcdef", new String[]{"ab","abc","cd","def","abcd"}));
        assertFalse(canConstruct("skateboard", new String[]{"bo","rd","ate","t","ska","sk","boar"}));
        assertTrue(canConstruct("enterapotentpot", new String[]{"a","p","ent","enter","ot","o","t"}));
        assertFalse(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e","ee","eee","eeee","eeeee","eeeeee"}));
    }
}
