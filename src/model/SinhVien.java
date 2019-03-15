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
public class SinhVien extends Person{
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String lop, String id, String matkhau, String hoten) {
        super(id, matkhau, hoten);
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "lop=" + lop + '}';
    }
    
    
}
