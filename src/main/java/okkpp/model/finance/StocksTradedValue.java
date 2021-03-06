package okkpp.model.finance;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_finance_stocks_traded_value")
public class StocksTradedValue implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 占国内生产总值比重
     */
    private Double percentage;

    /**
     * 股票交易周转率
     */
    private Double ratio;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 更新时间
     */
    private Date update;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获取占国内生产总值比重
     *
     * @return percentage - 占国内生产总值比重
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * 设置占国内生产总值比重
     *
     * @param percentage 占国内生产总值比重
     */
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * 获取股票交易周转率
     *
     * @return ratio - 股票交易周转率
     */
    public Double getRatio() {
        return ratio;
    }

    /**
     * 设置股票交易周转率
     *
     * @param ratio 股票交易周转率
     */
    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    /**
     * 获取序号
     *
     * @return sort - 序号
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置序号
     *
     * @param sort 序号
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取更新时间
     *
     * @return update - 更新时间
     */
    public Date getUpdate() {
        return update;
    }

    /**
     * 设置更新时间
     *
     * @param update 更新时间
     */
    public void setUpdate(Date update) {
        this.update = update;
    }
}