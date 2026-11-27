package kh.edu.istad.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class student_Profiles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private String userId;

    @Column(nullable = false,length = 255)
    private String Biography;

    @Column(nullable = false,unique = true,length = 255)
    private String FacebookLink;

    @Column(nullable = false,unique = true,length = 255)
    private String GithubLink;

    @Column(nullable = false,length = 255)
    private String Major;

    @Column(nullable = false,unique = true,length=255)
    private String PhoneNumber;

    @Column(nullable = false,length = 255)
    private String University;
    @OneToMany(mappedBy = "student_Profiles")
    private List<enrollment> enrollment;
}
