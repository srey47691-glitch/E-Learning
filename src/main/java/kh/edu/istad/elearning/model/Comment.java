package kh.edu.istad.elearning.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "Comments")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime CreatedAt;

    @Column(nullable = false)
    private boolean IsDeleted;

    @Column(nullable = false,length = 255)
    private String Text;

    @Column(nullable = false)
    private Integer ParentId;

    @Column(nullable = false)
    private Integer VideoId;

    @
}
