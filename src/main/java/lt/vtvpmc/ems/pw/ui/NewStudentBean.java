package lt.vtvpmc.ems.pw.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lt.vtvpmc.ems.pw.entities.Student;
import org.springframework.transaction.annotation.Transactional;

public class NewStudentBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    private String studentFirstName;
    private String studentLastName;
    private String studentBirthday;
  
    private String studentAdress;
    private String studentPhone;
    	
   

	private String studentEmail;
    private String [] studentEducation;
    private String studentSchool;
    private String studentSchoolEndDate;
    private String studentFamilyState;
    
    List<String> studentLocation;
    
    
   
	@Transactional
    public String save() {
        Student student = new Student(studentFirstName, studentLastName, studentBirthday, studentAdress, studentPhone, studentEmail,studentEducation, studentSchool, studentSchoolEndDate, studentFamilyState );
        entityManager.persist(student);
        return "main";
    }
	
	 public EntityManager getEntityManager() {
			return entityManager;
		}

		public void setEntityManager(EntityManager entityManager) {
			this.entityManager = entityManager;
		}
	
	public String getStudentAdress() {
		return studentAdress;
	}

	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String[] getStudentEducation() {
		return studentEducation;
	}

	public void setStudentEducation(String[] studentEducation) {
		this.studentEducation = studentEducation;
	}

	public String getStudentSchool() {
		return studentSchool;
	}

	
    
    public String getStudentSchoolEndDate() {
		return studentSchoolEndDate;
	}

	public void setStudentSchoolEndDate(String studentSchoolEndDate) {
		this.studentSchoolEndDate = studentSchoolEndDate;
	}

	public String getStudentFamilyState() {
		return studentFamilyState;
	}

	public void setStudentFamilyState(String studentFamilyState) {
		this.studentFamilyState = studentFamilyState;
	}

	public List<String> getStudentLocation() {
		return studentLocation;
	}

	public void setStudentLocation(List<String> studentLocation) {
		this.studentLocation = studentLocation;
	}

	public void setStudentSchool(String studentSchool) {
		this.studentSchool = studentSchool;
	}

	public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentBirthday() {
		return studentBirthday;
	}

	public void setStudentBirthday(String studentBirthday) {
		this.studentBirthday = studentBirthday;
	}
}
