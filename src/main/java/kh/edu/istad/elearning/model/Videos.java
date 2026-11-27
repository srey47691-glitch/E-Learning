package kh.edu.istad.elearning.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Videos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Integer id;

    @Column(nullable = false,length = 255)
    private String Duration;

    @Column(nullable = false)
    private boolean isDeleted;

    @Column(nullable = false)
    private boolean IsPublished;

    @Column(nullable = false,unique = true,length = 255)
    private String Slug;

    @Column(nullable = false,unique = false, length = 255)
    private String Thumbnail;

    @Column(nullable = false,unique = true,length = 255)
    private String Title;

    @Column(nullable = false,length = 255)
    private String Youtube;

    @Column(nullable = false,unique = true)
    private Integer courseId;
}
