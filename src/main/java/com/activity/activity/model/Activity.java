package com.activity.activity.model;

import javax.persistence.*;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer activityId;
    private String activityName;
    private String comment;
    private Integer createdMemberId;


    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getCreatedMemberId() {
        return createdMemberId;
    }

    public void setCreatedMemberId(Integer createdMemberId) {
        this.createdMemberId = createdMemberId;
    }

    public Activity(){

    }

}
