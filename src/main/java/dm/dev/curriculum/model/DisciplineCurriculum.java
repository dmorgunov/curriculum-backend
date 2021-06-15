package dm.dev.curriculum.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

//@Data
//@Entity
//@Table(name = "discipline_curriculums")
public class DisciplineCurriculum {

    private Long disciplineId;
    private Long curriculumId;
    private Integer hours;
    private Integer auditHours;
    private Integer labHours;
    private Integer lecHours;
    private Integer practiceHours;
    private Integer independentWorkHours;
    private Integer credits;
    private Boolean hasExam;
    private Boolean hasCredit;
    private String individualTaskType;
    private Integer semester;
    private String block;
    private String fileUrl;
    private Discipline discipline;
    private Curriculum curriculum;

}
