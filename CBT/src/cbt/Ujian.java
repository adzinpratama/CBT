/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbt;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import koneksi.conek;

/**
 *
 * @author Hilmi-Adzin
 */
public class Ujian {
    private static String id_ujian;
    private static String id_soal;
    private static String soal;
    private static String a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static String kunci;
    
    public static String get_id_ujian(){
        return id_ujian;
    }
    public static String get_id_soal(){
        return id_soal;
    }
    public static String get_soal(){
        return soal;
    }
    public static String get_a(){
        return a;
    }
    public static String get_b(){
        return b;
    }
    public static String get_c(){
        return c;
    }
    public static String get_d(){
        return d;
    }
    public static String get_e(){
        return e;
    }
    public static String get_kunci(){
        return kunci;
    }
    public static void set_id_ujian(String id_ujian){
        Ujian.id_ujian=id_ujian;
        
    }
    public static void set_id_soal(String id_soal){
        Ujian.id_soal=id_soal;
        
    }
    public static void set_soal(String soal,String a,String b,String c,String d,String e,String kunci){
        Ujian.soal = soal;
        Ujian.a = a;
        Ujian.b = b;
        Ujian.c = c;
        Ujian.d = d;
        Ujian.e = e;
        Ujian.kunci = kunci;
        
    }
    
    
}
