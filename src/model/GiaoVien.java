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
public class GiaoVien extends Person{
    private int phanquyen;

    public GiaoVien() {
    }

    public GiaoVien(int phanquyen, String id, String matkhau, String hoten) {
        super(id, matkhau, hoten);
        this.phanquyen = phanquyen;
    }

    public int getPhanquyen() {
        return phanquyen;
    }

    public void setPhanquyen(int phanquyen) {
        this.phanquyen = phanquyen;
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "phanquyen=" + phanquyen + '}';
    }
    
}
