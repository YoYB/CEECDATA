package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_myqk")
public class MYQK implements Serializable {
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
     * �·�
     */
    @Column(name = "YF")
    private String yf;

    /**
     * ���ڶ�
     */
    @Column(name = "CKE")
    private Double cke;

    /**
     * ���ڶ�
     */
    @Column(name = "JKE")
    private Double jke;

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
     * ��ȡ�·�
     *
     * @return YF - �·�
     */
    public String getYF() {
        return yf;
    }

    /**
     * �����·�
     *
     * @param yf �·�
     */
    public void setYF(String yf) {
        this.yf = yf;
    }

    /**
     * ��ȡ���ڶ�
     *
     * @return CKE - ���ڶ�
     */
    public Double getCKE() {
        return cke;
    }

    /**
     * ���ó��ڶ�
     *
     * @param cke ���ڶ�
     */
    public void setCKE(Double cke) {
        this.cke = cke;
    }

    /**
     * ��ȡ���ڶ�
     *
     * @return JKE - ���ڶ�
     */
    public Double getJKE() {
        return jke;
    }

    /**
     * ���ý��ڶ�
     *
     * @param jke ���ڶ�
     */
    public void setJKE(Double jke) {
        this.jke = jke;
    }
}