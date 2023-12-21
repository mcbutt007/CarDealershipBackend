package qltt.CarDealership.models;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "PHIEUXUAT")
public class PhieuXuat {

    @Id
    @Column(name = "MaPX", length = 10, nullable = false)
    private String maPX;

    @Column(name = "MaXe", length = 10)
    private String maXe;

    @Column(name = "NgayXuat", nullable = false)
    private Date ngayXuat;

    // Constructors, getters, and setters

    public PhieuXuat() {
        // Default constructor
    }

    public PhieuXuat(String maPX, String maXe, Date ngayXuat) {
        this.maPX = maPX;
        this.maXe = maXe;
        this.ngayXuat = ngayXuat;
    }

    // Getters and setters

    public String getMaPX() {
        return maPX;
    }

    public void setMaPX(String maPX) {
        this.maPX = maPX;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }
}
