/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykho.services;

import java.sql.ResultSet;

/**
 *
 * @author hasu
 */
public class SanPhamService extends KhoService{

    private static final String TABLE_NAME = "tb_san_pham";
    private static final String COL_ID = "id";
    private static final String COL_NAME = "name";
    private static final String COL_ID_LOAI_SP = "id_loai_san_pham";
    private static final String COL_ID_NHA_CC = "id_nha_cung_cap";
    private static final String COL_NGAY_NHAP = "ngay_nhap";
    private static final String COL_SO_LUONG = "so_luong";
    private static final String COL_DON_GIA = "don_gia";
    private static final String COL_NOTE = "note";

    public SanPhamService() {
    }

    public ResultSet getDataAll() {
        try {
            String sql = String.format("SELECT %s, %s, %s, %s, %s, %s, %s, %s FROM %s",
                    SanPhamService.COL_ID,
                    SanPhamService.COL_NAME,
                    SanPhamService.COL_ID_LOAI_SP,
                    SanPhamService.COL_ID_NHA_CC,
                    SanPhamService.COL_NGAY_NHAP,
                    SanPhamService.COL_SO_LUONG,
                    SanPhamService.COL_DON_GIA,
                    SanPhamService.COL_NOTE,
                    SanPhamService.TABLE_NAME);
            return getData(sql);
        } finally {
        }
    }

    public ResultSet getDataById(String id) {
        String sql = String.format("SELECT %s, %s, %s, %s, %s, %s, %s, %s FROM %s WHERE %s = '%s'",
                SanPhamService.COL_ID,
                SanPhamService.COL_NAME,
                SanPhamService.COL_ID_LOAI_SP,
                SanPhamService.COL_ID_NHA_CC,
                SanPhamService.COL_NGAY_NHAP,
                SanPhamService.COL_SO_LUONG,
                SanPhamService.COL_DON_GIA,
                SanPhamService.COL_NOTE,
                SanPhamService.TABLE_NAME,
                SanPhamService.COL_ID,
                id);
        connectDB();
        return getData(sql);
    }
}
