package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_shhj")
public class SHHJ implements Serializable {
    @Id
    private Integer id;

    @Column(name = "GJ")
    private String gj;

    @Column(name = "GJDM")
    private String gjdm;

    @Column(name = "NF")
    private String nf;

    /**
     * 65�꼰�����˿�ռ��
     */
    @Column(name = "NL65ZB")
    private Double nl65zb;

    /**
     * �Ͷ����˿�
     */
    @Column(name = "LDLRK")
    private Integer ldlrk;

    /**
     * �Ͷ����˿�ռ��
     */
    @Column(name = "LDLRKZB")
    private Double ldlrkzb;

    /**
     * �˿��ܶ�
     */
    @Column(name = "RKMD")
    private Double rkmd;

    /**
     * ���˿�
     */
    @Column(name = "ZRK")
    private Integer zrk;

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
     * @return GJ
     */
    public String getGJ() {
        return gj;
    }

    /**
     * @param gj
     */
    public void setGJ(String gj) {
        this.gj = gj;
    }

    /**
     * @return GJDM
     */
    public String getGJDM() {
        return gjdm;
    }

    /**
     * @param gjdm
     */
    public void setGJDM(String gjdm) {
        this.gjdm = gjdm;
    }

    /**
     * @return NF
     */
    public String getNF() {
        return nf;
    }

    /**
     * @param nf
     */
    public void setNF(String nf) {
        this.nf = nf;
    }

    /**
     * ��ȡ65�꼰�����˿�ռ��
     *
     * @return NL65ZB - 65�꼰�����˿�ռ��
     */
    public Double getNL65ZB() {
        return nl65zb;
    }

    /**
     * ����65�꼰�����˿�ռ��
     *
     * @param nl65zb 65�꼰�����˿�ռ��
     */
    public void setNL65ZB(Double nl65zb) {
        this.nl65zb = nl65zb;
    }

    /**
     * ��ȡ�Ͷ����˿�
     *
     * @return LDLRK - �Ͷ����˿�
     */
    public Integer getLDLRK() {
        return ldlrk;
    }

    /**
     * �����Ͷ����˿�
     *
     * @param ldlrk �Ͷ����˿�
     */
    public void setLDLRK(Integer ldlrk) {
        this.ldlrk = ldlrk;
    }

    /**
     * ��ȡ�Ͷ����˿�ռ��
     *
     * @return LDLRKZB - �Ͷ����˿�ռ��
     */
    public Double getLDLRKZB() {
        return ldlrkzb;
    }

    /**
     * �����Ͷ����˿�ռ��
     *
     * @param ldlrkzb �Ͷ����˿�ռ��
     */
    public void setLDLRKZB(Double ldlrkzb) {
        this.ldlrkzb = ldlrkzb;
    }

    /**
     * ��ȡ�˿��ܶ�
     *
     * @return RKMD - �˿��ܶ�
     */
    public Double getRKMD() {
        return rkmd;
    }

    /**
     * �����˿��ܶ�
     *
     * @param rkmd �˿��ܶ�
     */
    public void setRKMD(Double rkmd) {
        this.rkmd = rkmd;
    }

    /**
     * ��ȡ���˿�
     *
     * @return ZRK - ���˿�
     */
    public Integer getZRK() {
        return zrk;
    }

    /**
     * �������˿�
     *
     * @param zrk ���˿�
     */
    public void setZRK(Integer zrk) {
        this.zrk = zrk;
    }
}