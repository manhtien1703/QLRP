/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static Util.DateConverter.convertDateFormat;
import Util.JDBCConnection;
import controller.LPhim_ctrl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 21522
 */
public class ThanhVien {

    private String MaTV, TenTV, GioiTinh, DiaChi, SDT, CMND;
    private String NgaySinh, NgayDK;
    private Long DiemTichLuy;

    public ThanhVien() {
    }

    public ThanhVien(String MaTV, String TenTV, String GioiTinh, String DiaChi, String SDT, String CMND, String NgaySinh, String NgayDK, Long DiemTichLuy) {
        this.MaTV = MaTV;
        this.TenTV = TenTV;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.CMND = CMND;
        this.NgaySinh = NgaySinh;
        this.NgayDK = NgayDK;
        this.DiemTichLuy = DiemTichLuy;
    }

    public String getMaTV() {
        return MaTV;
    }

    public void setMaTV(String MaTV) {
        this.MaTV = MaTV;
    }

    public String getTenTV() {
        return TenTV;
    }

    public void setTenTV(String TenTV) {
        this.TenTV = TenTV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNgayDK() {
        return NgayDK;
    }

    public void setNgayDK(String NgayDK) {
        this.NgayDK = NgayDK;
    }

    public Long getDiemTichLuy() {
        return DiemTichLuy;
    }

    public void setDiemTichLuy(Long DiemTichLuy) {
        this.DiemTichLuy = DiemTichLuy;
    }

    public static List<ThanhVien> getAllTV() {
        List<ThanhVien> tvs;
        tvs = new ArrayList<ThanhVien>();
        Connection con = JDBCConnection.getJDBCConnection();
        String sql = " select * from thanhvien";
        try {
            PreparedStatement pre = con.prepareStatement(sql);

            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                ThanhVien tv = new ThanhVien();
                tv.setMaTV(rs.getString("MATV"));
                tv.setTenTV(rs.getString("TENTV"));
                tv.setGioiTinh(rs.getString("GIOITINH"));
                String ngaysinhString = convertDateFormat(rs.getString("NGAYSINH"), "yyyy-MM-dd", "dd-MM-yyyy");
                tv.setNgaySinh(ngaysinhString);
                tv.setDiaChi(rs.getString("DIACHI"));
                tv.setSDT(rs.getString("SDT"));
                tv.setCMND(rs.getString("CMND"));
                String ngaydangkyString = convertDateFormat(rs.getString("NGAYDANGKY"), "yyyy-MM-dd", "dd-MM-yyyy");
                tv.setNgayDK(ngaydangkyString);
                tv.setDiemTichLuy(rs.getLong("DIEMTICHLUY"));
                tvs.add(tv);
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
        return tvs;
    }

    public static boolean ThemThanhVien(ThanhVien t) {
        String query = " insert into ThanhVien(MATV,TENTV,GIOITINH,NGAYSINH,DIACHI,SDT,CMND,NGAYDANGKY,DIEMTICHLUY) values (?,?,?,?,?,?,?,?,?) ";
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, t.getMaTV());
            pre.setString(2, t.getTenTV());
            pre.setString(3, t.getGioiTinh());
            String ngaysinhString = convertDateFormat(t.getNgaySinh(), "dd-MM-yyyy", "yyyy-MM-dd");
            pre.setString(4, ngaysinhString);
            pre.setString(5, t.getDiaChi());
            pre.setString(6, t.getSDT());
            pre.setString(7, t.getCMND());
            String ngaydangkyString = convertDateFormat(t.getNgayDK(), "dd-MM-yyyy", "yyyy-MM-dd");
            pre.setString(8, ngaydangkyString);
            pre.setLong(9, t.getDiemTichLuy());
            return pre.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean XoaTV(String matv) {
        String sql = "DELETE FROM THANHVIEN WHERE MATV =?";
        Connection con = JDBCConnection.getJDBCConnection();
        try {

            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, matv);
            int tmp = pre.executeUpdate();
            if (tmp > 0) {
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

    public static boolean CapNhatTV(ThanhVien tv) throws SQLException {
        String query = "UPDATE THANHVIEN SET TENTV =?,GIOITINH = ?, NGAYSINH= ?,DIACHI= ? "
                + ",SDT= ? ,CMND= ? ,NGAYDANGKY= ?, DIEMTICHLUY= ? WHERE MATV = ?";
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            PreparedStatement pt = con.prepareStatement(query);
            pt.setString(1, tv.getTenTV());
            pt.setString(2, tv.getGioiTinh());
            String ngaysinhString = convertDateFormat(tv.getNgaySinh(), "dd-MM-yyyy", "yyyy-MM-dd");
            pt.setString(3, ngaysinhString);
            pt.setString(4, tv.getDiaChi());
            pt.setString(5, tv.getSDT());
            pt.setString(6, tv.getCMND());
            String ngaydangkyString = convertDateFormat(tv.getNgayDK(), "dd-MM-yyyy", "yyyy-MM-dd");
            pt.setString(7, ngaydangkyString);
            pt.setLong(8, tv.getDiemTichLuy());
            pt.setString(9, tv.getMaTV());
            int tmp = pt.executeUpdate();
            con.close();
            if (tmp > 0) {
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

    public static boolean isThanhVien(String MaTV) {
        String query = "select *\n"
                + "from thanhvien\n"
                + "where matv ='" + MaTV + "'";
        Connection con = JDBCConnection.getJDBCConnection();

        try {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
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

    public static int getDiemTichLuy(String MaTV) {
        int DTL = 0;
        String query = "select DiemTichLuy\n"
                + "from thanhvien\n"
                + "where matv ='" + MaTV + "'";
        Connection con = JDBCConnection.getJDBCConnection();

        try {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            if (rs.next()) {
                DTL = rs.getInt(1);
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
        return DTL;
    }

    public static void updateDiemTichLuy(String MaTV) {
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            String selectQuery = "SELECT SUM(DTL) AS tongdiem FROM HOADON WHERE MaTV = ?";
            PreparedStatement selectStatement = con.prepareStatement(selectQuery);
            selectStatement.setString(1, MaTV);
            ResultSet resultSet = selectStatement.executeQuery();
            if (resultSet.next()) { // Kiểm tra xem ResultSet có dữ liệu không
                int tongDiem = resultSet.getInt("tongdiem");
                String updateQuery = "UPDATE THANHVIEN SET DIEMTICHLUY = ? WHERE MATV = ?";
                PreparedStatement updateStatement = con.prepareStatement(updateQuery);
                updateStatement.setInt(1, tongDiem);
                updateStatement.setString(2, MaTV);
                updateStatement.executeUpdate();
            } else {
                System.out.println("Không tìm thấy dữ liệu cho mã thành viên: " + MaTV);
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
    }

}
