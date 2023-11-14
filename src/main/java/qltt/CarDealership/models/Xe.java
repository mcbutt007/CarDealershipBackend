package qltt.CarDealership.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Xe {

    @Id
    private String MaXe; // Primary Key

    private String LoaiXe;
    private String Hang;
    private double Gia;
    private int SoLuong;
    private String ThongSo;

    // Constructors, getters, and setters

    public Xe() {
        // Default constructor
    }

    public Xe(String maXe, String loaiXe, String hang, double gia, int soLuong, String thongSo) {
        MaXe = maXe;
        LoaiXe = loaiXe;
        Hang = hang;
        Gia = gia;
        SoLuong = soLuong;
        ThongSo = thongSo;
    }

    // Getters and setters

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String maXe) {
        MaXe = maXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        LoaiXe = loaiXe;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String hang) {
        Hang = hang;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double gia) {
        Gia = gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public String getThongSo() {
        return ThongSo;
    }

    public void setThongSo(String thongSo) {
        ThongSo = thongSo;
    }
}

