/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Util.JDBCConnection;
import controller.DatVe_ctrl;
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
public class DatVe {
    private String MaGhe, MaSC, MaKM;
            int SoHD;
            long ThanhTien;

    public String getMaGhe() {
        return MaGhe;
    }

    public void setMaGhe(String MaGhe) {
        this.MaGhe = MaGhe;
    }

    public String getMaSC() {
        return MaSC;
    }

    public void setMaSC(String MaSC) {
        this.MaSC = MaSC;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public int getSoHD() {
        return SoHD;
    }

    public void setSoHD(int SoHD) {
        this.SoHD = SoHD;
    }

    public long getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(long ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
        //Hàm lấy vị trí ghế đã đặt
    public static ArrayList<String> ListGheDaDat(String MaSuatChieu) {

        ArrayList<String> ListGhe = new ArrayList<>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = "Select Vitri from DatVe inner join Ghe on DatVe.maghe = Ghe.maghe Where masc ='" + MaSuatChieu + "'";
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();
            while (rs.next()) {
                ListGhe.add(rs.getString(1)); //truyền vào listghe vị trí ghế đã đặt
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatVe_ctrl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ListGhe;
    }

    public static  boolean DatVe(String MAGHE, String MASC, int SOHD) {
        String sp_datve = "INSERT INTO datve (maghe, masc, sohd) VALUES (?, ?, ?)";
        Connection con = JDBCConnection.getJDBCConnection();
        try (
            PreparedStatement smt = con.prepareStatement(sp_datve)) {
            smt.setString(1, MAGHE);
            smt.setString(2, MASC);
            smt.setInt(3, SOHD);
            int rowsInserted = smt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
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

    public static int KiemTraGhe(String MAGHE, String MASC) {
    String f_check_seat = "SELECT COUNT(*) AS NumberOfRow "
                        + "FROM DATVE "
                        + "WHERE MASC = ? AND MAGHE = ?";
    Connection con = JDBCConnection.getJDBCConnection();
    int rowCount = 0;
    try {
        PreparedStatement smt = con.prepareStatement(f_check_seat);
        smt.setString(1, MASC);
        smt.setString(2, MAGHE);
        ResultSet rs = smt.executeQuery();
        if (rs.next()) {
            rowCount = rs.getInt("NumberOfRow");
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
    return rowCount;
}

}
