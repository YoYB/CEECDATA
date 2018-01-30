package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_hgjj")
public class HGJJ implements Serializable {
    @Id
    private Integer id;

    /**
     * ����
     */
    @Column(name = "GJ")
    private String gj;

    /**
     * ���Ҵ���
     */
    @Column(name = "GJDM")
    private String gjdm;

    /**
     * ���
     */
    @Column(name = "NF")
    private String nf;

    /**
     * ��ֵ/��λ��ʮ����Ԫ
     */
    @Column(name = "GDP")
    private Double gdp;

    /**
     * ����ȸ���ֵ
     */
    @Column(name = "FJZ")
    private Double fjz;

    /**
     * �˾�GDP
     */
    @Column(name = "RJGDP")
    private Double rjgdp;

    /**
     * ͨ����
     */
    @Column(name = "TZL")
    private Double tzl;

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
     * ��ȡ����
     *
     * @return GJ - ����
     */
    public String getGJ() {
        return gj;
    }

    /**
     * ���ù���
     *
     * @param gj ����
     */
    public void setGJ(String gj) {
        this.gj = gj;
    }

    /**
     * ��ȡ���Ҵ���
     *
     * @return GJDM - ���Ҵ���
     */
    public String getGJDM() {
        return gjdm;
    }

    /**
     * ���ù��Ҵ���
     *
     * @param gjdm ���Ҵ���
     */
    public void setGJDM(String gjdm) {
        this.gjdm = gjdm;
    }

    /**
     * ��ȡ���
     *
     * @return NF - ���
     */
    public String getNF() {
        return nf;
    }

    /**
     * �������
     *
     * @param nf ���
     */
    public void setNF(String nf) {
        this.nf = nf;
    }

    /**
     * ��ȡ��ֵ/��λ��ʮ����Ԫ
     *
     * @return GDP - ��ֵ/��λ��ʮ����Ԫ
     */
    public Double getGDP() {
        return gdp;
    }

    /**
     * ���ò�ֵ/��λ��ʮ����Ԫ
     *
     * @param gdp ��ֵ/��λ��ʮ����Ԫ
     */
    public void setGDP(Double gdp) {
        this.gdp = gdp;
    }

    /**
     * ��ȡ����ȸ���ֵ
     *
     * @return FJZ - ����ȸ���ֵ
     */
    public Double getFJZ() {
        return fjz;
    }

    /**
     * ���÷���ȸ���ֵ
     *
     * @param fjz ����ȸ���ֵ
     */
    public void setFJZ(Double fjz) {
        this.fjz = fjz;
    }

    /**
     * ��ȡ�˾�GDP
     *
     * @return RJGDP - �˾�GDP
     */
    public Double getRJGDP() {
        return rjgdp;
    }

    /**
     * �����˾�GDP
     *
     * @param rjgdp �˾�GDP
     */
    public void setRJGDP(Double rjgdp) {
        this.rjgdp = rjgdp;
    }

    /**
     * ��ȡͨ����
     *
     * @return TZL - ͨ����
     */
    public Double getTZL() {
        return tzl;
    }

    /**
     * ����ͨ����
     *
     * @param tzl ͨ����
     */
    public void setTZL(Double tzl) {
        this.tzl = tzl;
    }
}