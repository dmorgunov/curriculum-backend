package dm.dev.curriculum.model;

import lombok.Data;

@Data
public class Department {
    private int id;
    private String code;
    private String name;
    private String shortName;
    private int facultyId;
    private Faculty faculty;

}
