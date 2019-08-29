package com.xzy.mybatis.pojo;

public class Datafile {
    private Integer iddatafile;

    private String filename;

    private Integer flag;

    public Integer getIddatafile() {
        return iddatafile;
    }

    public void setIddatafile(Integer iddatafile) {
        this.iddatafile = iddatafile;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}