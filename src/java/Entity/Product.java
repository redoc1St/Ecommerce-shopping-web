package Entity;

public class Product {

    private int id;
    private String pname;
    private double price;
    private String img;
    private String img2;
    private String desc;
    private int cid;
    private int salePer;
    private int newPro;

    public Product() {
    }

    public Product(int id, String pname, double price, String img, String img2, String desc, int cid, int newPro, int SalePricePercent) {
        this.id = id;
        this.pname = pname;
        this.price = price;
        this.img = img;
        this.img2 = img2;
        this.desc = desc;
        this.cid = cid;
        this.newPro = newPro;
        this.salePer = SalePricePercent;
    }

//    public Product(String string, String string0, String string1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getNewPro() {
        return newPro;
    }

    public void setNewPro(int newPro) {
        this.newPro = newPro;
    }

    public int getSalePer() {
        return salePer;
    }

    public void setSalePer(int SalePer) {
        this.salePer = SalePer;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", pname=" + pname + ", price=" + price + ", img=" + img + ", img2=" + img2 + ", desc=" + desc + ", cid=" + cid + ", newPro=" + newPro + ", SalePricePercent=" + salePer + '}';
    }

}
