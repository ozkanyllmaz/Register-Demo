package entity;

public class User {
    private int userid;
    private String username_first;
    private String username_last;
    private String useremail;
    private String userpassword;

    public User(){

    }

    public User(String username_first, String username_last, String useremail, String userpassword) {
        this.username_first = username_first;
        this.username_last = username_last;
        this.useremail = useremail;
        this.userpassword = userpassword;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername_first() {
        return username_first;
    }

    public void setUsername_first(String username_first) {
        this.username_first = username_first;
    }

    public String getUsername_last() {
        return username_last;
    }

    public void setUsername_last(String username_last) {
        this.username_last = username_last;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username_first='" + username_first + '\'' +
                ", username_last='" + username_last + '\'' +
                ", useremail='" + useremail + '\'' +
                ", userpassword='" + userpassword + '\'' +
                '}';
    }
}
