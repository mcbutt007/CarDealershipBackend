package qltt.CarDealership.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "NHANVIEN")
public class NhanVien {

    @Id
    @Column(name = "MaNV", length = 10, nullable = false)
    private String maNV;

    @Column(name = "TenNV", length = 20, nullable = false)
    private String tenNV;

    @Column(name = "DiaChi", length = 10, nullable = false)
    private String diaChi;

    @Column(name = "SDT", length = 10, nullable = false)
    private String sdt;

    @Column(name = "Email", length = 20)
    private String email;

    @Column(name = "BangCap", length = 10)
    private String bangCap;

    @Column(name = "ViTri", length = 10, nullable = false)
    private String viTri;

    @Column(name = "NgayVL", nullable = false)
    private Date ngayVL;

    @Column(name = "NgaySinh", nullable = false)
    private Date ngaySinh;

    // Constructors, getters, and setters

    public NhanVien() {
        // Default constructor
    }

    public NhanVien(String maNV, String tenNV, String diaChi, String sdt, String email, String bangCap, String viTri, Date ngayVL, Date ngaySinh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.bangCap = bangCap;
        this.viTri = viTri;
        this.ngayVL = ngayVL;
        this.ngaySinh = ngaySinh;
    }

    // Getters and setters

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public Date getNgayVL() {
        return ngayVL;
    }

    public void setNgayVL(Date ngayVL) {
        this.ngayVL = ngayVL;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
