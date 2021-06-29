package HrmManagement.Resume;

public class Education {
    private Certificate certificate;
    private double GPA;
    private int passYear;

    public Education(Certificate certificate, double GPA, int passYear) {
        this.certificate = certificate;
        this.GPA = GPA;
        this.passYear = passYear;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getPassYear() {
        return passYear;
    }

    public void setPassYear(int passYear) {
        this.passYear = passYear;
    }

    @Override
    public String toString() {
        return "Education{" +
                "certificate=" + certificate +
                ", GPA=" + GPA +
                ", passYear=" + passYear +
                '}';
    }
}
