/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Valkyrie.Enigma.EP.controller;

import Valkyrie.Enigma.EP.DB.DBConnection;
import Valkyrie.Enigma.EP.model.Question;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cmjd
 */
public class QuestionController {

    public static int addQuestion(Question questions) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        // long qid, String question, String title, String q_short, int rate, String date, String attachment, String picture, String code, long uid) 

        String sql = "Insert into question(question,title,q_short,rate,date,attachment,picture,code,uid,category) values('" + questions.getQuestion() + "','" + questions.getTitle() + "','" + questions.getQ_short() + "','" + questions.getRate() + "','" + questions.getDate() + "','" + questions.getAttachment() + "','" + questions.getPicture() + "','" + questions.getCode() + "','" + questions.getUid() + "','" + questions.getCategory() + "')";
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static Question fillquestion(long num) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        if (num == 1) {
            String sql = "Select qid From question where qid=(SELECT MAX(qid) FROM question)";
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()) {
                num = Integer.parseInt(rst.getString("qid"));
            }

        }

        String sql = "Select * From question where qid='" + num + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            Question question = new Question(num, rst.getString("question"), rst.getString("title"), rst.getString("q_short"), Integer.parseInt(rst.getString("rate")), rst.getString("date"), rst.getString("attachment"), rst.getString("picture"), rst.getString("code"), Integer.parseInt(rst.getString("uid")), rst.getString("category"));
            return question;
        } else {
            return null;
        }
    }
public static Question qstRep(long numR) throws ClassNotFoundException, SQLException{
        Connection connR = DBConnection.getDBConnection().getConnection();
        Statement stmR = connR.createStatement();
    String sqlR ="Select * From question where qid='"+numR+"'";
     ResultSet rst=stmR.executeQuery(sqlR);
     if(rst.next()){
     Question question = new Question(numR, rst.getString("question"), rst.getString("title"), rst.getString("q_short"), Integer.parseInt(rst.getString("rate")), rst.getString("date"), rst.getString("attachment"), rst.getString("picture"), rst.getString("code"), Integer.parseInt(rst.getString("uid")), rst.getString("category"));
            return question;
     }
     else{
     return null;
     }
    
}
public static Question searchquestion(String Search_title)throws ClassNotFoundException, SQLException{
        
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        String sql = "Select * From question where title='" + Search_title + "'";
        ResultSet rst = stm.executeQuery(sql);
               
        if (rst.next()) {
            Question question = new Question(Long.parseLong(rst.getString("qid")), rst.getString("question"), rst.getString("title"), rst.getString("q_short"), Integer.parseInt(rst.getString("rate")), rst.getString("date"), rst.getString("attachment"), rst.getString("picture"), rst.getString("code"), Integer.parseInt(rst.getString("uid")), rst.getString("category"));
            return question;
        } else {
            return null;
        }
     }



//nipun end
//    public static int deleteCustomer(String id) throws ClassNotFoundException, SQLException{
//        Connection conn = DBConnection.getDBConnection().getConnection();
//        Statement stm = conn.createStatement();
//        String sql="Delete From Customer where id='"+id+"'";
//        return stm.executeUpdate(sql);
//    }
//    public static int updateCustomer(Customer customer) throws ClassNotFoundException, SQLException{
//        Connection conn = DBConnection.getDBConnection().getConnection();
//        Statement stm = conn.createStatement();
//        String sql = "Update Customer set name='"+customer.getName()+"', address='"+customer.getAddress()+"',salary="+customer.getSalary()+" where id='"+customer.getId() +"'";
//        return stm.executeUpdate(sql);
//    }
//    public static ArrayList<Customer> getAllCustomer() throws ClassNotFoundException, SQLException{
//        Connection conn = DBConnection.getDBConnection().getConnection();
//        Statement stm = conn.createStatement();
//        String sql = "Select * From Customer";
//        ResultSet rst = stm.executeQuery(sql);
//        ArrayList<Customer>customerList=new ArrayList<>(); 
//        while(rst.next()) {
//            Customer customer = new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"), rst.getDouble("salary"));
//            customerList.add(customer);    
//        }
//        return customerList;
//    }
}
