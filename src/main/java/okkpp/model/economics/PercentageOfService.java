package okkpp.model.economics;

import java.util.Date;

/**
 * ����ҵ����ֵռ����������ֵ���أ�%��
Service as Percentage of GDP��%
 * 
 * @author wcyong
 * 
 * @date 2018-02-03
 */
public class PercentageOfService {
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
     * ����ҵռGDP����(%)
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