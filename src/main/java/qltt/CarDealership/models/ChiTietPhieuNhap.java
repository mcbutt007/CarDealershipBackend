package qltt.CarDealership.models;


import jakarta.persistence.*;

@Entity
@Table(name = "CTPHIEUNHAP")
public class ChiTietPhieuNhap {

    @Id
    @Column(name = "MaCTPN", length = 10, nullable = false)
    private String maCTPN;

    @Column(name = "MaPN", length = 10)
    private String maPN;

    @Column(name = "MaXe", length = 10)
    private String maXe;

    @Column(name = "SoLuong", nullable = false)
    private int soLuong;

    @Column(name = "DonGia", nullable = false)
    private float donGia;

    @Column(name = "ThanhTien", nullable = false)
    private float thanhTien;

    // Constructors, getters, and setters

    public ChiTietPhieuNhap() {
        // Default constructor
    }

    public ChiTietPhieuNhap(String maCTPN, String maPN, String maXe, int soLuong, float donGia, float thanhTien) {
        this.maCTPN = maCTPN;
        this.maPN = maPN;
        this.maXe = maXe;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    // Getters and setters

    public String getMaCTPN() {
        return maCTPN;
    }

    public void setMaCTPN(String maCTPN) {
        this.maCTPN = maCTPN;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }
}