/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Valkyrie.Enigma.EP.controller;

import Valkyrie.Enigma.EP.DB.DBConnection;
import Valkyrie.Enigma.EP.model.UserCat;
import Valkyrie.Enigma.EP.model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hesh
 */
public class UserController {

    public static int addUser(User user,UserCat cat) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        System.out.println("ok in UC");
        String sql = "Insert into user(fname,lname,email,password,profession,interrested,expertis) values('" + user.getFname() + "','" + user.getLname() + "','" + user.getEmail() + "','" + user.getPassword() + "','" + user.getProfession() + "','" + user.getInterrested() + "','" + user.getExpertis() + "')";
        int res = stm.executeUpdate(sql);
        System.out.println("ok user");
        String sql2 = "Insert into usercat(email,category,subcategory) values('" + cat.getEmail() + "','"+cat.getCategory()+"','"+cat.getSubcategory()+"')";
        int res2 = stm.executeUpdate(sql2);
        System.out.println("ok ucat");
        return res;
    }

    public static User Loginuser(String username, String password) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        String sql = "Select password,fname,uid From user where email='" + username + "'";
        ResultSet rst = stm.executeQuery(sql);
        User u = null;
        
        if (rst.next()) {
            if (rst.getString("password").equals(password)) {
                u = new User();
               u.setFname(rst.getString("fname"));
                u.setUid((int) rst.getLong("uid"));
                return u;
            } 
        }
        return u;
    }
   
    public static User profileView(int UID) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        String sql = "Select fname,lname,email,profession,reputation,expertis FROM user Where uid = '" + UID + "'";
        ResultSet rst = stm.executeQuery(sql);
        User u = null;
        
        if (rst.next()){
            u = new User();
            u.setFname(rst.getString("fname"));
            u.setLname(rst.getString("lname"));
            u.setEmail(rst.getString("email"));
            u.setProfession(rst.getString("profession"));
            u.setReputation(rst.getInt("reputation"));
            u.setExpertis(rst.getString("expertis"));  
        }
        return u;
    }
   


}
