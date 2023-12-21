package qltt.CarDealership.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "HOPDONGMUAXE")
public class HopDongMuaXe {

    @Id
    @Column(name = "MaHDMX", length = 10, nullable = false)
    private String maHDMX;

    @Column(name = "MaPBG", length = 10)
    private String maPBG;

    @Column(name = "NgayKy", nullable = false)
    private Date ngayKy;

    @Column(name = "TongGiaTri", nullable = false)
    private float tongGiaTri;

    @Column(name = "PTTT", length = 10, nullable = false)
    private String pttt;

    @Column(name = "MaKM", length = 10)
    private String maKM;

    // Constructors, getters, and setters

    public HopDongMuaXe() {
        // Default constructor
    }

    public HopDongMuaXe(String maHDMX, String maPBG, Date ngayKy, float tongGiaTri, String pttt, String maKM) {
        this.maHDMX = maHDMX;
        this.maPBG = maPBG;
        this.ngayKy = ngayKy;
        this.tongGiaTri = tongGiaTri;
        this.pttt = pttt;
        this.maKM = maKM;
    }

    // Getters and setters

    public String getMaHDMX() {
        return maHDMX;
    }

    public void setMaHDMX(String maHDMX) {
        this.maHDMX = maHDMX;
    }

    public String getMaPBG() {
        return maPBG;
    }

    public void setMaPBG(String maPBG) {
        this.maPBG = maPBG;
    }

    public Date getNgayKy() {
        return ngayKy;
    }

    public void setNgayKy(Date ngayKy) {
        this.ngayKy = ngayKy;
    }

    public float getTongGiaTri() {
        return tongGiaTri;
    }

    public void setTongGiaTri(float tongGiaTri) {
        this.tongGiaTri = tongGiaTri;
    }

    public String getPttt() {
        return pttt;
    }

    public void setPttt(String pttt) {
        this.pttt = pttt;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }
}
