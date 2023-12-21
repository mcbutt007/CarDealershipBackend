package qltt.CarDealership.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "HOPDONGDATCOC")
public class HopDongDatCoc {

    @Id
    @Column(name = "MaHDDC", length = 10, nullable = false)
    private String maHDDC;

    @Column(name = "MaKH", length = 10)
    private String maKH;

    @Column(name = "MaXe", length = 10)
    private String maXe;

    @Column(name = "DieuKien", length = 40)
    private String dieuKien;

    @Column(name = "SoTienDC", nullable = false)
    private float soTienDC;

    @Column(name = "NgayNhanXe", nullable = false)
    private Date ngayNhanXe;

    // Constructors, getters, and setters

    public HopDongDatCoc() {
        // Default constructor
    }

    public HopDongDatCoc(String maHDDC, String maKH, String maXe, String dieuKien, float soTienDC, Date ngayNhanXe) {
        this.maHDDC = maHDDC;
        this.maKH = maKH;
        this.maXe = maXe;
        this.dieuKien = dieuKien;
        this.soTienDC = soTienDC;
        this.ngayNhanXe = ngayNhanXe;
    }

    // Getters and setters

    public String getMaHDDC() {
        return maHDDC;
    }

    public void setMaHDDC(String maHDDC) {
        this.maHDDC = maHDDC;
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

    public String getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(String dieuKien) {
        this.dieuKien = dieuKien;
    }

    public float getSoTienDC() {
        return soTienDC;
    }

    public void setSoTienDC(float soTienDC) {
        this.soTienDC = soTienDC;
    }

    public Date getNgayNhanXe() {
        return ngayNhanXe;
    }

    public void setNgayNhanXe(Date ngayNhanXe) {
        this.ngayNhanXe = ngayNhanXe;
    }
}
