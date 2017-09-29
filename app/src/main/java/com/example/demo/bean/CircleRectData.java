package com.example.demo.bean;
/**
 * Created by liujie on 2017/9/25.
 */
public class CircleRectData {

    private int code;// 圆圈所代表的数字（1~9）
    private int x;// 圆心的X坐标
    private int y;// 圆心的Y坐标
    private int state; // 圆圈的当前状态

    public CircleRectData() {
    }

    public CircleRectData(int code, int x, int y, int state) {
        this.code = code;
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
