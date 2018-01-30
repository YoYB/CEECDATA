package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_yshj")
public class YSHJ implements Serializable {
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
     * ��Ŀ
     */
    @Column(name = "XM")
    private String xm;

    /**
     * ����
     */
    @Column(name = "MC")
    private Integer mc;

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
     * ��ȡ��Ŀ
     *
     * @return XM - ��Ŀ
     */
    public String getXM() {
        return xm;
    }

    /**
     * ������Ŀ
     *
     * @param xm ��Ŀ
     */
    public void setXM(String xm) {
        this.xm = xm;
    }

    /**
     * ��ȡ����
     *
     * @return MC - ����
     */
    public Integer getMC() {
        return mc;
    }

    /**
     * ��������
     *
     * @param mc ����
     */
    public void setMC(Integer mc) {
        this.mc = mc;
    }
}