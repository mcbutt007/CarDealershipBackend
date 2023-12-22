package qltt.CarDealership.models;

import jakarta.persistence.*;

@Entity
@Table(name = "NHACUNGCAP")
public class NhaCungCap {

    @Id
    @Column(name = "MaNCC", length = 10, nullable = false)
    private String maNCC;

    @Column(name = "TenNCC", length = 10, nullable = false)
    private String tenNCC;

    @Column(name = "DiaChi", length = 40, nullable = false)
    private String diaChi;

    @Column(name = "SDT", length = 10, nullable = false)
    private String sdt;

    // Constructors, getters, and setters

    public NhaCungCap() {
        // Default constructor
    }

    public NhaCungCap(String maNCC, String tenNCC, String diaChi, String sdt) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    // Getters and setters

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}

