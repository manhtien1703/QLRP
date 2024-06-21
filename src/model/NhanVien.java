/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static Util.DateConverter.convertDateFormat;
import Util.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 21522
 */
public class NhanVien {

    private String MaNV, MaNQL, MaTK, HoTenNV, GioiTinh, NgaySinh, DiaChi, SDT,
            NgayVL, ChucVu;
    private long Luong;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String MaNQL, String MaTK, String HoTenNV, String GioiTinh, String NgaySinh, String DiaChi, String SDT, String NgayVL, String ChucVu, long Luong) {
        this.MaNV = MaNV;
        this.MaNQL = MaNQL;
        this.MaTK = MaTK;
        this.HoTenNV = HoTenNV;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.NgayVL = NgayVL;
        this.ChucVu = ChucVu;
        this.Luong = Luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaNQL() {
        return MaNQL;
    }

    public void setMaNQL(String MaNQL) {
        this.MaNQL = MaNQL;
    }

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public String getHoTenNV() {
        return HoTenNV;
    }

    public void setHoTenNV(String HoTenNV) {
        this.HoTenNV = HoTenNV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
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

    public String getNgayVL() {
        return NgayVL;
    }

    public void setNgayVL(String NgayVL) {
        this.NgayVL = NgayVL;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public long getLuong() {
        return Luong;
    }

    public void setLuong(long Luong) {
        this.Luong = Luong;
    }

    public static ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> dsnhanvien = new ArrayList<>();
        Connection con = JDBCConnection.getJDBCConnection();
        try {

            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","DOAN","Benten2001");
            String sql = "select * from nhanvien";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("manv"));
                nv.setMaNQL(rs.getString("manql"));
                nv.setMaTK(rs.getString("matk"));
                nv.setHoTenNV(rs.getString("hotennv"));
                nv.setGioiTinh(rs.getString("gioitinh"));
                String ngaysinhString = convertDateFormat(rs.getString("ngaysinh"), "yyyy-MM-dd", "dd-MM-yyyy");
                nv.setNgaySinh(ngaysinhString);
                nv.setSDT(rs.getString("sdt"));
                nv.setDiaChi(rs.getString("diachi"));
                String ngayvaolamString = convertDateFormat(rs.getString("ngayvaolam"), "yyyy-MM-dd", "dd-MM-yyyy");
                nv.setNgayVL(ngayvaolamString);
                nv.setChucVu(rs.getString("chucvu"));
                nv.setLuong(rs.getInt("luong"));
                dsnhanvien.add(nv);
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
        return dsnhanvien;
    }

    public static boolean add(NhanVien nv) {
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","DOAN","Benten2001");
            String ngaysinhString = convertDateFormat(nv.getNgaySinh(), "dd-MM-yyyy", "yyyy-MM-dd");
            String ngayvaolamString = convertDateFormat(nv.getNgayVL(), "dd-MM-yyyy", "yyyy-MM-dd");
            String sql = "INSERT INTO NHANVIEN VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nv.getMaNV());
            pst.setString(2, nv.getMaNQL());
            pst.setString(3, nv.getMaTK());
            pst.setString(4, nv.getHoTenNV());
            pst.setString(5, nv.getGioiTinh());
            pst.setString(6, ngaysinhString);
            pst.setString(7, nv.getDiaChi());
            pst.setString(8, nv.getSDT());
            pst.setLong(9, nv.getLuong());
            pst.setString(10, ngayvaolamString);
            pst.setString(11, nv.getChucVu());
            return pst.executeUpdate() > 0;
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

    public static boolean delete(NhanVien nv) {
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","DOAN","Benten2001");
            String sql = "delete from nhanvien where manv=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nv.getMaNV());
            return pst.executeUpdate() > 0;
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

    public static boolean update(NhanVien nv) {
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","DOAN","Benten2001");
            String ngaysinhString = convertDateFormat(nv.getNgaySinh(), "dd-MM-yyyy", "yyyy-MM-dd");
            String ngayvaolamString = convertDateFormat(nv.getNgayVL(), "dd-MM-yyyy", "yyyy-MM-dd");
            String sql = "UPDATE NHANVIEN SET MANQL = ?,MATK = ? ,HOTENNV =?,GIOITINH = ?, NGAYSINH = ?,DIACHI= ? "
                    + ",SDT= ? ,LUONG= ? ,NGAYVAOLAM = ?, CHUCVU= ? WHERE MANV = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nv.getMaNQL());
            pst.setString(2, nv.getMaTK());
            pst.setString(3, nv.getHoTenNV());
            pst.setString(4, nv.getGioiTinh());
            pst.setString(5, ngaysinhString);
            pst.setString(6, nv.getDiaChi());
            pst.setString(7, nv.getSDT());
            pst.setLong(8, nv.getLuong());
            pst.setString(9, ngayvaolamString);
            pst.setString(10, nv.getChucVu());
            pst.setString(11, nv.getMaNV());
            return pst.executeUpdate() > 0;
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

    public static ArrayList<NhanVien> search(String param) {
        ArrayList<NhanVien> dsnhanvien = new ArrayList<>();
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","DOAN","Benten2001");    
            String sql = "SELECT * FROM nhanvien WHERE manql || manv || matk || hotennv || gioitinh || ngaysinh || diachi || sdt || luong || ngayvaolam|| chucvu LIKE '%" + param + "%'";
            PreparedStatement pst = con.prepareCall(sql);
            ResultSet rs = pst.executeQuery(sql);
            while (rs.next()) {
                String ngaysinhString = convertDateFormat(rs.getString("ngaysinh"), "yyyy-MM-dd", "dd-MM-yyyy");
                String ngayvaolamString = convertDateFormat(rs.getString("ngaysinh"), "yyyy-MM-dd", "dd-MM-yyyy");
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("manv"));
                nv.setMaNQL(rs.getString("manql"));
                nv.setMaTK(rs.getString("matk"));
                nv.setHoTenNV(rs.getString("hotennv"));
                nv.setGioiTinh(rs.getString("gioitinh"));
                nv.setNgaySinh(ngaysinhString);
                nv.setSDT(rs.getString("sdt"));
                nv.setDiaChi(rs.getString("diachi"));
                nv.setNgayVL(ngayvaolamString);
                nv.setChucVu(rs.getString("chucvu"));
                nv.setLuong(rs.getInt("luong"));
                dsnhanvien.add(nv);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dsnhanvien;
    }

}
