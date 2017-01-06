package databind.android.com.testdatabind;

/**
 * Created by wangfei on 17/1/3.
 */
public class StringUtil {
    public static String cut( String word) {
       if (word.length()>4){
           word = word.substring(0,4);

       }
        return word;
    }
}
