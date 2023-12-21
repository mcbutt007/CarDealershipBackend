package qltt.CarDealership.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PHIEUBAOHANH")
public class PhieuBaoHanh {

    @Id
    @Column(name = "MaPBH", length = 10, nullable = false)
    private String maPBH;

    @Column(name = "MaKH", length = 10)
    private String maKH;

    @Column(name = "MaXe", length = 10)
    private String maXe;

    @Column(name = "NgayLap", nullable = false)
    private Date ngayLap;

    // Constructors, getters, and setters

    public PhieuBaoHanh() {
        // Default constructor
    }

    public PhieuBaoHanh(String maPBH, String maKH, String maXe, Date ngayLap) {
        this.maPBH = maPBH;
        this.maKH = maKH;
        this.maXe = maXe;
        this.ngayLap = ngayLap;
    }

    // Getters and setters

    public String getMaPBH() {
        return maPBH;
    }

    public void setMaPBH(String maPBH) {
        this.maPBH = maPBH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }
}
