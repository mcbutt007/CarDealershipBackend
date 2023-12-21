package qltt.CarDealership.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PHIEUBAOGIA")
public class PhieuBaoGia {

    @Id
    @Column(name = "MaPBG", length = 10, nullable = false)
    private String maPBG;

    @Column(name = "MaKH", length = 10)
    private String maKH;

    @Column(name = "MaXe", length = 10)
    private String maXe;

    @Column(name = "NgayBG", nullable = false)
    private Date ngayBG;

    @Column(name = "TongGiaTri", nullable = false)
    private float tongGiaTri;

    @Column(name = "MaNV", length = 10)
    private String maNV;

    // Constructors, getters, and setters

    public PhieuBaoGia() {
        // Default constructor
    }

    public PhieuBaoGia(String maPBG, String maKH, String maXe, Date ngayBG, float tongGiaTri, String maNV) {
        this.maPBG = maPBG;
        this.maKH = maKH;
        this.maXe = maXe;
        this.ngayBG = ngayBG;
        this.tongGiaTri = tongGiaTri;
        this.maNV = maNV;
    }

    // Getters and setters

    public String getMaPBG() {
        return maPBG;
    }

    public void setMaPBG(String maPBG) {
        this.maPBG = maPBG;
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

    public Date getNgayBG() {
        return ngayBG;
    }

    public void setNgayBG(Date ngayBG) {
        this.ngayBG = ngayBG;
    }

    public float getTongGiaTri() {
        return tongGiaTri;
    }

    public void setTongGiaTri(float tongGiaTri) {
        this.tongGiaTri = tongGiaTri;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
}
