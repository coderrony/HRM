package Hrm.Resume;

public class Resume {
    Certificate certificate;
     Skrill skrill;

    public Resume(Certificate certificate, Skrill skrill) {
        this.certificate = certificate;
        this.skrill = skrill;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Skrill getSkrill() {
        return skrill;
    }

    public void setSkrill(Skrill skrill) {
        this.skrill = skrill;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "certificate=" + certificate +
                ", skrill=" + skrill +
                '}';
    }
}
