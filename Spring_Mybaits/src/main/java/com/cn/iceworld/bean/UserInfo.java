package com.cn.iceworld.bean;

import java.io.Serializable;

public class UserInfo implements  Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2922045895617295753L;

	private Long id;

    private String loginname;

    private String password;

    private String salt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
}