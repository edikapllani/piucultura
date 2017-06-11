package it.piucultura.userprofile.audit.model;

import java.util.Date;

/**
 * Created by earthshrek on 06/06/2017.
 */



public class LogUser {
    private long id;
    private String user;
    private int questionId;
    private String type;
    private String questionAnswer;
    private String imageDescription;
    private String links;


    public LogUser() {
    }

    public LogUser(String user, int questionId, String type, String questionAnswer, String imageDescription,String links) {
        this.id = (new Date()).getTime();
        this.user = user;
        this.questionId = questionId;
        this.type = type;
        this.questionAnswer = questionAnswer;
        this.imageDescription = imageDescription;
        this.links = links;

    }
    public long getId() {
        return id;
    }




    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getType() {
        return type;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }



 /*   @Override
    public String toString() {
        return "LogUser{" +
                "id=" + id +
                "user=" + user +
                ", questionId='" + questionId + '\'' +
                ", type='" + type + '\'' +
                ", questionAnswer='" + questionAnswer + '\'' +
                ", imageDescription='" + imageDescription + '\'' +
                ", links='" + links + '\'' +
                '}';
    }*/
    @Override
    public String toString() {
        return "[" +
                 + id +
                "] [" + user +
                "] [" +  questionId +
                "] [" +  type +
                "] [" +  questionAnswer +
                "] [" + imageDescription +
                "] [" + links +
                ']';
    }


    /* @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }*/
}
