package model;

/**
 * スタッフ情報クラス
 */
public class Staff {
    private String staffId; // スタッフID
    private String staffName; // スタッフ名
    private String loginPassword; // ログインパスワード

    public Staff(String staffId, String staffName, String loginPassword) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.loginPassword = loginPassword;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }



}