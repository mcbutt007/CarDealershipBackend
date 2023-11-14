package qltt.CarDealership.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class PhieuLap {

    @Id
    private String MaPhieuNhap; // Primary Key

    private Date NgayNhap;

    @ManyToOne
    @JoinColumn(name = "MaNCC")
    private NhaCungCap nhaCungCap;

    // Constructors, getters, and setters

    public PhieuLap() {
        // Default constructor
    }

    public PhieuLap(String maPhieuNhap, Date ngayNhap, NhaCungCap nhaCungCap) {
        MaPhieuNhap = maPhieuNhap;
        NgayNhap = ngayNhap;
        this.nhaCungCap = nhaCungCap;
    }

    // Getters and setters

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        MaPhieuNhap = maPhieuNhap;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        NgayNhap = ngayNhap;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
}
