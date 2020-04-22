package cn.jiyun.pojo;

/**
 * @author shkstart
 * @user 祝继蒙
 * @date 2020/4/22 - 12:51
 */
public class Student {

    private Integer sid;
    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
