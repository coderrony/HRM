package HrmManagement.Resume;

public class Resume {
    private Contract contract;
    private Skrill skrill;
    private Education education;

    public Resume(Contract contract, Skrill skrill, Education education) {
        this.contract = contract;
        this.skrill = skrill;
        this.education = education;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Skrill getSkrill() {
        return skrill;
    }

    public void setSkrill(Skrill skrill) {
        this.skrill = skrill;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "contract=" + contract +
                ", skrill=" + skrill +
                ", education=" + education +
                '}';
    }
}
