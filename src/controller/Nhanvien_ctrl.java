/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.NhanVien;
import java.util.*;

/**
 *
 * @author 21522
 */
public class Nhanvien_ctrl {

    public static ArrayList<NhanVien> hienThiNhanVien() {
      return NhanVien.getAll();
    }

    public static boolean themNhanvien(NhanVien nv) {
        return NhanVien.add(nv);
    }

    public static boolean xoaNhanVien(NhanVien nv) {
        return NhanVien.delete(nv);
    }

    public static boolean capNhatNhanVien(NhanVien nv) {
        return NhanVien.update(nv);
    }

    public static ArrayList<NhanVien> searchdanhsach(String param) {
      return NhanVien.search(param);
    }
}
