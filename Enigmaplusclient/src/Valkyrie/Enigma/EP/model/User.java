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
public class User {

    private int uid;
    private String fname;
    private String lname;
    private String email;
    private String password;
    private String interrested;
    private String expertis;
    private String cat;//
    private String subcat;//
    private String profession;
    private int reputation;
    private int availability;
    private String up_prof;
    private String down_prof;
    private String par_prof;
    private String pic;

    public User() {
    }

    public User(int uid, String fname, String lname, String email, String password, String interrested, String expertis, String cat, String subcat, String profession, int reputation, int availability, String up_prof, String down_prof, String par_prof, String pic) {
        this.uid = uid;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.interrested = interrested;
        this.expertis = expertis;
        this.cat = cat;
        this.subcat = subcat;
        this.profession = profession;
        this.reputation = reputation;
        this.availability = availability;
        this.up_prof = up_prof;
        this.down_prof = down_prof;
        this.par_prof = par_prof;
        this.pic = pic;
    }

    /**
     * @return the uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the interrested
     */
    public String getInterrested() {
        return interrested;
    }

    /**
     * @param interrested the interrested to set
     */
    public void setInterrested(String interrested) {
        this.interrested = interrested;
    }

    /**
     * @return the expertis
     */
    public String getExpertis() {
        return expertis;
    }

    /**
     * @param expertis the expertis to set
     */
    public void setExpertis(String expertis) {
        this.expertis = expertis;
    }

    /**
     * @return the cat
     */
    public String getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(String cat) {
        this.cat = cat;
    }

    /**
     * @return the subcat
     */
    public String getSubcat() {
        return subcat;
    }

    /**
     * @param subcat the subcat to set
     */
    public void setSubcat(String subcat) {
        this.subcat = subcat;
    }

    /**
     * @return the profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * @param profession the profession to set
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * @return the reputation
     */
    public int getReputation() {
        return reputation;
    }

    /**
     * @param reputation the reputation to set
     */
    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    /**
     * @return the availability
     */
    public int getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    /**
     * @return the up_prof
     */
    public String getUp_prof() {
        return up_prof;
    }

    /**
     * @param up_prof the up_prof to set
     */
    public void setUp_prof(String up_prof) {
        this.up_prof = up_prof;
    }

    /**
     * @return the down_prof
     */
    public String getDown_prof() {
        return down_prof;
    }

    /**
     * @param down_prof the down_prof to set
     */
    public void setDown_prof(String down_prof) {
        this.down_prof = down_prof;
    }

    /**
     * @return the par_prof
     */
    public String getPar_prof() {
        return par_prof;
    }

    /**
     * @param par_prof the par_prof to set
     */
    public void setPar_prof(String par_prof) {
        this.par_prof = par_prof;
    }

    /**
     * @return the pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * @param pic the pic to set
     */
    public void setPic(String pic) {
        this.pic = pic;
    }
    

    
    
}