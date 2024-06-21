/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.sql.SQLException;
import java.util.List;
import model.ThanhVien;

/**
 *
 * @author 21522
 */
public class ThanhVien_ctrl {

    public List<ThanhVien> getAllTV() {
       return ThanhVien.getAllTV();
    }

    public boolean ThemThanhVien(ThanhVien t) {
    return ThanhVien.ThemThanhVien(t);
    }

    public boolean XoaTV(String matv) {
     return ThanhVien.XoaTV(matv);
    }

    public boolean CapNhatTV(ThanhVien tv) throws SQLException {
       return ThanhVien.CapNhatTV(tv);
    }

    public boolean isThanhVien(String MaTV) {
      return ThanhVien.isThanhVien(MaTV);
    }

    public int getDiemTichLuy(String MaTV) {
        return ThanhVien.getDiemTichLuy(MaTV);
    }

    public static void updateDiemTichLuy(String MaTV) {
        ThanhVien.updateDiemTichLuy(MaTV);
    }
}
