/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Valkyrie.Enigma.EP.controller;

import Valkyrie.Enigma.EP.DB.DBConnection;
import Valkyrie.Enigma.EP.model.Answer;
import Valkyrie.Enigma.EP.model.Question;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hesh
 */
public class AnswerController {
    public static int addAnswer(Answer answer) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        String sql = "Insert into answer(qid,answer,date) values('" + answer.getQid() + "','" + answer.getAnswer() + "','" + answer.getDate() + "')";
        int res = stm.executeUpdate(sql);
        return res;
    }
}
