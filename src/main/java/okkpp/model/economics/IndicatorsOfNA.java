package okkpp.model.economics;

import java.util.Date;

/**
 * 按购买力平价法计算的国民经济核算主要指标
 Main Economic Indicators of National Accounts Based on PPP
 * 
 * @author wcyong
 * 
 * @date 2018-02-03
 */
public class IndicatorsOfNA {
    private Integer id;

    /**
     * 国家代码
     */
    private String country;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 国内生产总值（现价亿国际元）
     */
    private Integer gdp;

    /**
     * 人均国民生产总值(现价国际元)
     */
    private Integer gdppc;

    /**
     * 国民总收入（现价亿国际元）
     */
    private Integer gni;

    /**
     * 人均国民总收入(现价国际元)
     */
    private Integer gnipc;

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

    public Integer getGdp() {
        return gdp;
    }

    public void setGdp(Integer gdp) {
        this.gdp = gdp;
    }

    public Integer getGdppc() {
        return gdppc;
    }

    public void setGdppc(Integer gdppc) {
        this.gdppc = gdppc;
    }

    public Integer getGni() {
        return gni;
    }

    public void setGni(Integer gni) {
        this.gni = gni;
    }

    public Integer getGnipc() {
        return gnipc;
    }

    public void setGnipc(Integer gnipc) {
        this.gnipc = gnipc;
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