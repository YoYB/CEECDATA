package okkpp.model.economics;

import java.util.Date;

/**
 * ũҵ����ֵռ����������ֵ���أ�%��
Agriculture as Percentage of GDP��%��
 * 
 * @author wcyong
 * 
 * @date 2018-02-03
 */
public class PercentageOfAgriculture {
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
     * ũҵռGDP����(%)
     */
    private Double percentage;

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

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
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