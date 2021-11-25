package com.android45.danhsachmonan;

public class Mon_an {
   private String name;
   private String mota;
   private String gia;
    private  int anh;

    public Mon_an(String name, String mota, String gia, int anh) {
        this.name = name;
        this.mota = mota;
        this.gia = gia;
        this.anh = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
