package com.egartech.course.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "documents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Название
     */
    @Column(name = "title")
    private String title;

    /**
     * Серия документа
     */
    @Column(name = "series", length = 10)
    private String series;

    /**
     * Номер документа
     */
    @Column(name = "numeral", length = 30)
    private String numeral;

    /**
     * Комментарий
     */
    @Column(name = "description", columnDefinition = "text")
    private String description;
}


