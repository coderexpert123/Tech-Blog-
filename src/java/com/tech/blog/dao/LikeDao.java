package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LikeDao {
        Connection con;

    public LikeDao(Connection con) {
        this.con = con;
    }

    

     
    //insert like function 
    public boolean insertLike(int postid, int userid){
        boolean f=false;
        try {
            
            String q="insert int like(postid,postid) values(?,?)";

            PreparedStatement pt= this.con.prepareStatement(q);
            //setting the value 
            pt.setInt(1, postid);
            pt.setInt(2, userid);
            pt.executeUpdate();
            f=true;
            
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        return f;
        
    }
    
    //insert the count like function 
    
    public int countLikeOnPost(int postid){
        int count=0;
        
        String q="select count(*)  from like where postid=?";
        try {
            
            PreparedStatement p=this.con.prepareStatement(q);
            p.setInt(1, postid);
            ResultSet set=p.executeQuery();
            if(set.next()){
                count=set.getInt("count(*)");
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
                
        
        return count;
       
    }
    
    public boolean isLikeByDao(int postid,int userid){
        boolean f=false;
        
        try {
            
            PreparedStatement p=this.con.prepareStatement("select * from where postid=? and userid=?");
            p.setInt(1, postid);
            p.setInt(2, userid);
           ResultSet set= p.executeQuery();
            if(set.next()){
                f=true;
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
        
    }
    
    //delete like 
    
    public boolean deletlike(int postid,int userid){
        boolean f=false;
        try {
            
            PreparedStatement p=this.con.prepareStatement("delete from like where postid=? and userid=?");
              
            p.setInt(1, postid);
            p.setInt(2, userid);
            p.executeQuery();
            f=true;
            
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return f;
        
    }
}
