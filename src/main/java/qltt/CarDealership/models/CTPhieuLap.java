package qltt.CarDealership.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CTPhieuLap {

    @Id
    private String MaCTPN; // Primary Key

    @ManyToOne
    @JoinColumn(name = "MaPhieuNhap")
    private PhieuLap phieuNhap;

    @ManyToOne
    @JoinColumn(name = "MaXe")
    private Xe xe;

    private int SoLuong;
    private double DonGia;
    private double ThanhTien;

    // Constructors, getters, and setters

    public CTPhieuLap() {
        // Default constructor
    }

    public CTPhieuLap(String maCTPN, PhieuLap phieuNhap, Xe xe, int soLuong, double donGia, double thanhTien) {
        MaCTPN = maCTPN;
        this.phieuNhap = phieuNhap;
        this.xe = xe;
        SoLuong = soLuong;
        DonGia = donGia;
        ThanhTien = thanhTien;
    }

    // Getters and setters

    public String getMaCTPN() {
        return MaCTPN;
    }

    public void setMaCTPN(String maCTPN) {
        MaCTPN = maCTPN;
    }

    public PhieuLap getPhieuNhap() {
        return phieuNhap;
    }

    public void setPhieuNhap(PhieuLap phieuNhap) {
        this.phieuNhap = phieuNhap;
    }

    public Xe getXe() {
        return xe;
    }

    public void setXe(Xe xe) {
        this.xe = xe;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double thanhTien) {
        ThanhTien = thanhTien;
    }
}

