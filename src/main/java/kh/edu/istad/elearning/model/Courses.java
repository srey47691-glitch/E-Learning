package kh.edu.istad.elearning.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" ,nullable = false)
    private Integer id;
    @Column(name = "Count_Rating")
    private Integer CountRating;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false,length = 255)
    private String description;

    @Column(nullable = false)
    private Float DiscountPercent;

    @Column(nullable = false)
    private boolean isDeleted;

    @Column(nullable = false)
    private boolean isPublished;

    @Column(nullable = false,length = 255)
    private String keyword;

    @Column(nullable = false,length = 255)
    private String Level;

    @Column(nullable = false)
    private Integer Price;

    @Column(nullable = false,length = 255)
    private String slug;

    @Column(nullable = false)
    private Float starRating;

    @Column(nullable = false,length = 255)
    private String thumbnail;

    @Column(nullable = false,length = 255)
    private String title;

    @Column(nullable = false)
    private Float totalHours;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private Integer categoryId;

    @Column(nullable = false,length = 255)
    private String instructorId;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Instructor_profile instructor_profile;

    @OneToMany(mappedBy = "Course")
    private List<enrollment>enrollments;

    @ManyToOne
    private List<Videos> videos;

}
