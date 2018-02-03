package okkpp.model.economics;

import java.util.Date;

/**
 * ��������ƽ�۷�����Ĺ��񾭼ú�����Ҫָ��
 Main Economic Indicators of National Accounts Based on PPP
 * 
 * @author wcyong
 * 
 * @date 2018-02-03
 */
public class IndicatorsOfNA {
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
     * ����������ֵ���ּ��ڹ���Ԫ��
     */
    private Integer gdp;

    /**
     * �˾�����������ֵ(�ּ۹���Ԫ)
     */
    private Integer gdppc;

    /**
     * ���������루�ּ��ڹ���Ԫ��
     */
    private Integer gni;

    /**
     * �˾�����������(�ּ۹���Ԫ)
     */
    private Integer gnipc;

    /**
     * ��������
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