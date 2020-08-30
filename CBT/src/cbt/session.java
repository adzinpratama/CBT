/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbt;

/**
 *
 * @author Hilmi-Adzin
 */
public class session {
    private static String id_user;
    private static String level;
    public static String get_id_user(){
        return id_user;
    }
    public static void set_id_user(String id_user){
        session.id_user=id_user;
        
    }
    public static String get_level(){
        return level;
    }
    public static void set_level(String level){
        session.level = level;
    }
}
