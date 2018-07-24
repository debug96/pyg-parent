import org.junit.Test;
import org.syd.utils.MD5Util;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestCommon {

    @Test
    public void testMD5(){

    }

    public static void main(String[] args) {
        System.out.println(MD5Util.createSign(new TreeMap<String, String>(), "1", "2"));

    }
}
