package com.myapplicationdev.android.p04_revisionnotes;

public class  Note {
    private int id;
    private String noteContent;
    private int star;

    public Note(int id, String noteContent, int star) {
        this.id = id;
        this.noteContent = noteContent;
        this.star = star;
    }

    public int getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public int getStar() {
        return star;
    }

}
