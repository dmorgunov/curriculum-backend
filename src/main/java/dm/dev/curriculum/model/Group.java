package dm.dev.curriculum.model;

import lombok.Data;

@Data
public class Group {
    private int id;
    private String code;
    private String name;
    private int year;
    private int curriculumId;
    private int departmentId;
    private int specialtyId;
    private Department department;
    private Curriculum curriculum;
    private Specialty specialty;

}