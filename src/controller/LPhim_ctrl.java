/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import model.LPhim;

/**
 *
 * @author 21522
 */
public class LPhim_ctrl {

    //hàm lấy toàn bộ thông tin loại phim
    public List<LPhim> getAllLPhim() {
        return LPhim.getAllLPhim();
    }

    //hàm thêm loại phim
    public void ThemLP(LPhim lp) {
        LPhim.ThemLP(lp);
    }

    //hàm sửa loại phim
    public void SuaLP(LPhim lp) throws SQLException {
        LPhim.SuaLP(lp);
    }

    //hàm xoá loại phim
    public void XoaLP(String MaLP) {
        LPhim.XoaLP(MaLP);
    }
    
    public LPhim getLP(String malp) {
        
        return LPhim.getLP(malp);
    }
}
