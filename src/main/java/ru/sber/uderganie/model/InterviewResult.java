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
@Table(name = "INTERVIEW_RESULT")
public class InterviewResult {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_interview_result_id")
    @SequenceGenerator(name = "seq_interview_result_id", sequenceName = "seq_interview_result_id", allocationSize = 1)
    private Long id;
}
