package model;

public class LopHocPhan {
	private int idLopHocPhan;
	private String idMonHoc;
	private String tenMonHoc;
	private String nhomMonHoc;
	private int soTinChi;
	private String maLop;
	private String thu;
	private int kip;
	private String phong;
	private String tuan;
	private int soLuong;

	@Override
	public String toString() {
		return "LopHocPhan [idLopHocPhan=" + idLopHocPhan + ", idMonHoc=" + idMonHoc + ", tenMonHoc=" + tenMonHoc
				+ ", nhomMonHoc=" + nhomMonHoc + ", soTinChi=" + soTinChi + ", maLop=" + maLop + ", thu=" + thu
				+ ", kip=" + kip + ", phong=" + phong + ", tuan=" + tuan + ", soLuong=" + soLuong + "]";
	}
	public LopHocPhan(int idLopHocPhan, String idMonHoc, String tenMonHoc, String nhomMonHoc, int soTinChi, String maLop, String thu, int kip
			, String phong, String tuan, int soLuong) {
		super();
		this.idLopHocPhan = idLopHocPhan;
		this.idMonHoc = idMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.nhomMonHoc = nhomMonHoc;
		this.soTinChi = soTinChi;
		this.maLop = maLop;
		this.thu = thu;
		this.kip = kip;
		this.phong = phong;
		this.tuan = tuan;
		this.soLuong = soLuong;
	}
	public LopHocPhan() {
		super();
	}
	public int getIdLopHocPhan() {
		return idLopHocPhan;
	}

	public void setIdLopHocPhan(int idLopHocPhan) {
		this.idLopHocPhan = idLopHocPhan;
	}

	public String getIdMonHoc() {
		return idMonHoc;
	}

	public void setIdMonHoc(String idMonHoc) {
		this.idMonHoc = idMonHoc;
	}

	public String getTenMonHoc() {
		return tenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}

	public String getNhomMonHoc() {
		return nhomMonHoc;
	}

	public void setNhomMonHoc(String nhomMonHoc) {
		this.nhomMonHoc = nhomMonHoc;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}

	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public String getThu() {
		return thu;
	}

	public void setThu(String thu) {
		this.thu = thu;
	}

	public int getKip() {
		return kip;
	}

	public void setKip(int kip) {
		this.kip = kip;
	}

	public String getPhong() {
		return phong;
	}

	public void setPhong(String phong) {
		this.phong = phong;
	}

	public String getTuan() {
		return tuan;
	}

	public void setTuan(String tuan) {
		this.tuan = tuan;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	
}
