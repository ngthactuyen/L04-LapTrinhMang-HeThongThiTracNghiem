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
public class CauHoi {
    private int maCH;
    private int maMH;
    private String noidung;
    private String dapanA;
    private String dapanB;
    private String dapanC;
    private String dapanD;
    private String dapandung;

    public CauHoi() {
    }

    public CauHoi(int maCH, int maMH, String noidung, String dapanA, String dapanB, String dapanC, String dapanD, String dapandung) {
        this.maCH = maCH;
        this.maMH = maMH;
        this.noidung = noidung;
        this.dapanA = dapanA;
        this.dapanB = dapanB;
        this.dapanC = dapanC;
        this.dapanD = dapanD;
        this.dapandung = dapandung;
    }

    public int getMaCH() {
        return maCH;
    }

    public void setMaCH(int maCH) {
        this.maCH = maCH;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getDapanA() {
        return dapanA;
    }

    public void setDapanA(String dapanA) {
        this.dapanA = dapanA;
    }

    public String getDapanB() {
        return dapanB;
    }

    public void setDapanB(String dapanB) {
        this.dapanB = dapanB;
    }

    public String getDapanC() {
        return dapanC;
    }

    public void setDapanC(String dapanC) {
        this.dapanC = dapanC;
    }

    public String getDapanD() {
        return dapanD;
    }

    public void setDapanD(String dapanD) {
        this.dapanD = dapanD;
    }

    public String getDapandung() {
        return dapandung;
    }

    public void setDapandung(String dapandung) {
        this.dapandung = dapandung;
    }

    @Override
    public String toString() {
        return "CauHoi{" + "maCH=" + maCH + ", maMH=" + maMH + ", noidung=" + noidung + ", dapanA=" + dapanA + ", dapanB=" + dapanB + ", dapanC=" + dapanC + ", dapanD=" + dapanD + ", dapandung=" + dapandung + '}';
    }
    
}
