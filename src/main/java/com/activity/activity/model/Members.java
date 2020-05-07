package com.activity.activity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Members {
    @Id
    @GeneratedValue
    private Integer Member_Id;
    private String Name;

    public Integer getMember_Id() {
        return Member_Id;
    }

    public void setMember_id(Integer Member_Id) {
        this.Member_Id = Member_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Members(){

    }
}
