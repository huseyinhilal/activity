package com.activity.activity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Participation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer participationId;
    private Integer memberId;
    private Integer activityId;


    public Integer getParticipationId() {
        return participationId;
    }

    public void setParticipationId(Integer participationId) {
        this.participationId = participationId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Participation(){

    }
}
