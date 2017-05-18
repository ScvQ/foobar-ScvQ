package cn.spiderpig.mess;

import junit.framework.TestCase;

public class MessTest extends TestCase{
    
    public void mess(){
        String str = "a,b,c,,";
        String[] ary = str.split(",");
        //预期大于3，结果是3
        String s = str.substring(str.lastIndexOf(","), str.lastIndexOf(",")+1);
        System.out.println(s);
    }

}
