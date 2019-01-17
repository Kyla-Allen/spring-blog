package com.codeup.springproject.Model;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 100, nullable=false)
    private String title;
    @Column(length = 100000, nullable=false)
    private String body;

    //Constructors
    public Post(){}

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body,int id) {
        this(title,body);
        this.setId(id);
    }


    //Getters and Setters
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
