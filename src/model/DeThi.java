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
public class DeThi {
    private String maDT;
    private int maMH;
    private int thoigianlammoicau;

    public DeThi() {
    }

    public DeThi(String maDT, int maMH, int thoigianlammoicau) {
        this.maDT = maDT;
        this.maMH = maMH;
        this.thoigianlammoicau = thoigianlammoicau;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public int getThoigianlammoicau() {
        return thoigianlammoicau;
    }

    public void setThoigianlammoicau(int thoigianlammoicau) {
        this.thoigianlammoicau = thoigianlammoicau;
    }

    @Override
    public String toString() {
        return "DeThi{" + "maDT=" + maDT + ", maMH=" + maMH + ", thoigianlammoicau=" + thoigianlammoicau + '}';
    }
    
}
