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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 21522
 */
public class MaKhuyenMai {
    private String maKM,tenKM;
    private int tyLeKM;

    public MaKhuyenMai() {
    }

    public MaKhuyenMai(String maKM, String tenKM, int tyLeKM) {
        this.maKM = maKM;
        this.tenKM = tenKM;
        this.tyLeKM = tyLeKM;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public int getTyLeKM() {
        return tyLeKM;
    }

    public void setTyLeKM(int tyLeKM) {
        this.tyLeKM = tyLeKM;
    }
    
    public static boolean isKhuyenMai(String MaKM) {
        String query = "SELECT * FROM khuyenmai WHERE makm = ?";
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, MaKM);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static  int getTyleKM(String MaKM) {
        int TLKM = 0;
        String query = "SELECT TyleKM FROM khuyenmai WHERE makm = ?";
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, MaKM);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                TLKM = rs.getInt("TyleKM");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return TLKM;
    }

    public static ArrayList<MaKhuyenMai> getAllMaKhuyenMai() {
        ArrayList<MaKhuyenMai> kmList = new ArrayList<>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM KHUYENMAI";
        try (
            PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String makm = rs.getString("makm");
                String tenkm = rs.getString("tenkm");
                int tyle = rs.getInt("tylekm");

                kmList.add(new MaKhuyenMai(makm, tenkm, tyle));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return kmList;
    }

    public static  void ThemKM(MaKhuyenMai khuyenMai) {
        Connection con = JDBCConnection.getJDBCConnection();

        String sql = "Insert into KHUYENMAI (MaKM,TENKM,TYLEKM) Values(?,?,?)";
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setString(1, khuyenMai.getMaKM());
            prest.setString(2, khuyenMai.getTenKM());
            prest.setLong(3, khuyenMai.getTyLeKM());

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

    public static void SuaKM(MaKhuyenMai khuyenMai) {
        Connection con = JDBCConnection.getJDBCConnection();

        String sql = "Update KHUYENMAI Set TENKM = ? ,TYLEKM = ? where MaKM = ?";

        try {
            PreparedStatement prest = con.prepareStatement(sql);

            prest.setLong(2, khuyenMai.getTyLeKM());
            prest.setString(1, khuyenMai.getTenKM());
            prest.setString(3, khuyenMai.getMaKM());

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
    public static void XoaKM(String MaKM) {
        Connection con = JDBCConnection.getJDBCConnection();

        String sql = "Delete from KHUYENMAI where MaKM = ?";
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setString(1, MaKM);
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

    public static MaKhuyenMai getKM(String makm) {

        Connection con = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM KHUYENMAI WHERE MaKM = ?";

        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setString(1, makm);
            ResultSet rs = prest.executeQuery();
            while (rs.next()) {
                MaKhuyenMai km = new MaKhuyenMai();

                km.setMaKM(rs.getString("MaKm"));
                km.setTenKM(rs.getString("TenKM"));
                km.setTyLeKM(rs.getInt("TYLEKM"));

                return km;
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
