package com.moddakir.mylibrary.Model;

import java.io.Serializable;

import io.realm.RealmList;
import io.realm.RealmObject;

public class Education extends RealmObject implements Serializable {
    private RealmList<String> paths;
    private String level;
    private boolean isEducationDialogDisplayed;

    public Education() {
    }

    public RealmList<String> getPaths() {
        return paths;
    }

    public void setPaths(RealmList<String> paths) {
        this.paths = paths;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public boolean isEducationDialogDisplayed() {
        return isEducationDialogDisplayed;
    }

    public void setEducationDialogDisplayed(boolean educationDialogDisplayed) {
        isEducationDialogDisplayed = educationDialogDisplayed;
    }
}
