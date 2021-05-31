package model;

public class KiHoc {
	private int idKiHoc;
	private String tenKiHoc;
	
	 

	public KiHoc(int idKiHoc, String tenKiHoc) {
		super();
		this.idKiHoc = idKiHoc;
		this.tenKiHoc = tenKiHoc;
	}

	public KiHoc() {
		super();
	}

	public int getIdKiHoc() {
		return idKiHoc;
	}

	public void setIdKiHoc(int idKiHoc) {
		this.idKiHoc = idKiHoc;
	}

	public String getTenKiHoc() {
		return tenKiHoc;
	}

	public void setTenKiHoc(String teKiHoc) {
		this.tenKiHoc = teKiHoc;
	}

}
