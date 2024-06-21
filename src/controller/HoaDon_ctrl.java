/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import static Controller.Oracle.con;
import java.sql.SQLException;
import java.util.ArrayList;
import model.HoaDon;


/**
 *
 * @author 21522
 */
public class HoaDon_ctrl {

    public int TaoHoaDon(String MANV, String MATV, float TONGTIEN, String MAKM, long DTL) {
      return HoaDon.TaoHoaDon(MANV, MATV, TONGTIEN, MAKM, DTL);
    }

    public static ArrayList<HoaDon> getAllHoaDon() {
       return HoaDon.getAllHoaDon();

    }

    public static HoaDon getHoaDon(int sohd) {
       return HoaDon.getHoaDon(sohd);
    }

    public boolean Tao_CTHD(String MASP, int SOHD, int SOLUONG, float THANHTIEN) {
        return HoaDon.Tao_CTHD(MASP, SOHD, SOLUONG, THANHTIEN);
    }

    public void hoadontheothang() throws SQLException {
        HoaDon.hoadontheothang();
    }

    public static ArrayList<HoaDon> timKiemHoaDon(String param) {
        return HoaDon.timKiemHoaDon(param);
    }

    public static void xoaHoaDon(int sohd) {
      HoaDon.xoaHoaDon(sohd);
    }

}
