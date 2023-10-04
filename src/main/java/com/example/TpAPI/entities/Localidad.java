package com.example.TpAPI.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "Localidad")
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Getter
@Setter
public class Localidad extends Base {

    @Column(name="denominacion")
    private String denominacion;
}
