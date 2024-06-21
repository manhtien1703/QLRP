/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Util.JDBCConnection;
import controller.Phim_ctrl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 21522
 */
public class Phim {

    private String MaPhim, MaLp, TenPhim, QuocGia;
    private int ThoiLuong;

    public Phim() {
    }
    
    

    public Phim(String MaPhim, String MaLp, String TenPhim, String QuocGia, int ThoiLuong) {
        this.MaPhim = MaPhim;
        this.MaLp = MaLp;
        this.TenPhim = TenPhim;
        this.QuocGia = QuocGia;
        this.ThoiLuong = ThoiLuong;
    }
    
    
    public String getMaPhim() {
        return MaPhim;
    }

    public void setMaPhim(String MaPhim) {
        this.MaPhim = MaPhim;
    }

    public String getMaLp() {
        return MaLp;
    }

    public void setMaLp(String MaLp) {
        this.MaLp = MaLp;
    }

    public String getTenPhim() {
        return TenPhim;
    }

    public void setTenPhim(String TenPhim) {
        this.TenPhim = TenPhim;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public static ArrayList<Phim> getAll() {
        String sql = "select * from phim";
        Connection con = JDBCConnection.getJDBCConnection();
        ArrayList<Phim>  listPhim = new ArrayList<>();
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                listPhim.add(new Phim(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getInt(4)));
            }
            return listPhim;
        } catch (SQLException ex) {
            Logger.getLogger(Phim_ctrl.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
       
    }

    public static void HienThiPhim(String maphim, model.LPhim lp, model.Phim p) {
        String sql = "select * from phim p join loaiphim lp on p.MALP = lp.MALP where p.maphim = ?";
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, maphim);
            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                p.setMaPhim(rs.getString(1));
                p.setTenPhim(rs.getString(3));
                p.setThoiLuong(rs.getInt(4));
                p.setQuocGia(rs.getString(5));
                lp.setTenLP(rs.getString(7));
                lp.setHinhThuc(rs.getString(8));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Phim_ctrl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
