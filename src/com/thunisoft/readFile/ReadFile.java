package com.thunisoft.readFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by minghui on 2017/3/9.
 */
public abstract class ReadFile {
    /**
     * 获取parent Content
     * @param url 文件url
     * @return
     */
    public abstract void addContent(Content content,String url);

    /**
     * 打印方法
     */
    public abstract  void printResult(Content content);

    /**
     * 读取文件并将之拆分成为String数组
     * @param url 文件url
     * @return
     * @throws IOException
     */
    public List<String> readFile(String url) throws IOException{
        FileReader fr = new FileReader(url);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        List<String> list = new ArrayList<>();
        int i = 0;
        while((line = br.readLine()) != null){
//            arrs = line.split(",");
            list.add(line);
//            System.out.println(line);
        }

        br.close();
        return list;
    }
}
