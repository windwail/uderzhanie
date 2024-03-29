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
@Table(name = "RULE")
public class Rule {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_rule_id")
    @SequenceGenerator(name = "seq_rule_id", sequenceName = "seq_rule_id", allocationSize = 1)
    private Long id;
}
