import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

class MyStringChecker implements StringChecker{
    public boolean checkString(String s){
        return s.contains("a");
    }
}

public class ListTests {
    
    @Test
    public void testFilter() {
        List<String> lst = new ArrayList<String>();
        lst.add("apple");
        lst.add("banana");
        lst.add("kiwi");

        List<String> lstExpected = new ArrayList<String>();
        lstExpected.add("apple");
        lstExpected.add("banana");

        MyStringChecker sc = new MyStringChecker();
        assertArrayEquals(lstExpected.toArray(), ListExamples.filter(lst, sc).toArray());
    }
}