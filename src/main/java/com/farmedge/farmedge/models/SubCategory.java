package com.farmedge.farmedge.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subCategory")
public class SubCategory {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long ID;
        @Column(nullable = false, unique = true)
        private String name;
        private String description;

        @ManyToOne
        @JoinColumn(name = "categoryId")
        private Category category;
}
