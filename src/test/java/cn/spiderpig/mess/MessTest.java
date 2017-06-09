package cn.spiderpig.mess;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

public class MessTest {

    @Test
    public void mess() {
        String str = "a,b,c,e,f";
        String[] ary = str.split(",");
        String s = str.substring(str.lastIndexOf(",")+1, str.lastIndexOf(",") + 2);
        System.out.println(s);
    }

    @Test
    public void testI18N() {
        ResourceBundle rb = ResourceBundle.getBundle("i18n");
        String name = MessageFormat.format(rb.getString("name"), new String[] { "1234" });
        String nickname = MessageFormat.format(rb.getString("name"), new String[] { "1234" });

        System.out.println(name);
        System.out.println(nickname);

        ResourceBundle rb2 = ResourceBundle.getBundle("i18n", new Locale("en_US"));
        String name2 = MessageFormat.format(rb2.getString("name"), new String[] { "1234" });
        String nickname2 = MessageFormat.format(rb2.getString("name"), new String[] { "1234" });

        System.out.println(name2);
        System.out.println(nickname2);
    }

}
