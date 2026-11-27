package kh.edu.istad.elearning.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="icon" , length = 255)
    private String icon;

    @Column(name="isDeleted" ,nullable = false)
    private boolean isDeleted;

    @Column(unique = true,nullable = false,length = 50)
    private String name;

    @OneToMany(mappedBy = "Category")
    private List<Courses> courses;




}
