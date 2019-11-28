package ru.sber.uderganie.model;

import lombok.*;

import javax.persistence.*;

@Data
@ToString
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "EFFECTIVENESS")
public class Effectiveness {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_key_skill_id")
    @SequenceGenerator(name = "seq_key_skill_id", sequenceName = "seq_key_skill_id", allocationSize = 1)
    private Long id;

    public Effectiveness(String name) {
        this.name = name;
    }

    private String name;
}
