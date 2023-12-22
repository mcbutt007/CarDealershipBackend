package qltt.CarDealership.models;


import jakarta.persistence.*;

@Entity
@Table(name = "KHACHHANG")
public class KhachHang {

    @Id
    @Column(name = "MaKH", length = 10, nullable = false)
    private String maKH;

    @Column(name = "TenKH", length = 20)
    private String tenKH;

    @Column(name = "SDT", length = 10)
    private String sdt;

    @Column(name = "Email", length = 20)
    private String email;

    @Column(name = "LoaiKH", length = 10)
    private String loaiKH;

    // Constructors, getters, and setters

    public KhachHang() {
        // Default constructor
    }

    public KhachHang(String maKH, String tenKH, String sdt, String email, String loaiKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.email = email;
        this.loaiKH = loaiKH;
    }

    // Getters and setters

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
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

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }
}
