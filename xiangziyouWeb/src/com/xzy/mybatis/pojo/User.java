package com.xzy.mybatis.pojo;

public class User {
	
    @Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

	private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}