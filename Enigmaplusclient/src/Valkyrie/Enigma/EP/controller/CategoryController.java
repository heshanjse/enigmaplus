/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Valkyrie.Enigma.EP.controller;

import Valkyrie.Enigma.EP.DB.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author hesh
 */
public class CategoryController {

    public static ArrayList<String> getcategory(String expert) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();

        String sql = "Select categoryname From category where Expertised_area='" + expert + "'";
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<String> category = new ArrayList<String>();
        while (rst.next()) {
            category.add(rst.getString("categoryname"));

        }
       

        HashSet hs = new HashSet();
        hs.addAll(category);
        category.clear();
        category.addAll(hs);
        return category;
    }

    public static ArrayList<String> getsubcategory(String cat) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();

        String sql = "Select subcategory From category where categoryname='" + cat + "'";
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<String> subcategory = new ArrayList<String>();
        while (rst.next()) {
            subcategory.add(rst.getString("subcategory"));

        }
        HashSet hs = new HashSet();
        hs.addAll(subcategory);
        subcategory.clear();
        subcategory.addAll(hs);
        return subcategory;
    }
}
