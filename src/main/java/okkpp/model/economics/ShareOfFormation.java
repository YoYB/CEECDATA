package okkpp.model.economics;

import java.util.Date;

/**
 * �ʱ��γ��ܶ�
Share of the Contributions of Gross Capital Formation
 * 
 * @author wcyong
 * 
 * @date 2018-02-03
 */
public class ShareOfFormation {
    private Integer id;

    /**
     * ���Ҵ���
     */
    private String country;

    /**
     * ���
     */
    private Integer year;

    /**
     * �ʱ��γ��ܶ�(%)
     */
    private Double share;

    /**
     * ��λ
     */
    private String unit;

    /**
     * ����ʱ��
     */
    private Date update;

    /**
     * ����
     */
    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getShare() {
        return share;
    }

    public void setShare(Double share) {
        this.share = share;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}