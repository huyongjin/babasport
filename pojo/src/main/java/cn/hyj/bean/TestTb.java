package cn.hyj.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by huyongjin on 2016/12/30.
 */
public class TestTb implements Serializable{
    private static final long serialVersionUID = -2506478582623120579L;
    private Integer id;
    private String name;
    private Date birthday;

    @Override
    public String toString() {
        return "TestTb{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
