package com.egartech.course.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "doc_type")
@AllArgsConstructor
@NoArgsConstructor
public class PersonDocType implements Serializable {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Integer id;
    /**
     * Код
     */
    @Column(name = "code")
    private String code;

    /**
     * Наименование
     */
    @Column(name = "name", length = 250)
    private String name;
}
