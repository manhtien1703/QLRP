/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import model.DatVe;


/**
 *
 * @author 21522
 */
public class DatVe_ctrl {

    //Hàm lấy vị trí ghế đã đặt
    public ArrayList<String> ListGheDaDat(String MaSuatChieu) {
        return DatVe.ListGheDaDat(MaSuatChieu);
    }

    public boolean DatVe(String MAGHE, String MASC, int SOHD) {
        return DatVe.DatVe(MAGHE, MASC, SOHD);
    }

    public int KiemTraGhe(String MAGHE, String MASC) {
        return DatVe.KiemTraGhe(MAGHE, MASC);
    }
}
