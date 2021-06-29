package HrmManagement.Resume;

public class Contract {
    private String facebook;
    private long mobile;
    private String linkedin;

    public Contract(String facebook, long mobile, String linkedin) {
        this.facebook = facebook;
        this.mobile = mobile;
        this.linkedin = linkedin;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "facebook='" + facebook + '\'' +
                ", mobile=" + mobile +
                ", linkedin='" + linkedin + '\'' +
                '}';
    }
}
