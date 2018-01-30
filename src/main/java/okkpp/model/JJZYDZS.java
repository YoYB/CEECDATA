package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_jjzydzs")
public class JJZYDZS implements Serializable {
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
     * �������ɶ�ָ��
     */
    @Column(name = "ZS")
    private Double zs;

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
     * ��ȡ�������ɶ�ָ��
     *
     * @return ZS - �������ɶ�ָ��
     */
    public Double getZS() {
        return zs;
    }

    /**
     * ���þ������ɶ�ָ��
     *
     * @param zs �������ɶ�ָ��
     */
    public void setZS(Double zs) {
        this.zs = zs;
    }
}