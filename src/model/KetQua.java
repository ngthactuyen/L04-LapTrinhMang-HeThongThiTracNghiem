/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tuyen
 */
public class KetQua {
    private String maSV;
    private int maMH;
    private float diem;

    public KetQua() {
    }

    public KetQua(String maSV, int maMH, float diem) {
        this.maSV = maSV;
        this.maMH = maMH;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "KetQua{" + "maSV=" + maSV + ", maMH=" + maMH + ", diem=" + diem + '}';
    }
    
}
