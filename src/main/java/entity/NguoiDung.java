package entity;

public class NguoiDung {
    private String tentaikhoan;

    private String password;

    private Integer role;

    public Integer getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }
    public NguoiDung(){

    }

    public NguoiDung(String tentaikhoan, String password, Integer role){
        this.tentaikhoan = tentaikhoan;
        this.password = password;
        this.role = role;
    }
}
