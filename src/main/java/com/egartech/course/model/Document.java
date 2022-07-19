package com.egartech.course.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "documents")
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

    /**
     * Тип документа удостоверяющего личность
     */
    @JoinColumn(name = "type_code", referencedColumnName = "code", foreignKey = @ForeignKey(name = "type_code_key"))
    @ManyToOne
    private PersonDocType typeCode;

    @ManyToOne()
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;
}


