package org.perso.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complex_object")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComplexObjectEntity {

    @Id
    @GeneratedValue
    int id;

    String lbl;
    String commentaire;
}
