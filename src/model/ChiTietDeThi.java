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
public class ChiTietDeThi {
    private int maCH;
    private String maDT;

    public ChiTietDeThi() {
    }

    public ChiTietDeThi(int maCH, String maDT) {
        this.maCH = maCH;
        this.maDT = maDT;
    }

    public int getMaCH() {
        return maCH;
    }

    public void setMaCH(int maCH) {
        this.maCH = maCH;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    @Override
    public String toString() {
        return "ChiTietDeThi{" + "maCH=" + maCH + ", maDT=" + maDT + '}';
    }
    
}
