package com.xhfk.scatter.api.base.vo;

import java.io.Serializable;

public class TagVO implements Serializable {
    private static final long serialVersionUID = 5473365348271169252L;

    private Integer id;
    private String tagname;
    private String icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
