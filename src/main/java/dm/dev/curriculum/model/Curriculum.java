package dm.dev.curriculum.model;

import lombok.Data;

@Data
public class Curriculum {
    private int id;
    private String name;
    private int year;
    private String file_url;
    private String approvementUrl;
    private int specialty_id;
    private Specialty specialty;

}
