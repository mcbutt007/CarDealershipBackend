package qltt.CarDealership.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "KHUYENMAI")
public class KhuyenMai {

    @Id
    @Column(name = "MaKM", length = 10, nullable = false)
    private String maKM;

    @Column(name = "TenKM", length = 20)
    private String tenKM;

    @Column(name = "PhanTram", nullable = false)
    private int phanTram;

    @Column(name = "MoTa", length = 40)
    private String moTa;

    @Column(name = "NgayBD", nullable = false)
    private Date ngayBD;

    @Column(name = "NgayKT", nullable = false)
    private Date ngayKT;

    // Constructors, getters, and setters

    public KhuyenMai() {
        // Default constructor
    }

    public KhuyenMai(String maKM, String tenKM, int phanTram, String moTa, Date ngayBD, Date ngayKT) {
        this.maKM = maKM;
        this.tenKM = tenKM;
        this.phanTram = phanTram;
        this.moTa = moTa;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    // Getters and setters

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public int getPhanTram() {
        return phanTram;
    }

    public void setPhanTram(int phanTram) {
        this.phanTram = phanTram;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }
}
