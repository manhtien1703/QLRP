/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Phim;

/**
 *
 * @author 21522
 */
public class Phim_ctrl {
    
    public static ArrayList<Phim> getAll(){
        return Phim.getAll();
    }

    public static void HienThiPhim(String maphim, model.LPhim lp, model.Phim p) {
        Phim.HienThiPhim(maphim, lp, p);
    }
}
