package www.lagou.entity;

import java.util.Date;

public class Phone {
    private Integer id;
    private String pname;
    private Double price;
    private Date prodate;
    private String color;

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", prodate=" + prodate +
                ", color='" + color + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getProdate() {
        return prodate;
    }

    public void setProdate(Date prodate) {
        this.prodate = prodate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Phone(Integer id, String pname, Double price, Date prodate, String color) {
        this.id = id;
        this.pname = pname;
        this.price = price;
        this.prodate = prodate;
        this.color = color;
    }
}
