package com.example.shyne.twitter;

/**
 * Created by SHYNE on 03/15/18.
 */

public class Contact {
    private String name;
    private String idStudent;
    private int color;

    public Contact(String name, String idStudent, int color) {
        this.name = name;
        this.idStudent = idStudent;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
