package model;

public class NganhHoc {
	private int id;
	private String ten;
	
	
	public NganhHoc(int id, String ten) {
		super();
		this.id = id;
		this.ten = ten;
	}
	
	public NganhHoc() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "NganhHoc [id=" + id + ", ten=" + ten + "]";
	}	
	
}
