package com.xzy.mybatis.pojo;

import java.util.Date;

public class ArealistInTrolley {
    @Override
	public String toString() {
		return "ArealistInTrolley [idarealistInTrolley=" + idarealistInTrolley + ", username=" + username + ", areaid="
				+ areaid + ", ap=" + ap + ", addtime=" + addtime + "]";
	}

	private Integer idarealistInTrolley;

    private String username;

    private Integer areaid;

    private String ap;

    private Date addtime;

    private Integer status;

    public Integer getIdarealistInTrolley() {
        return idarealistInTrolley;
    }

    public void setIdarealistInTrolley(Integer idarealistInTrolley) {
        this.idarealistInTrolley = idarealistInTrolley;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap == null ? null : ap.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}