package dynamic_programming.tabulation.string_exercises;

import org.junit.Test;

import java.util.Arrays;

import static dynamic_programming.tabulation.string_exercises.AllConstructExercise.allConstruct;

public class AllConstructExerciseTest {

    @Test
    public void test1() {
        System.out.println("abc example -> " + Arrays.deepToString(allConstruct("abc", new String[]{"ab", "c"})));
        System.out.println("purple example -> " + Arrays.deepToString(allConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl"})));
        System.out.println("abcdef example -> " + Arrays.deepToString(allConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"})));
        System.out.println("skateboard example -> " + Arrays.deepToString(allConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"})));
        System.out.println("multiple a's example -> " + Arrays.deepToString(allConstruct("aaaaaaaaaz", new String[]{"a", "aa", "aaa", "aaaa", "aaaaa"})));
    }
}
