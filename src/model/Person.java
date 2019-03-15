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
public class Person {
    private String id;
    private String matkhau;
    private String hoten;

    public Person() {
    }

    public Person(String id, String matkhau, String hoten) {
        this.id = id;
        this.matkhau = matkhau;
        this.hoten = hoten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", matkhau=" + matkhau + ", hoten=" + hoten + '}';
    }
    
    
}
