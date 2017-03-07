package com.thunisoft.quickSort;

/**
 * 测试排序方法
 *
 * @author minghui
 * @create 2017-03-07 10:59
 */
public class TestSort implements Comparable<Object>{
    private int index;
    private String name;

    public TestSort(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        } else if(o != null && o instanceof TestSort){
            TestSort t = (TestSort) o;
            if(index <= t.index){
                return -1;
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "TestSort{" +
                "index=" + index +
                ", name='" + name + '\'' +
                '}';
    }
}
