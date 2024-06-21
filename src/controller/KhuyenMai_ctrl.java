/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.MaKhuyenMai;


/**
 *
 * @author 21522
 */
public class KhuyenMai_ctrl {

    public boolean isKhuyenMai(String MaKM) {
        return MaKhuyenMai.isKhuyenMai(MaKM);
    }

    public int getTyleKM(String MaKM) {
       return MaKhuyenMai.getTyleKM(MaKM);
    }

    public static ArrayList<MaKhuyenMai> getAllMaKhuyenMai() {
       return MaKhuyenMai.getAllMaKhuyenMai();
    }

    public void ThemKM(MaKhuyenMai khuyenMai) {
        MaKhuyenMai.ThemKM(khuyenMai);
    }

  
    public void SuaKM(MaKhuyenMai khuyenMai) {
       MaKhuyenMai.SuaKM(khuyenMai);
    }

    public void XoaKM(String MaKM) {
       MaKhuyenMai.XoaKM(MaKM);
    }

    public MaKhuyenMai getKM(String makm) {
        return MaKhuyenMai.getKM(makm);
    }
}
