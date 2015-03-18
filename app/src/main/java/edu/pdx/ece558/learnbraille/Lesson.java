package edu.pdx.ece558.learnbraille;

/**
 * Created by samue_000 on 3/11/2015.
 */
public class Lesson {
    //fields:
    int id;
    public String title;
    public String content;

    //methods:
    public Lesson(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return title;
    }
}
