package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_gtmj")
public class GTMJ implements Serializable {
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
     * �������
     */
    @Column(name = "LB")
    private String lb;

    /**
     * ռ�����
     */
    @Column(name = "MJ")
    private Double mj;

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
     * ��ȡ�������
     *
     * @return LB - �������
     */
    public String getLB() {
        return lb;
    }

    /**
     * �����������
     *
     * @param lb �������
     */
    public void setLB(String lb) {
        this.lb = lb;
    }

    /**
     * ��ȡռ�����
     *
     * @return MJ - ռ�����
     */
    public Double getMJ() {
        return mj;
    }

    /**
     * ����ռ�����
     *
     * @param mj ռ�����
     */
    public void setMJ(Double mj) {
        this.mj = mj;
    }
}