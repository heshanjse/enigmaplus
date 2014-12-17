/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Valkyrie.Enigma.EP.model;

/**
 *
 * @author hesh
 */
public class Question {
    private long qid;
    private String question;
    private String title;
    private String q_short;
    private int rate;
    private String date;
    private String attachment;
    private String picture;
    private String code;
    private long uid;
    private String category;

    public Question(long qid, String question, String title, String q_short, int rate, String date, String attachment, String picture, String code, long uid, String category) {
        this.qid = qid;
        this.question = question;
        this.title = title;
        this.q_short = q_short;
        this.rate = rate;
        this.date = date;
        this.attachment = attachment;
        this.picture = picture;
        this.code = code;
        this.uid = uid;
        this.category = category;
    }
    

    /**
     * @return the qid
     */
    public long getQid() {
        return qid;
    }

    /**
     * @param qid the qid to set
     */
    public void setQid(long qid) {
        this.qid = qid;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the q_short
     */
    public String getQ_short() {
        return q_short;
    }

    /**
     * @param q_short the q_short to set
     */
    public void setQ_short(String q_short) {
        this.q_short = q_short;
    }

    /**
     * @return the rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the attachment
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * @param attachment the attachment to set
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * @return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the uid
     */
    public long getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(long uid) {
        this.uid = uid;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

   
    
}
