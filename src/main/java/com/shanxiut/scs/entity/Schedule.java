package com.shanxiut.scs.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by hliu on 2019/3/9.
 * 排课表实体类
 */
@Data
@Entity
@Table(name = "scs_schedule")
public class Schedule extends SuperEntity<Schedule>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;

    private String time;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
    @JoinColumn(name="course_id",referencedColumnName = "id")
    private Course course;

    @ManyToOne
    private Teacher teacher;

    @ManyToMany(cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    @JoinTable( joinColumns = @JoinColumn(name = "schedule_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id",referencedColumnName = "id") )
    private List<Student> students;

}
