package edu.pdx.ece558.learnbraille;

/**
 * Created by samue_000 on 3/16/2015.
 */
public class Quiz {
    //fields:
    int id;
    public String title;
    public String content;

    //methods:
    public Quiz(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return title;
    }
}
