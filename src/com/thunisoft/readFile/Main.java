package com.thunisoft.readFile;

import java.util.List;

/**
 * Created by minghui on 2017/3/9.
 */
public class Main {
    public static void main(String[] args) {
        Content content = new Content(new AllLineNumber());
        content.getResultContent("F:\\newfile\\mh.txt");
        content.print();
    }
}
