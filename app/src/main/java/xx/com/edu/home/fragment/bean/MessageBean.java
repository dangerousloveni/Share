package xx.com.edu.home.fragment.bean;

import java.io.Serializable;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODD}
 * @updateAuthor $Author$
 * @updateDes ${TODD}
 */
public class MessageBean implements Serializable {
    public int getIamgesID() {
        return iamgesID;
    }

    public void setIamgesID(int iamgesID) {
        this.iamgesID = iamgesID;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int iamgesID;
    private  String theme;
    private String content;
    private  String userName;
    private  String phoneNumber;

}
