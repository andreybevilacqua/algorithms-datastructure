package dynamic_programming.memoization.string_exercises;

import org.junit.Test;

import java.util.HashMap;

import static dynamic_programming.memoization.string_exercises.AllConstructExercise.allConstruct;
import static dynamic_programming.memoization.string_exercises.AllConstructExercise.allConstructWithMemoization;

public class AllConstructExerciseTest {

    @Test
    public void test1() {
        System.out.println("abc example -> " + allConstruct("abc", new String[]{"ab","c"}));
        System.out.println("purple example -> " + allConstruct("purple", new String[]{"purp","p","ur","le","purpl"}));
        System.out.println("abcdef example -> " + allConstruct("abcdef", new String[]{"ab","abc","cd","def","abcd","ef","c"}));
        System.out.println("skateboard example -> " + allConstruct("skateboard", new String[]{"bo","rd","ate","t","ska","sk","boar"}));
        System.out.println("multiple a's example -> " + allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz", new String[]{"a","aa","aaa","aaaa","aaaaa"}));
    }

    @Test
    public void test2() {
        System.out.println("Memo abc example -> " +
                allConstructWithMemoization("abc", new String[]{"ab","c"}, new HashMap<>()));
        System.out.println("Memo purple example -> " +
                allConstructWithMemoization("purple", new String[]{"purp","p","ur","le","purpl"}, new HashMap<>()));
        System.out.println("Memo abcdef example -> " +
                allConstructWithMemoization("abcdef", new String[]{"ab","abc","cd","def","abcd","ef","c"}, new HashMap<>()));
        System.out.println("Memo skateboard example -> " +
                allConstructWithMemoization("skateboard", new String[]{"bo","rd","ate","t","ska","sk","boar"}, new HashMap<>()));
        System.out.println("Memo multiple a's example -> " +
                allConstructWithMemoization("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz", new String[]{"a","aa","aaa","aaaa","aaaaa"}, new HashMap<>()));
    }
}
