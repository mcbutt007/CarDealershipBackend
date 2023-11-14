package qltt.CarDealership.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class KhachHang {

    @Id
    private String MaKH; // Primary Key

    private String TenKhachHang;
    private String SoDienThoai;
    private String Email;
    private String LoaiKhachHang;

    // Constructors, getters, and setters

    public KhachHang() {
        // Default constructor
    }

    public KhachHang(String maKH, String tenKhachHang, String soDienThoai, String email, String loaiKhachHang) {
        MaKH = maKH;
        TenKhachHang = tenKhachHang;
        SoDienThoai = soDienThoai;
        Email = email;
        LoaiKhachHang = loaiKhachHang;
    }

    // Getters and setters

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLoaiKhachHang() {
        return LoaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        LoaiKhachHang = loaiKhachHang;
    }
}

