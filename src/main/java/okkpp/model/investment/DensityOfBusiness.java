package okkpp.model.investment;

import java.util.Date;

/**
 * ��ע����ҵ�ܶȣ�15��64���ÿ1000���е���ע�ᣩ
New Business Density
 * 
 * @author wcyong
 * 
 * @date 2018-02-09
 */
public class DensityOfBusiness {
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
     * ��ע����ҵ�ܶ�(��/����)
     */
    private Double density;

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

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
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