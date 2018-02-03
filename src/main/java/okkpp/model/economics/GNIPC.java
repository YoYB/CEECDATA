package okkpp.model.economics;

import java.util.Date;

/**
 * �˾����������루��Ԫ��
GNI per Capita��USD��
 * 
 * @author wcyong
 * 
 * @date 2018-02-03
 */
public class GNIPC {
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
     * �˾�����������(��Ԫ)
     */
    private Integer gni;

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

    public Integer getGni() {
        return gni;
    }

    public void setGni(Integer gni) {
        this.gni = gni;
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