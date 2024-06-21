/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Util.JDBCConnection;
import controller.LPhim_ctrl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 21522
 */
public class LPhim {

    private String MaLP, TenLP, HinhThuc;

    public LPhim() {
    }

    public LPhim(String MaLP, String TenLP, String HinhThuc) {
        this.MaLP = MaLP;
        this.TenLP = TenLP;
        this.HinhThuc = HinhThuc;
    }

    public String getMaLP() {
        return MaLP;
    }

    public void setMaLP(String MaLP) {
        this.MaLP = MaLP;
    }

    public String getTenLP() {
        return TenLP;
    }

    public void setTenLP(String TenLP) {
        this.TenLP = TenLP;
    }

    public String getHinhThuc() {
        return HinhThuc;
    }

    public void setHinhThuc(String HinhThuc) {
        this.HinhThuc = HinhThuc;
    }

    //hàm lấy toàn bộ thông tin loại phim
    static public List<LPhim> getAllLPhim() {
        List<LPhim> LPhims;
        LPhims = new ArrayList<LPhim>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM LOAIPHIM";
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();
            while (rs.next()) {
                LPhim lp = new LPhim();
                lp.setMaLP(rs.getString("MaLP"));
                lp.setTenLP(rs.getString("TenLP"));
                lp.setHinhThuc(rs.getString("HinhThuc"));
                LPhims.add(lp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LPhim_ctrl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return LPhims;
    }

    //hàm thêm loại phim
    static public void ThemLP(LPhim lp) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Insert into LOAIPHIM (MALP,TENLP,HINHTHUC) Values(?,?,?)";
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setString(1, lp.getMaLP());
            prest.setString(2, lp.getTenLP());
            prest.setString(3, lp.getHinhThuc());
            int rs = prest.executeUpdate();
            System.out.println(rs);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LPhim_ctrl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //hàm sửa loại phim
    static public void SuaLP(LPhim lp) throws SQLException {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Update LOAIPHIM Set TENLP = ? ,HINHTHUC = ? where MALP = ?";
        con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setString(1, lp.getTenLP());
            prest.setString(2, lp.getHinhThuc());
            prest.setString(3, lp.getMaLP());
            int rs = prest.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(LPhim_ctrl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //hàm xoá loại phim
    static public void XoaLP(String MaLP) {
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Delete from LoaiPhim where MaLP = ?";
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setString(1, MaLP);
            int rs = prest.executeUpdate();
            System.out.println(rs);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LPhim_ctrl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static public LPhim getLP(String malp) {

        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM LOAIPHIM WHERE MALP = ?";
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setString(1, malp);
            ResultSet rs = prest.executeQuery();
            while (rs.next()) {
                LPhim lp = new LPhim();

                lp.setMaLP(rs.getString("MaLP"));
                lp.setTenLP(rs.getString("TenLP"));
                lp.setHinhThuc(rs.getString("HinhThuc"));

                return lp;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LPhim_ctrl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
