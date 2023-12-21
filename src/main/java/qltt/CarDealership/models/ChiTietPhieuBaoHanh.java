package qltt.CarDealership.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "CTPHIEUBAOHANH")
public class ChiTietPhieuBaoHanh {

    @Id
    @Column(name = "MaCTPBH", length = 10, nullable = false)
    private String maCTPBH;

    @Column(name = "MaPBH", length = 10)
    private String maPBH;

    @Column(name = "ThanhPhan", length = 20, nullable = false)
    private String thanhPhan;

    @Column(name = "MoTaLoi", length = 30)
    private String moTaLoi;

    // Constructors, getters, and setters

    public ChiTietPhieuBaoHanh() {
        // Default constructor
    }

    public ChiTietPhieuBaoHanh(String maCTPBH, String maPBH, String thanhPhan, String moTaLoi) {
        this.maCTPBH = maCTPBH;
        this.maPBH = maPBH;
        this.thanhPhan = thanhPhan;
        this.moTaLoi = moTaLoi;
    }

    // Getters and setters

    public String getMaCTPBH() {
        return maCTPBH;
    }

    public void setMaCTPBH(String maCTPBH) {
        this.maCTPBH = maCTPBH;
    }

    public String getMaPBH() {
        return maPBH;
    }

    public void setMaPBH(String maPBH) {
        this.maPBH = maPBH;
    }

    public String getThanhPhan() {
        return thanhPhan;
    }

    public void setThanhPhan(String thanhPhan) {
        this.thanhPhan = thanhPhan;
    }

    public String getMoTaLoi() {
        return moTaLoi;
    }

    public void setMoTaLoi(String moTaLoi) {
        this.moTaLoi = moTaLoi;
    }
}

