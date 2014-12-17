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
public class Answer {
    private int aid;
    private int qid;
    private int vote;
    private String answer;
    private String date;

    public Answer() {
    }

    public Answer(int aid, int qid, int vote, String answer, String date) {
        this.aid = aid;
        this.qid = qid;
        this.vote = vote;
        this.answer = answer;
        this.date = date;
    }

    /**
     * @return the aid
     */
    public int getAid() {
        return aid;
    }

    /**
     * @param aid the aid to set
     */
    public void setAid(int aid) {
        this.aid = aid;
    }

    /**
     * @return the qid
     */
    public int getQid() {
        return qid;
    }

    /**
     * @param qid the qid to set
     */
    public void setQid(int qid) {
        this.qid = qid;
    }

    /**
     * @return the vote
     */
    public int getVote() {
        return vote;
    }

    /**
     * @param vote the vote to set
     */
    public void setVote(int vote) {
        this.vote = vote;
    }

    /**
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
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
    

}
