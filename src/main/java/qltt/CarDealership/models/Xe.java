package qltt.CarDealership.models;


import jakarta.persistence.*;

@Entity
@Table(name = "XE")
public class Xe {

    @Id
    @Column(name = "MaXe", length = 10, nullable = false)
    private String maXe;

    @Column(name = "LoaiXe", length = 10, nullable = false)
    private String loaiXe;

    @Column(name = "Hang", length = 10, nullable = false)
    private String hang;

    @Column(name = "Gia", nullable = false)
    private float gia;

    @Column(name = "SoLuong", nullable = false)
    private int soLuong;

    @Column(name = "TenXe", length = 20, nullable = false)
    private String tenXe;

    @Column(name = "ThongSo", columnDefinition = "text")
    private String thongSo;

    // Constructors, getters, and setters

    public Xe() {
        // Default constructor
    }

    public Xe(String maXe, String loaiXe, String hang, float gia, int soLuong, String tenXe, String thongSo) {
        this.maXe = maXe;
        this.loaiXe = loaiXe;
        this.hang = hang;
        this.gia = gia;
        this.soLuong = soLuong;
        this.tenXe = tenXe;
        this.thongSo = thongSo;
    }

    // Getters and setters

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getThongSo() {
        return thongSo;
    }

    public void setThongSo(String thongSo) {
        this.thongSo = thongSo;
    }
}