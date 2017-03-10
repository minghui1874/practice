package com.thunisoft.readFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minghui on 2017/3/9.
 */
public class Content {
    private  ReadFile readFile;

    private String text;
    //当前行是数字/其他
    private boolean state;
    private List<Content> allContent;


    public Content(ReadFile readFile) {
        this.readFile = readFile;
        allContent = new ArrayList<Content>();
    }

    public Content() {
    }

    public Content(String text, boolean state) {
        this.text = text;
        this.state = state;
    }

    public void getResultContent(String  url){
        readFile.addContent(this,url);
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void add(Content content){
        allContent.add(content);
    }

    public void  remove(Content content){
        allContent.remove(content);
    }

    public List<Content> getAllContent() {
        return allContent;
    }

    public void print(){
        readFile.printResult(this);
    }

}
