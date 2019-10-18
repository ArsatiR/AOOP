package test;


public class Kendaraan {
	
	private int ban;
	private String warna;
	
	public Kendaraan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kendaraan(int ban, String warna) {
		super();
		this.ban = ban;
		this.warna = warna;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public String getWarna() {
		return warna;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}
	
}
