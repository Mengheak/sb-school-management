package com.example.school_management.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String studentId;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    private String gender;

    private String address;

    @Column(name = "parent_name")
    private String parentName;

    @Column(name = "parent_phone")
    private String parentPhone;

    @Column(name = "enrollment_date")
    private LocalDate enrollmentDate;

    @Enumerated(EnumType.STRING)
    private StudentStatus studentStatus = StudentStatus.ACTIVE;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn("class_id")
//    private SchoolClass schoolClass;


//    @ManyToMany(mappedBy = "students")
//    private List<Course> courses = new ArrayList<>();
//
//    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
//    private List<Grade> grades = new ArrayList<>();

    public enum StudentStatus {
        ACTIVE, INACTIVE, GRADUATED, TRANSFERRED
    }
}
