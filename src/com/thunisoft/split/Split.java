package com.thunisoft.split;

import java.util.ArrayList;
import java.util.List;

/**
 * @author minghui
 * @create 2017-03-06 14:20
 */
public class Split {
    public static void main(String[] args) {
        String s = "wqw.eq.wesadsad";
        List<String> result = split(s, ".");
        System.out.println(result);

    }

    public static List<String> split(String str,String separator){
        int size = str.length();
        int pos = 0;
        List<String> result = new ArrayList();

        for(int i=0,j=0; i<size; i++,j++){
            pos = str.indexOf(separator,i);
            if(pos == -1){
                //-1表示已经为最后一段未接去字符串，直接加入结果数组并停止循环
                result.add(str.substring(i, size));
                break;
            }else{
                result.add(str.substring(i, pos));
                i = pos;
            }
        }
        return result;
    }
}
