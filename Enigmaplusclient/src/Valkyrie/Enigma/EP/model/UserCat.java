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
public class UserCat {
    private String email;
    private String category;
    private String subcategory;

    public UserCat(String email, String category, String subcategory) {
        this.email = email;
        this.category = category;
        this.subcategory = subcategory;
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
     * @return the UserCat
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the UserCat to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the subcategory
     */
    public String getSubcategory() {
        return subcategory;
    }

    /**
     * @param subcategory the subcategory to set
     */
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    
}
