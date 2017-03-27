package lt.vtvpmc.ems.pw.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Student implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String firstName;
    private String lastName;
    
    private String birthday;
    

    private String adress;
    	
    private String town;
    
   

	private String phone;
    private String email;
    private String [] education;
    private String school;
    private String schoolEndDate;
    private String familyState;
    
    
    List<String> location;
    

    public Student(String firstName, String lastName, String birthday, String adress, String phone, String email, String[] education, String school, String schoolEndDate, String familyState) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday =birthday;
        this.adress = adress;
        
        this.phone = phone;
        this.email = email;
        this.familyState = familyState;
        this.school = school;
        this.schoolEndDate = schoolEndDate;
        this.education = education;
        location = new ArrayList<>();
		
    	location.add("Vilniaus");
    	location.add("Kauno");
    	location.add("Klaipėdos");
    	location.add("Panevėžio");
    	location.add("Šiaulių");		
    	location.add("Alytaus");
    	
        
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public List<String> getlocation() {
		return location;
	}
	
	

    public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}
	
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
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

	public String[] getEducation() {
		return education;
	}

	public void setEducation(String[] education) {
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
