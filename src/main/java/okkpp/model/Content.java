package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_content")
public class Content implements Serializable {
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
     * ����
     */
    @Column(name = "BT")
    private String bt;

    /**
     * ���
     */
    @Column(name = "LB")
    private String lb;

    /**
     * ����
     */
    @Column(name = "LJ")
    private String lj;

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
     * ��ȡ����
     *
     * @return BT - ����
     */
    public String getBT() {
        return bt;
    }

    /**
     * ���ñ���
     *
     * @param bt ����
     */
    public void setBT(String bt) {
        this.bt = bt;
    }

    /**
     * ��ȡ���
     *
     * @return LB - ���
     */
    public String getLB() {
        return lb;
    }

    /**
     * �������
     *
     * @param lb ���
     */
    public void setLB(String lb) {
        this.lb = lb;
    }

    /**
     * ��ȡ����
     *
     * @return LJ - ����
     */
    public String getLJ() {
        return lj;
    }

    /**
     * ��������
     *
     * @param lj ����
     */
    public void setLJ(String lj) {
        this.lj = lj;
    }
}