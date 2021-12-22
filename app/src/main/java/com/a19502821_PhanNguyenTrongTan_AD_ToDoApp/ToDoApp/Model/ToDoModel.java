package com.a19502821_PhanNguyenTrongTan_AD_ToDoApp.ToDoApp.Model;

public class ToDoModel extends TaskId {

    private String task , due;
    private int status;

    public String getTask() {
        return task;
    }

    public String getDue() {
        return due;
    }

    public int getStatus() {
        return status;
    }
}
