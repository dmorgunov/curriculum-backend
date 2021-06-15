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
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private String name;

    @Column
    private Integer year;

    @Column
    private Integer curriculumId;

    @Column
    private Integer departmentId;

    @Column
    private Integer specialtyId;

    @Column
    private Department department;

    @Column
    private Curriculum curriculum;

    @Column
    private Specialty specialty;
}