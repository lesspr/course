package com.egartech.course.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "persons")
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "Обязательное поле")
    @Column(name = "first_name", length = 150)
    @Size(min = 10, max = 100, message = "Введите название, минимум 10 символов, максимум 150")
    private String firstName;

    @Column(name = "last_name", length = 150)
    private String lastName;

    @Column(name = "middle_name", length = 150)
    private String middleName;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "email")
    private String email;

    @Enumerated(EnumType.ORDINAL)
    @ColumnDefault("1")
    @Column(name = "gender")
    private GenderType genderType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person", cascade = CascadeType.ALL)
    private List<Document> documents = new java.util.ArrayList<>();

    public enum GenderType {
        FEMALEE             {@Override public String toString() { return  "женский";}},   // 0
        MALE                {@Override public String toString() { return  "мужской";}}    // 1
    }

    public String getFullName(){
        return lastName + " " + firstName + " " + middleName ;
    }
}
