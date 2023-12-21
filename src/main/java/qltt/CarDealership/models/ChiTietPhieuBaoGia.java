package qltt.CarDealership.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "CTPHIEUBAOGIA")
public class ChiTietPhieuBaoGia {

    @Id
    @Column(name = "MaCTPBG", length = 10, nullable = false)
    private String maCTPBG;

    @Column(name = "MaPBG", length = 10)
    private String maPBG;

    @Column(name = "ThanhPhan", length = 20, nullable = false)
    private String thanhPhan;

    @Column(name = "DonGia", nullable = false)
    private float donGia;

    @Column(name = "MoTa", length = 50)
    private String moTa;

    // Constructors, getters, and setters

    public ChiTietPhieuBaoGia() {
        // Default constructor
    }

    public ChiTietPhieuBaoGia(String maCTPBG, String maPBG, String thanhPhan, float donGia, String moTa) {
        this.maCTPBG = maCTPBG;
        this.maPBG = maPBG;
        this.thanhPhan = thanhPhan;
        this.donGia = donGia;
        this.moTa = moTa;
    }

    // Getters and setters

    public String getMaCTPBG() {
        return maCTPBG;
    }

    public void setMaCTPBG(String maCTPBG) {
        this.maCTPBG = maCTPBG;
    }

    public String getMaPBG() {
        return maPBG;
    }

    public void setMaPBG(String maPBG) {
        this.maPBG = maPBG;
    }

    public String getThanhPhan() {
        return thanhPhan;
    }

    public void setThanhPhan(String thanhPhan) {
        this.thanhPhan = thanhPhan;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
