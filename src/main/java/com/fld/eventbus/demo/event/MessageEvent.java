package com.fld.eventbus.demo.event;

/**
 * @program: eventbusdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-18 11:15
 */
public class MessageEvent<T> {
    private String tag;
    private T data;

    @Override
    public String toString() {
        return "MessageEvent{" +
                "tag='" + tag + '\'' +
                ", data=" + data +
                '}';
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}