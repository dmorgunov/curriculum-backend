package dm.dev.curriculum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "curriculums")
public class Curriculum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer year;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "approvement_url")
    private String approvementUrl;

    @Column(name = "specialty_id")
    private Long specialtyId;
}
