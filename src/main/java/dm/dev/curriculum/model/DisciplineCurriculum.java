package dm.dev.curriculum.model;

import lombok.Data;

@Data
public class DisciplineCurriculum {

    private int disciplineId;
    private int curriculumId;
    private int hours;
    private int auditHours;
    private int labHours;
    private int lecHours;
    private int practiceHours;
    private int independentWorkHours;
    private int credits;
    private boolean hasExam;
    private boolean hasCredit;
    private String individualTaskType;
    private int semester;
    private String block;
    private String fileUrl;
    private Discipline discipline;
    private Curriculum curriculum;

}
