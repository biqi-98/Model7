package www.lagou.entity;

import java.util.Date;

public class Transaction {
    private Integer id;
    private String cardid;
    private String tratype;
    private Double tramoney;
    private Date tradate;

    public Transaction(Integer id, String cardid, String tratype, Double tramoney, Date tradate) {
        this.id = id;
        this.cardid = cardid;
        this.tratype = tratype;
        this.tramoney = tramoney;
        this.tradate = tradate;
    }

    public Transaction() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getTratype() {
        return tratype;
    }

    public void setTratype(String tratype) {
        this.tratype = tratype;
    }

    public Double getTramoney() {
        return tramoney;
    }

    public void setTramoney(Double tramoney) {
        this.tramoney = tramoney;
    }

    public Date getTradate() {
        return tradate;
    }

    public void setTradate(Date tradate) {
        this.tradate = tradate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", cardid='" + cardid + '\'' +
                ", tratype='" + tratype + '\'' +
                ", tramoney=" + tramoney +
                ", tradate=" + tradate +
                '}';
    }
}
