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
public class LoaiSanPhamService extends KhoService{

    private final static String TABLE_NAME = "tb_loai_san_pham";
    private final static String COL_ID = "id";
    private final static String COL_NAME = "name";
    private final static String COL_NOTE = "note";

    
    public LoaiSanPhamService() {
    }

    public ResultSet getDataAll() {
        try {
            String sql = String.format("SELECT %s, %s, %s FROM %s",
                    LoaiSanPhamService.COL_ID,
                    LoaiSanPhamService.COL_NAME,
                    LoaiSanPhamService.COL_NOTE,
                    LoaiSanPhamService.TABLE_NAME);
            return getData(sql);
        } finally {
        }
    }

    public ResultSet getDataById(String id) {
        String sql = String.format("SELECT %s, %s, %s FROM %s WHERE %s = '%s'",
                LoaiSanPhamService.COL_ID,
                LoaiSanPhamService.COL_NAME,
                LoaiSanPhamService.COL_NOTE,
                LoaiSanPhamService.TABLE_NAME,
                LoaiSanPhamService.COL_ID,
                id);
        return getData(sql);
    }

    public ResultSet getDataByName(String name) {
        String sql = String.format("SELECT %s, %s, %s FROM %s WHERE %s = N'%s'",
                LoaiSanPhamService.COL_ID,
                LoaiSanPhamService.COL_NAME,
                LoaiSanPhamService.COL_NOTE,
                LoaiSanPhamService.TABLE_NAME,
                LoaiSanPhamService.COL_NAME,
                name);
        return getData(sql);
    }

    public int insertData(String id, String name, String note) {
        try {
            String sql = String.format("INSERT INTO %s (%s, %s, %s) VALUES (N'%s', N'%s', N'%s')",
                    LoaiSanPhamService.TABLE_NAME,
                    LoaiSanPhamService.COL_ID,
                    LoaiSanPhamService.COL_NAME,
                    LoaiSanPhamService.COL_NOTE,
                    id, name, note);
            return updateData(sql);
        } finally {
        }
    }

    public int updateData(String id, String name, String note) {
        try {
            String sql = String.format("UPDATE %s SET %s=N'%s', %s=N'%s' WHERE %s='%s'",
                    LoaiSanPhamService.TABLE_NAME,
                    LoaiSanPhamService.COL_NAME, name,
                    LoaiSanPhamService.COL_NOTE, note,
                    LoaiSanPhamService.COL_ID, id);
            return updateData(sql);
        } finally {
        }
    }

    public int deleteDataById(String id) {
        try {
            String sql = String.format("DELETE FROM %s WHERE %s = '%s'",
                    LoaiSanPhamService.TABLE_NAME,
                    LoaiSanPhamService.COL_ID, id);
            return updateData(sql);
        } finally {
        }
    }

    public int deleteDataByName(String name) {
        try {
            String sql = String.format("DELETE FROM %s WHERE %s = N'%s'",
                    LoaiSanPhamService.TABLE_NAME,
                    LoaiSanPhamService.COL_NAME, name);
            return updateData(sql);
        } finally {
        }
    }
}
