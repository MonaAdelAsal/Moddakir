package com.moddakir.mylibrary.Model;

import java.io.Serializable;

import io.realm.RealmObject;

public class TeacherCategoryModel extends RealmObject implements Serializable {
    String id;
    String value;

    public TeacherCategoryModel() {
    }

    public TeacherCategoryModel(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
