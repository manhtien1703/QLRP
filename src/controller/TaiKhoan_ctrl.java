/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.sql.SQLException;
import model.NhanVien;
import model.TaiKhoan;


/**
 *
 * @author 21522
 */
public class TaiKhoan_ctrl {

    public boolean Login(String username, String password) {
       return TaiKhoan.Login(username, password);
    }

    public String getThongTinDangNhap(String username) {
       return TaiKhoan.getThongTinDangNhap(username);
    }

    public boolean addTaiKhoan(TaiKhoan t) {
        return TaiKhoan.addTaiKhoan(t);
    }

    public static void showtaikhoan(String manv, NhanVien nv, TaiKhoan tk) {
        TaiKhoan.showtaikhoan(manv, nv, tk);
    }

    public static void DoiMatKhau(String matkhaumoi, String manguoidung) throws SQLException {
        TaiKhoan.DoiMatKhau(matkhaumoi, manguoidung);
    }

    public static String MatKhauCu(String manguoidung) {
        return TaiKhoan.MatKhauCu(manguoidung);
    }

    public static void XoaTaiKhoan(String MaTK) throws SQLException {
        TaiKhoan.XoaTaiKhoan(MaTK);
    }

    public static String LoaiTaiKhoan(String username) {
      return TaiKhoan.LoaiTaiKhoan(username);
    }
}
