package br.com.walison.layout.model;

import java.util.Date;

public class Task {

    public Task(Long id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }


    public Task() {
        
    }
    

    private Long id;
    private String name;
    private Date date;

    //id
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    //name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //date
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
}
