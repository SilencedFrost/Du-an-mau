/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author thnrg
 */
public class NhanVien {
    protected String MaNV;
    protected String HoTen;
    protected boolean VaiTro;

    public String getMaNV() {
        return MaNV;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }
    
    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }
}
