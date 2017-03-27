package lt.vtvpmc.ems.pw.entities;

public class StudentFeatures {


    private String adress;
    private String location;
    private String phone;
    private String email;
    private String education;
    private String school;
    private String schoolEndDate;
    private String familyState;
    
    public StudentFeatures(String adress, String location, String phone, String email, String education, String school, String schoolEndDate, String familyState) {
        this.adress = adress;
        this.location= location;
        this.phone = phone;
        this.email = email;
        this.familyState = familyState;
        this.school = school;
        this.schoolEndDate = schoolEndDate;
        this.education = education;
        		
        
    }

    public StudentFeatures() {
    }

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchoolEndDate() {
		return schoolEndDate;
	}

	public void setSchoolEndDate(String schoolEndDate) {
		this.schoolEndDate = schoolEndDate;
	}

	public String getFamilyState() {
		return familyState;
	}

	public void setFamilyState(String familyState) {
		this.familyState = familyState;
	}

  
    
}
