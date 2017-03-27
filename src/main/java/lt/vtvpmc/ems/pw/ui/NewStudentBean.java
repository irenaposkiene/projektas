package lt.vtvpmc.ems.pw.ui;

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

   

	@Transactional
    public String save() {
        Student student = new Student(studentFirstName, studentLastName, studentBirthday);
        entityManager.persist(student);
        return "main";
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
