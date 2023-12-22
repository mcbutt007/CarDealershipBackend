package qltt.CarDealership.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "PHIEUNHAP")
public class PhieuNhap {

    @Id
    @Column(name = "MaPN", length = 10, nullable = false)
    private String maPN;

    @Column(name = "NgayNhap")
    private Date ngayNhap;

    @Column(name = "MaNCC", length = 10)
    private String maNCC;

    @ManyToOne
    @JoinColumn(name = "MaNCC", referencedColumnName = "MaNCC", insertable = false, updatable = false)
    private NhaCungCap nhaCungCap;

    // Constructors, getters, and setters

    public PhieuNhap() {
        // Default constructor
    }

    public PhieuNhap(String maPN, Date ngayNhap, String maNCC) {
        this.maPN = maPN;
        this.ngayNhap = ngayNhap;
        this.maNCC = maNCC;
    }

    // Getters and setters

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
}

