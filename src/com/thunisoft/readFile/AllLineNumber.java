package com.thunisoft.readFile;

import java.io.IOException;
import java.util.List;

/**
 * Created by minghui on 2017/3/9.
 */
public class AllLineNumber extends ReadFile {

    @Override
    public void addContent(Content content,String url) {
        //父级Content
        try {
            List<String> texts = readFile(url);
            for (String text : texts) {
                String reg = "^\\d+$";
                Content c = new Content(text,text.matches(reg));
                content.getAllContent().add(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printResult(Content content) {
        List<Content> list = content.getAllContent();
        int i=1;
        for (Content c : list) {
            System.out.print("第" + i + "行内容为：" + c.getText() + "   ");
            System.out.println(list.get(i-1).getState()?"当前行是纯数字":"当前行不是纯数字");
            i++;
        }
    }
}
