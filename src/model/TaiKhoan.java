/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Util.JDBCConnection;
import controller.TaiKhoan_ctrl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 21522
 */
public class TaiKhoan {

    private String MaTK, MaNguoiDung, TenTK, Password, LoaiTK;

    public String getMatK() {
        return MaTK;
    }

    public void setMatK(String MatK) {
        this.MaTK = MatK;
    }

    public String getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(String MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getLoaiTK() {
        return LoaiTK;
    }

    public void setLoaiTK(String LoaiTK) {
        this.LoaiTK = LoaiTK;
    }

    static public boolean Login(String username, String password) {
        String query = "SELECT * FROM TaiKhoan WHERE TenTK = ? AND Password = ?";
        Connection con = JDBCConnection.getJDBCConnection();
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, username);
            pst.setString(2, password);
            try (ResultSet rs = pst.executeQuery()) {
                return rs.next();
            }
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

    static public String getThongTinDangNhap(String username) {
        String MaNV = "";
        String query = "SELECT nv.manv FROM nhanvien nv JOIN taikhoan tk ON nv.manv = tk.manguoidung WHERE tk.tentk = ?";
        Connection con = JDBCConnection.getJDBCConnection();
        try (PreparedStatement smt = con.prepareStatement(query)) {
            smt.setString(1, username);
            try (ResultSet rs = smt.executeQuery()) {
                if (rs.next()) {
                    MaNV = rs.getString(1);
                }
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
        return MaNV;
    }

    static public boolean addTaiKhoan(TaiKhoan t) {

        String query = "INSERT INTO TAIKHOAN VALUES(?,?,?,?,?)";
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            PreparedStatement pt = con.prepareStatement(query);
            pt.setString(1, t.getMatK());
            pt.setString(2, t.getMaNguoiDung());
            pt.setString(3, t.getTenTK());
            pt.setString(4, t.getPassword());
            pt.setString(5, t.getLoaiTK());
            return pt.executeUpdate() > 0;

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

    public static void showtaikhoan(String manv, NhanVien nv, TaiKhoan tk) {

        String query = "select TK.MATK,TK.TENTK,NV.HOTENNV,NV.GIOITINH,NV.NGAYSINH,NV.DIACHI,NV.SDT  from taikhoan tk join nhanvien nv on tk.manguoidung = nv.manv where manv = ? ";
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            PreparedStatement pre = con.prepareStatement(query);
            pre.setString(1, manv);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                tk.setMatK(rs.getString(1));
                tk.setTenTK(rs.getString(2));
                nv.setHoTenNV(rs.getString(3));
                nv.setGioiTinh(rs.getString(4));
                nv.setNgaySinh(rs.getString(5));
                nv.setDiaChi(rs.getString(6));
                nv.setSDT(rs.getString(7));
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

    public static void DoiMatKhau(String matkhaumoi, String manguoidung) throws SQLException {
        String sql = "Update TAIKHOAN SET PASSWORD = ? WHERE MANGUOIDUNG = ? ";
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, matkhaumoi);
            pre.setString(2, manguoidung);
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công");
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_ctrl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Đổi mật khẩu thất bại");
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String MatKhauCu(String manguoidung) {
        String sql = "Select password from TAIKHOAN where MaNguoiDung = ?";
        Connection con = JDBCConnection.getJDBCConnection();
        String mk = null;
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, manguoidung);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                mk = rs.getString(1);
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
        return mk;
    }

    public static void XoaTaiKhoan(String MaTK) throws SQLException {
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            String sql = "Delete from TAIKHOAN WHERE MATK = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, MaTK);
            pre.executeUpdate();
            int tmp = pre.executeUpdate();
        } catch (Exception e) {

        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String LoaiTaiKhoan(String username) {
        String sql = "select loaitk from taikhoan where tentk = ?";
        String loaitk = null;
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, username);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                loaitk = rs.getString(1);
            }
            return loaitk;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
