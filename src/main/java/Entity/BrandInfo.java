package Entity;

public class BrandInfo {
    private String brandno;

    private String brandname;

    public String getBrandno() {
        return brandno;
    }

    public void setBrandno(String brandno) {
        this.brandno = brandno == null ? null : brandno.trim();
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }
}