package Entities;

public class Company {
    private Integer companyId;
    private String companyName;
    private String companyOwnerFName;
    private String companyOwnerLName;
    private String companyOwnerEmail;
    private String companyOwnerPhone;

    public Company(Integer companyId, String companyName, String companyOwnerFName, String companyOwnerLName, String companyOwnerEmail, String companyOwnerPhone) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyOwnerFName = companyOwnerFName;
        this.companyOwnerLName = companyOwnerLName;
        this.companyOwnerEmail = companyOwnerEmail;
        this.companyOwnerPhone = companyOwnerPhone;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyOwnerFName() {
        return companyOwnerFName;
    }

    public void setCompanyOwnerFName(String companyOwnerFName) {
        this.companyOwnerFName = companyOwnerFName;
    }

    public String getCompanyOwnerLName() {
        return companyOwnerLName;
    }

    public void setCompanyOwnerLName(String companyOwnerLName) {
        this.companyOwnerLName = companyOwnerLName;
    }

    public String getCompanyOwnerEmail() {
        return companyOwnerEmail;
    }

    public void setCompanyOwnerEmail(String companyOwnerEmail) {
        this.companyOwnerEmail = companyOwnerEmail;
    }

    public String getCompanyOwnerPhone() {
        return companyOwnerPhone;
    }

    public void setCompanyOwnerPhone(String companyOwnerPhone) {
        this.companyOwnerPhone = companyOwnerPhone;
    }
}
