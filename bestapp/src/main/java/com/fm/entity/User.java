package com.fm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fm.base.entity.BaseEntity;

@Entity
public class User extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long sj;//�ֻ�
	
	private String mm;//����
	
	private String nxdb;//���Ķ���
	
	private String nc;//�ǳ�
	
	private String gzdq;//��������
	
	private Integer nl;//����
	
	private Integer sg;//���
	
	private Integer ysr;//������
	
	private String xl;//ѧ��
	
	private Integer hyzk;//����״��
	
	private Integer zhzk;//ס��״��
	
	private Integer mczk;//��״��
	
	private String zy;//ְҵ
	
	private String xz;//����
	
	private String mz;//����
	
	private String jg;//����
	
	private Integer tz;//����
	
	private Integer sfxyxh;//�Ƿ���ҪС��
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "wid")//join �����ű��;����������ű�
	private MyWant want;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSj() {
		return sj;
	}

	public void setSj(Long sj) {
		this.sj = sj;
	}

	public String getMm() {
		return mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	public String getNxdb() {
		return nxdb;
	}

	public void setNxdb(String nxdb) {
		this.nxdb = nxdb;
	}

	public String getNc() {
		return nc;
	}

	public void setNc(String nc) {
		this.nc = nc;
	}

	public String getGzdq() {
		return gzdq;
	}

	public void setGzdq(String gzdq) {
		this.gzdq = gzdq;
	}

	public Integer getNl() {
		return nl;
	}

	public void setNl(Integer nl) {
		this.nl = nl;
	}

	public Integer getSg() {
		return sg;
	}

	public void setSg(Integer sg) {
		this.sg = sg;
	}

	public Integer getYsr() {
		return ysr;
	}

	public void setYsr(Integer ysr) {
		this.ysr = ysr;
	}

	public String getXl() {
		return xl;
	}

	public void setXl(String xl) {
		this.xl = xl;
	}

	public Integer getHyzk() {
		return hyzk;
	}

	public void setHyzk(Integer hyzk) {
		this.hyzk = hyzk;
	}

	public Integer getZhzk() {
		return zhzk;
	}

	public void setZhzk(Integer zhzk) {
		this.zhzk = zhzk;
	}

	public Integer getMczk() {
		return mczk;
	}

	public void setMczk(Integer mczk) {
		this.mczk = mczk;
	}

	public String getZy() {
		return zy;
	}

	public void setZy(String zy) {
		this.zy = zy;
	}

	public String getXz() {
		return xz;
	}

	public void setXz(String xz) {
		this.xz = xz;
	}

	public String getMz() {
		return mz;
	}

	public void setMz(String mz) {
		this.mz = mz;
	}

	public String getJg() {
		return jg;
	}

	public void setJg(String jg) {
		this.jg = jg;
	}

	public Integer getTz() {
		return tz;
	}

	public void setTz(Integer tz) {
		this.tz = tz;
	}

	public Integer getSfxyxh() {
		return sfxyxh;
	}

	public void setSfxyxh(Integer sfxyxh) {
		this.sfxyxh = sfxyxh;
	}

	public MyWant getWant() {
		return want;
	}

	public void setWant(MyWant want) {
		this.want = want;
	}
	

}

