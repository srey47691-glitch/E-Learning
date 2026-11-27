package kh.edu.istad.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Instructor_profiles")
public class Instructor_profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private String userId;

    @Column(nullable = false,length = 255)
    private String Biograhy;

    @Column(nullable = false,unique = true,length = 255)
    private String facebookLink;

    @Column(nullable = false,unique = true,length = 255)
    private String GithubLink;

    @Column(nullable = false,length = 255)
    private String jobTitle;

    @Column(nullable = false,unique = true,length = 255)
    private String PhoneNumber;




}
