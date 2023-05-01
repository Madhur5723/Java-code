//instance variable 
public class Product {
	private int id;
	private String prodname;
	private double prodprice;
	//parametric variables
	public Product(int id, String prodname, double prodprice) {
		super();
		this.id = id;
		this.prodname = prodname;
		this.prodprice = prodprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public Double getProdprice() {
		return prodprice;
	}
	public void setProdprice(double prodprice) {
		this.prodprice = prodprice;
	}
	
	

}
