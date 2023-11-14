package qltt.CarDealership.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class NhaCungCap {
    @Id
    private String MaNCC; // Primary Key

    private String TenNCC;
    private String DiaChi;
    private String SDT;

    // Constructors, getters, and setters

    public NhaCungCap() {
        // Default constructor
    }

    public NhaCungCap(String maNCC, String tenNCC, String diaChi, String sdt) {
        MaNCC = maNCC;
        TenNCC = tenNCC;
        DiaChi = diaChi;
        SDT = sdt;
    }

    // Getters and setters

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String maNCC) {
        MaNCC = maNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String tenNCC) {
        TenNCC = tenNCC;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String sDT) {
        SDT = sDT;
    }
}
