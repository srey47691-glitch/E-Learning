package kh.edu.istad.elearning.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Primary;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="enrollments")
public class  enrollment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(nullable = false,unique = true)
    private Integer id;
    @Column(nullable = false)
    private LocalDateTime enrolledAt;

    @Column(nullable = false)
    private LocalDateTime paymentAt;


    @Column(nullable = false, unique = true,length =255 )
    private String paymentMethod;

    @Column(nullable = false)
    private boolean paymentStaus;

    @Column(nullable = false)
    private Integer CourseId;

    @Column(nullable = false,length = 255)
    private String StudentId;

    @ManyToOne
    private student_Profiles studentProfiles;

    @ManyToOne
    private Courses Courses;


}
