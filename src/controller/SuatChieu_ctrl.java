/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author 21522
 */
import javax.swing.JComboBox;
import javax.swing.JLabel;
import model.SuatChieu;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author 21522
 */
public class SuatChieu_ctrl {

    public static List<String> getAllMaRap() {
        return SuatChieu.getAllMaRap();
    }

    public List<SuatChieu> getAllLSuatChieu() {
        return SuatChieu.getAllLSuatChieu();
    }

    public boolean ThemSC(SuatChieu sc) {
        return SuatChieu.ThemSC(sc);
    }

    public boolean SuaSC(SuatChieu sc) {
        return SuatChieu.SuaSC(sc);
    }

    public void XoaSC(String MaSC) {
        SuatChieu.XoaSC(MaSC);

    }

    public SuatChieu getSC(String masc) {
        return SuatChieu.getSC(masc);
    }

    public Vector<String> ListNgayChieu() {
        return SuatChieu.ListNgayChieu();
    }

    public Vector<String> ListLoaiPhim(String NgayChieu) {
        return SuatChieu.ListLoaiPhim(NgayChieu);
    }

    public Vector<String> ListPhim(String NgayChieu, String LoaiPhim) {
        return SuatChieu.ListPhim(NgayChieu, LoaiPhim);
    }

    public Vector<String> ListThoiGianChieu(String NgayChieu, String LoaiPhim, String TenPhim) {
        return SuatChieu.ListThoiGianChieu(NgayChieu, LoaiPhim, TenPhim);
    }

    public String SuatChieuDaChon(String NgayChieu, String ThoiGianChieu, String TenPhim) {
        return SuatChieu.SuatChieuDaChon(NgayChieu, ThoiGianChieu, TenPhim);
    }

    public static void HienThiSuatChieu(String ngay, String maphim, SuatChieu sc, JComboBox cb) {
        SuatChieu.HienThiSuatChieu(ngay, maphim, sc, cb);
    }

    public static void HienThiSlot(String ngay, String thoigian, String maphim, JLabel lb) {
        SuatChieu.HienThiSlot(ngay, thoigian, maphim, lb);
        ;
    }

}
