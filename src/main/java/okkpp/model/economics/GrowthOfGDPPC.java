package okkpp.model.economics;

import java.util.Date;

/**
 * 人均国内生产总值增长率
 * 
 * @author wcyong
 * 
 * @date 2018-02-03
 */
public class GrowthOfGDPPC {
    private Integer id;

    /**
     * 国家编码
     */
    private String country;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 人均国内生产总值增长率(%)
     */
    private Double rate;

    /**
     * 更新日期
     */
    private Date update;

    /**
     * 排序
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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
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